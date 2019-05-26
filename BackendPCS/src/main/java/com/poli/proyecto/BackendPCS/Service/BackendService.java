package com.poli.proyecto.BackendPCS.Service;

import com.poli.proyecto.BackendPCS.Data.Deporte;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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


    public String addDeporte(Deporte deporte) {
        String query = "Insert into Deporte (Codigo,Tipo,costo) values ("
                + deporte.getCodigo() + ","
                + deporte.getTipo() + ","
                + deporte.getCosto() + ");";
        try {
            jdbcTemplate.execute(query);
            return "Guardado exitoso";
        } catch (Exception e) {
            return "Error : "+e.getMessage();
        }
    }
}
