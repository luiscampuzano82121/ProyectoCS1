package com.poli.proyecto.BackendPCS.Controller;

import com.poli.proyecto.BackendPCS.Service.BackendService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/home")
public class BackendController {

    private JdbcTemplate jdbcTemplate;

    public BackendController() {
        BackendService con = new BackendService();
        this.jdbcTemplate = new JdbcTemplate(con.Conectar());
    }

    @GetMapping("/HolaMundo")
    public String HolaMundo(){
        return "Hola mundo";
    }

    @GetMapping("/Estudiantes")
    public List getEstudiantes(){
        String query = "select * from Estudiante";
        List estudiantes = jdbcTemplate.queryForList(query);
        return estudiantes;
    }

    @GetMapping("/Entrenadores")
    public List getEntrenadores(){
        String query = "select * from Entrenador";
        List entrenadores = jdbcTemplate.queryForList(query);
        return entrenadores;
    }

    @GetMapping("/Padres")
    public List getPadres(){
        String query = "select * from Padre";
        List padres = jdbcTemplate.queryForList(query);
        return padres;
    }

}
