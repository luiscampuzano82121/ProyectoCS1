package com.poli.proyecto.BackendPCS.Controller;

import com.poli.proyecto.BackendPCS.Data.Deporte;
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

    private BackendService backendService;

    Deporte deporte;

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
        String query = "select * from Estudiante";
        List estudiantes = jdbcTemplate.queryForList(query);
        return estudiantes;
    }

    @GetMapping("/Entrenadores")
    public List getEntrenadores() {
        String query = "select * from Entrenador";
        List entrenadores = jdbcTemplate.queryForList(query);
        return entrenadores;
    }

    @GetMapping("/Padres")
    public List getPadres() {
        String query = "select * from Padre";
        List padres = jdbcTemplate.queryForList(query);
        return padres;
    }

    @GetMapping("/Deportes")
    public List getDeportes() {
        String query = "select * from Deporte";
        List deportes = jdbcTemplate.queryForList(query);
        System.out.println("Deportes: "+deportes);
        return deportes;
    }

    @PostMapping(value = "/Deportes")
    public void addDeporte(@RequestBody Deporte deporte) {
        try {

            System.out.println("Deporte : "+deporte.toString());

            String query = "INSERT INTO Deporte (`Codigo`,`Tipo`,`costo`) VALUES ("
                    + "`" + deporte.getCodigo() + "`" + ","
                    + "`" + deporte.getTipo() + "`" + ","
                    + "`" + deporte.getCosto() + "`" + ")";

           //String query = "INSERT INTO `Deporte`(`Codigo`,`Tipo`,`Costo` ) VALUES (\"123\",\"Grupal\",\"500000\")";

            jdbcTemplate.execute(query);
            //return jdbcTemplate.execute(query);
            //return deporte;
        } catch (Exception e) {
            //return deporte;
        }
    }

}
