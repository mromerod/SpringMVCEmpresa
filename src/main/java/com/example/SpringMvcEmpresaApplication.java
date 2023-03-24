package com.example;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Correo;
import com.example.entities.Departamento;
import com.example.entities.Empleado;
import com.example.entities.Telefono;
import com.example.entities.Empleado.Genero;
import com.example.services.CorreoService;
import com.example.services.DepartamentoService;
import com.example.services.EmpleadoService;
import com.example.services.TelefonoService;

@SpringBootApplication
public class SpringMvcEmpresaApplication implements CommandLineRunner{

@Autowired
private DepartamentoService departamentoService;

@Autowired
private EmpleadoService empleadoService;

@Autowired
private TelefonoService telefonoService;

@Autowired
private CorreoService correoService;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcEmpresaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		departamentoService.save(
			Departamento.builder()
			.nombre("RRHH")
			.build()
		);


		departamentoService.save(
			Departamento.builder()
			.nombre("Finanzas")
			.build()
		);


		empleadoService.save(
			Empleado.builder()
				.id(1)
				.nombre("Aurora")
				.apellidos("Boudinot")
				.fechaAlta(LocalDate.of(2020, 4, 17))
				.genero(Genero.MUJER)
				.departamento(departamentoService.findById(1))
				.build()

			);


		empleadoService.save(
			Empleado.builder()
				.id(2)
				.nombre("Cristina")
				.apellidos("Galindo")
				.fechaAlta(LocalDate.of(2022, 8, 10))
				.genero(Genero.MUJER)
				.departamento(departamentoService.findById(2))
				.build()

			);



		telefonoService.save(
			Telefono.builder()
			.id(1)
			.numero("677654789")
			.empleado(empleadoService.findById(1))
			.build()
		);

		telefonoService.save(
			Telefono.builder()
			.id(2)
			.numero("91234567")
			.empleado(empleadoService.findById(1))
			.build()
		);


		telefonoService.save(
			Telefono.builder()
			.id(3)
			.numero("567895647")
			.empleado(empleadoService.findById(2))
			.build()
		);



		correoService.save(
			Correo.builder()
			.id(1)
			.email("auroraboudinot@gmail.com")
			.empleado(empleadoService.findById(1))
			.build());

		correoService.save(
			Correo.builder()
			.id(2)
			.email("cristinagalindo@gmail.com")
			.empleado(empleadoService.findById(2))
			.build());

	}

}
