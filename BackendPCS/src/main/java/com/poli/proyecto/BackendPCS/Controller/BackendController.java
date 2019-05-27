package com.poli.proyecto.BackendPCS.Controller;

import com.poli.proyecto.BackendPCS.Data.Deporte;
import com.poli.proyecto.BackendPCS.Data.Entrenador;
import com.poli.proyecto.BackendPCS.Data.Estudiante;
import com.poli.proyecto.BackendPCS.Service.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping(path = "/home")
public class BackendController {

    private JdbcTemplate jdbcTemplate;

    BackendService backendService = new BackendService();

    public BackendController() {
        BackendService con = new BackendService();
        this.jdbcTemplate = new JdbcTemplate(con.Conectar());
    }

    @GetMapping("/HolaMundo")
    public String HolaMundo() {
        return "Hola mundo";
    }

    @GetMapping("/Estudiantes")
    public List getEstudiantes() {
        return backendService.getAllEstudiantes();
    }

    @GetMapping("/Entrenadores")
    public List getEntrenadores() {
        return backendService.getAllEntrenadores();
    }

    @GetMapping("/Padres")
    public List getPadres() {
        String query = "select * from Padre";
        List padres = jdbcTemplate.queryForList(query);
        return padres;
    }

    @GetMapping("/Deportes")
    public List getDeportes() {
        return backendService.getAllDeportes();
    }

    @PostMapping(value = "/Deportes")
    public String addDeporte(@RequestBody Deporte deporte) {
        return backendService.addDeporte(deporte);

    }

    @PostMapping(value = "/Estudiantes")
    public String addEstudiante(@RequestBody Estudiante estudiante) {
        return backendService.addEstudiante(estudiante);
    }

    @PostMapping(value = "/Entrenadores")
    public String addEntrenador(@RequestBody Entrenador entrenador) {
        return backendService.addEntrenador(entrenador);
    }

}
