package com.poli.proyecto.BackendPCS.Service;

import com.poli.proyecto.BackendPCS.Data.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class BackendService {

    private JdbcTemplate jdbcTemplate;

    public BackendService() {
        this.jdbcTemplate = new JdbcTemplate(this.Conectar());
    }

    public DriverManagerDataSource Conectar() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/Prueba");
        dataSource.setUsername("root");
        return dataSource;
    }

    public List validateLogin(Login usuario) {
        String query = "select User,Type from Login where User=" + "'" + usuario.getUser() + "'" + " and " + "Password=" + "'" + usuario.getPassword() + "'";
        List login = jdbcTemplate.queryForList(query);
        System.out.println("Resultado Login " + login);
        return login;
    }

    public List getAllPadres(){
        String query = "select * from Padre";
        List padres = jdbcTemplate.queryForList(query);
        System.out.println("Resultado Padres " + padres);
        return padres;
    }

    public List getAllEntrenadores() {
        String query = "select * from Entrenador";
        List entrenadores = jdbcTemplate.queryForList(query);
        System.out.println("Resultado Entrenadores " + entrenadores);
        return entrenadores;
    }

    public List getBestEntrenadores() {
        String query = "select * from Entrenador where Calificacion >= 4";
        List entrenadores = jdbcTemplate.queryForList(query);
        System.out.println("Resultado Entrenadores " + entrenadores);
        return entrenadores;
    }

    public List getAllDeportes(){
        String query = "select * from Deporte";
        List deportes = jdbcTemplate.queryForList(query);
        System.out.println("Resultado Deportes " + deportes);
        return deportes;
    }

    public List getAllEstudiantes(){
        String query = "select * from Estudiante where Estudiante.Estado = 'Matriculado'";
        List estudiantes = jdbcTemplate.queryForList(query);
        System.out.println("Resultado Estudiantes " + estudiantes);
        return estudiantes;
    }

    public List getBestEstudiantes() {
        String query = "select * from Estudiante where Calificacion >= 4";
        List estudiantes = jdbcTemplate.queryForList(query);
        System.out.println("Resultado Entrenadores " + estudiantes);
        return estudiantes;
    }

    public List getAllHorarios() {
        String query = "select * from Horario";
        List horarios = jdbcTemplate.queryForList(query);
        System.out.println("Resultado Horarios " + horarios);
        return horarios;
    }

    public List getHorario(String codigoDeporte) {
        String query = "select * from Horario where Horario.Deporte_Codigo = " + "'" + codigoDeporte + "'";
        List horarios = jdbcTemplate.queryForList(query);
        System.out.println("Resultado Horario " + horarios);
        return horarios;
    }

    public void addDeporte(Deporte deporte) {
        try {

            System.out.println("Deporte : " + deporte.toString());

            if (deporte.getIdEntrenador() == null) {
                deporte.setIdEntrenador("0");
            }

            String query = "INSERT INTO Deporte (`Codigo`,`Nombre`,`Tipo`,`Costo`,`Entrenador_CodigoEntrenador`) VALUES ("
                    + "'" + deporte.getCodigo() + "'" + ","
                    + "'" + deporte.getNombre() + "'" + ","
                    + "'" + deporte.getTipo() + "'" + ","
                    + "'" + deporte.getCosto() + "'" + ","
                    + "'" + deporte.getIdEntrenador() + "'" + ")";

            System.out.println("Add Reporte Query" + query);

            jdbcTemplate.execute(query);
        } catch (Exception e) {
            System.out.println( "Error:" + e.getMessage());
        }
    }

    public void addEstudiante(Estudiante estudiante) {
        try {

            System.out.println("Estudiante : " + estudiante.toString());

            String query = "INSERT INTO Estudiante (`CodigoEntrenador`,`Nombre`,`Cedula`,`Telefono`,`Direccion`,`Calificacion`,`Estado`,Pago) VALUES ("
                    + "'" + estudiante.getCodigoEntrenador() + "'" + ","
                    + "'" + estudiante.getNombre() + "'" + ","
                    + "'" + estudiante.getCedula() + "'" + ","
                    + "'" + estudiante.getTelefono() + "'" + ","
                    + "'" + estudiante.getDireccion() + "'" + ","
                    + "" + estudiante.getCalificacion() + "" + ","
                    + "'" + estudiante.getEstado() + "'" + ","
                    + "" + estudiante.isPago() + "" + ")";

            System.out.println("Add Estudiante Query" + query);

            jdbcTemplate.execute(query);
        } catch (Exception e) {
            System.out.println( "Error:" + e.getMessage());
        }
    }

    public void addEntrenador(Entrenador entrenador) {
        try {

            System.out.println("Entrenador : " + entrenador.toString());

            String query = "INSERT INTO Entrenador (`CodigoEntrenador`,`Nombre`,`Cedula`,`Telefono`,`Direccion`,`Calificacion`,`Nit`) VALUES ("
                    + "'" + entrenador.getCodigoEntrenador() + "'" + ","
                    + "'" + entrenador.getNombre() + "'" + ","
                    + "'" + entrenador.getCedula() + "'" + ","
                    + "'" + entrenador.getTelefono() + "'" + ","
                    + "'" + entrenador.getDireccion() + "'" + ","
                    + "" + entrenador.getCalificacion() + "" + ","
                    + "'" + entrenador.getNit() + "'" + ")";

            System.out.println("Add Entrenador Query" + query);

            jdbcTemplate.execute(query);
        }  catch (Exception e) {
            System.out.println( "Error:" + e.getMessage());
        }
    }

    public void deleteEntrenador(String codigoEntrenador) {
        try {
            String query = "delete from Entrenador where Entrenador.CodigoEntrenador = " + "'" + codigoEntrenador + "'";

            System.out.println("Delete Entrenador Query" + query);

            jdbcTemplate.execute(query);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public void addHorario(Horario horario) {
        try {

            if (horario.getCodigoEntrenador() == null) {
                horario.setCodigoEntrenador("12343456");
            }


            String query = "INSERT INTO Horario values ("
                    + "'" + horario.getCodigoHorario() + "'" + ","
                    + "'" + horario.getHorario() + "'" + ","
                    + "'" + horario.getCodigoDeporte() + "'" + ","
                    + "'" + horario.getCodigoEntrenador() + "'" + ")";

            System.out.println("Add Horario Query" + query);

            jdbcTemplate.execute(query);
        } catch (Exception e) {
            System.out.println( "Error:" + e.getMessage());
        }
    }

    public void deleteHorario(String codigoHorario) {
        try {
            String query = "delete from Horario where Horario.CodigoHorario = " + "'" + codigoHorario + "'";

            System.out.println("Delete Horario Query" + query);

            jdbcTemplate.execute(query);
        }  catch (Exception e) {
            System.out.println( "Error:" + e.getMessage());
        }
    }


    public void actHorario(Horario horario) {
        try {

            if (horario.getCodigoEntrenador() == null) {
                horario.setCodigoEntrenador("12343456");
            }


            String query = "UPDATE Horario set "
                    + "CodigoHorario = '" + horario.getCodigoHorario() + "'" + ","
                    + "Horario = '" + horario.getHorario() + "'" + ","
                    + "Deporte_Codigo = '" + horario.getCodigoDeporte() + "'" + ","
                    + "Deporte_Entrenador_CodigoEntrenador = '" + horario.getCodigoEntrenador() + "'"
                    + " where CodigoHorario = '"+horario.getCodigoHorario()+"'";

            System.out.println("Actualizar Horario Query" + query);

            jdbcTemplate.execute(query);
        }  catch (Exception e) {
            System.out.println( "Error:" + e.getMessage());
        }
    }

    public void actEntrenador(Entrenador entrenador) {
        try {

            if (entrenador.getCodigoEntrenador() == null) {
                entrenador.setCodigoEntrenador("12343456");
            }


            String query = "UPDATE Entrenador set "
                    + "Nombre = '" + entrenador.getNombre() + "',"
                    + "Cedula = '" + entrenador.getCedula() + "',"
                    + "Telefono = '" + entrenador.getTelefono()+ "',"
                    + "Direccion = '" + entrenador.getDireccion() + "',"
                    + "Nit = '" + entrenador.getNit() + "',"
                    + "Calificacion = " + entrenador.getCalificacion()
                    + " where CodigoEntrenador ='"+entrenador.getCodigoEntrenador()+"'";

            System.out.println("Actualizar Entrenador Query" + query);

            jdbcTemplate.execute(query);
        }  catch (Exception e) {
            System.out.println( "Error:" + e.getMessage());
        }
    }

}
