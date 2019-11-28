package com.poli.proyecto.BackendPCS;

import com.poli.proyecto.BackendPCS.Data.Deporte;
import com.poli.proyecto.BackendPCS.Data.Login;
import com.poli.proyecto.BackendPCS.Service.BackendService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendPcsApplicationTests {

    @Autowired
    BackendService service;

    @Before
    public void before() {

    }

    @After
    public void after() {

    }

    @Test
    public void testValidateLogin() {
        String user = "admin";
        String password = "123456";
        Login login = new Login(user, password);
        service.validateLogin(login);
        assertNotNull(login);
    }

	@Test
	public void testValidateLoginError() {
		String user = "admin";
		String password = "123";
		Login login = new Login(user, password);
		service.validateLogin(login);
		assertNotNull(login);
	}


	@Test
    public void testGetEstudiantes() {
        assertNotNull(service.getAllEstudiantes());
    }


    @Test
    public void testGetPadres() {
        assertNotNull(service.getAllPadres());
    }


    @Test
    public void testGetEntrenadores() {
        assertNotNull(service.getAllEntrenadores());
    }

    @Test
    public void testGetHorarios() {
        assertNotNull(service.getAllHorarios());
    }

    @Test
    public void testGetBestEstudiantes() {
        assertNotNull(service.getBestEstudiantes());
    }

    @Test
    public void testGetHorario() {
        String codigoDeporte = "123";
        assertNotNull(service.getHorario(codigoDeporte));
    }

    @Test
    public void testConectar() {
        assertNotNull(service.conectar());
    }
}
