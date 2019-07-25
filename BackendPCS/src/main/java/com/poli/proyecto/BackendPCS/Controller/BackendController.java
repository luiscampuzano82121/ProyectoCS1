package com.poli.proyecto.BackendPCS.Controller;

import com.poli.proyecto.BackendPCS.Data.*;
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

    @GetMapping("/Horarios")
    public List getHorarios() {
        return backendService.getAllHorarios();
    }

    @PostMapping(value = "/Deportes")
    public void addDeporte(@RequestBody Deporte deporte) {
        backendService.addDeporte(deporte);

    }

    @PostMapping(value = "/Estudiantes")
    public void addEstudiante(@RequestBody Estudiante estudiante) {
        backendService.addEstudiante(estudiante);
    }

    @PostMapping(value = "/Entrenadores")
    public void addEntrenador(@RequestBody Entrenador entrenador) {
        backendService.addEntrenador(entrenador);
    }

    @PostMapping(value = "/Login")
    public List validateLogin(@RequestBody Login login) {
        return backendService.validateLogin(login);
    }

    @GetMapping(value = "/Horarios/{codigoDeporte}")
    public List getHorarios(@PathVariable String codigoDeporte) {
        return backendService.getHorario(codigoDeporte);
    }

    @GetMapping(value = "/delHorario/{codigoHorario}")
    public void deleteHorario(@PathVariable String codigoHorario) {
        backendService.deleteHorario(codigoHorario);
    }

    @PostMapping(value = "/addHorario")
    public void addHorario(@RequestBody Horario horario) {
        backendService.addHorario(horario);
    }

    @PostMapping(value = "/actHorario")
    public void actHorario(@RequestBody Horario horario) {
        backendService.actHorario(horario);
    }

    @GetMapping(value = "/delEntrenador/{codigoEntrenador}")
    public void deleteEntrenador(@PathVariable String codigoEntrenador) {
        backendService.deleteEntrenador(codigoEntrenador);
    }

    @PostMapping(value = "/actEntrenador")
    public void actEntrenador(@RequestBody Entrenador entrenador) {
        backendService.actEntrenador(entrenador);
    }

    @GetMapping("/mejorEstudiantes")
    public List getBestEstudiantes() {
        return backendService.getBestEstudiantes();
    }

    @GetMapping("/mejorEntrenadores")
    public List getBestEntrenadores() {
        return backendService.getBestEntrenadores();
    }

    @GetMapping("/Categoria/{idDeporte}")
    public List getCategoriaDeportes(@PathVariable String idDeporte){
        return backendService.getCategory(idDeporte);
    }

    @GetMapping("/RecuperarContrasena/{usuario}")
    public List recoverPassword(@PathVariable String usuario){
        return backendService.recoverPassword(usuario);
    }

    @GetMapping("/Estudiantes/{idDeporte}")
    public List estudiantesDeporte(@PathVariable String idDeporte){
        return backendService.getEstudiantesDeporte(idDeporte);
    }
}
