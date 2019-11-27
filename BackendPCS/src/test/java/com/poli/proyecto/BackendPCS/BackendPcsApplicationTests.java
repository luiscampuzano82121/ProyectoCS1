package com.poli.proyecto.BackendPCS;

import com.poli.proyecto.BackendPCS.Data.Deporte;
import com.poli.proyecto.BackendPCS.Data.Login;
import com.poli.proyecto.BackendPCS.Service.BackendService;
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

	@Test
	public void getLogin(){
		String user= "admin";
		String password = "123456";
		Login login = new Login(user,password);
		service.validateLogin(login);
		assertNotNull(login);
	}

	@Test
	public void getEstudiantes(){
		assertNotNull(service.getAllEstudiantes());
	}


	@Test
	public void getPadres(){
		assertNotNull(service.getAllPadres());
	}


	@Test
	public void getEntrenadores(){
		assertNotNull(service.getAllEntrenadores());
	}

	@Test
	public void getHorarios(){
		assertNotNull(service.getAllHorarios());
	}

	@Test
	public void getBestEstudiantes(){
		assertNotNull(service.getBestEstudiantes());
	}

	@Test
	public void getHorario(){
		String codigoDeporte = "123";
		assertNotNull(service.getHorario(codigoDeporte));
	}
}
