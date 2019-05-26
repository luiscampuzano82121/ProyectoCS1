package com.poli.proyecto.BackendPCS.Service;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class BackendService {

    public DriverManagerDataSource Conectar() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/AdministradorDeportes");
        dataSource.setUsername("root");
        return dataSource;
    }



}
