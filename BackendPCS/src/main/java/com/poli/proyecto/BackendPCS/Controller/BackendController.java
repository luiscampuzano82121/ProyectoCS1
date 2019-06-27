package com.poli.proyecto.BackendPCS.Controller;

import com.poli.proyecto.BackendPCS.Data.Deporte;
import com.poli.proyecto.BackendPCS.Data.Entrenador;
import com.poli.proyecto.BackendPCS.Data.Estudiante;
import com.poli.proyecto.BackendPCS.Data.Login;
import com.poli.proyecto.BackendPCS.Service.BackendService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping(path = "/home")
public class BackendController {

    //Controller que recibe las peticiones

    BackendService backendService = new BackendService();

    public BackendController() {
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
        return backendService.getAllPadres();
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

    @PostMapping(value = "/login")
    public List validateLogin(@RequestBody Login login) {

        return backendService.validateLogin(login);
    }

}
