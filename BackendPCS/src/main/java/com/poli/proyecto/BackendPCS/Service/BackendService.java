package com.poli.proyecto.BackendPCS.Service;

import com.poli.proyecto.BackendPCS.Data.Deporte;
import com.poli.proyecto.BackendPCS.Data.Entrenador;
import com.poli.proyecto.BackendPCS.Data.Estudiante;
import com.poli.proyecto.BackendPCS.Data.Login;
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
        dataSource.setUrl("jdbc:mysql://localhost:3306/AdministradorDeportes");
        dataSource.setUsername("root");
        return dataSource;
    }

    public List validateLogin(Login usuario) {
        String query = "select Type from Login where User=" + "'" + usuario.getUser() + "'" + " and " + "Password=" + "'" + usuario.getPassword() + "'";
        List login = jdbcTemplate.queryForList(query);
        return login;
    }

    public List getAllPadres(){
        String query = "select * from Padre";
        List padres = jdbcTemplate.queryForList(query);
        return padres;
    }

    public List getAllEntrenadores() {
        String query = "select * from Entrenador";
        List entrenadores = jdbcTemplate.queryForList(query);
        return entrenadores;
    }

    public List getAllDeportes(){
        String query = "select * from Deporte";
        List deportes = jdbcTemplate.queryForList(query);
        System.out.println("Deportes: " + deportes);
        return deportes;
    }

    public List getAllEstudiantes(){
        String query = "select * from Estudiante";
        List estudiantes = jdbcTemplate.queryForList(query);
        return estudiantes;
    }

    public String addDeporte(Deporte deporte) {
        try {

            System.out.println("Deporte : " + deporte.toString());

            String query = "INSERT INTO Deporte (`Codigo`,`Nombre`,`Tipo`,`costo`) VALUES ("
                    + "'" + deporte.getCodigo() + "'" + ","
                    + "'" + deporte.getNombre() + "'" + ","
                    + "'" + deporte.getTipo() + "'" + ","
                    + "'" + deporte.getCosto() + "'" + ")";

            jdbcTemplate.execute(query);
            return "Operacion Exitosa";
        } catch (Exception e) {
            return "Error:" + e.getMessage();
        }
    }

    public String addEstudiante(Estudiante estudiante) {
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

            jdbcTemplate.execute(query);
            return "Operacion Exitosa";
        } catch (Exception e) {
            return "Error:" + e.getMessage();
        }
    }

    public String addEntrenador(Entrenador entrenador) {
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

            jdbcTemplate.execute(query);
            return "Guardado Exitoso";
        } catch (Exception e) {
            return "Error:" + e.getMessage();
        }
    }
}
