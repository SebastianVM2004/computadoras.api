package mx.unam.aragon.ico.is.computadoraapi;

import mx.unam.aragon.ico.is.computadoraapi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraapi.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraapiApplicationTests {
	@Autowired
	private ComputadoraRepository computadoraRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void insertarcomputadora() {
		Computadora computadora = new Computadora(0,"msi","gtf61",null,12300.0f);

		computadoraRepository.save(computadora);//insert into
	}

	@Test
	void leercomputadoraPorClave() {
		Long claveTmp = 2l;
		Computadora tmp =computadoraRepository.findComputadoraByClave(claveTmp);
		System.out.println(tmp);
	}

	@Test
	public void eliminarComputadora() {
		Long claveTmp = 2l;
		computadoraRepository.deleteById(claveTmp);
	}

	@Test
	public void actualizarComputadora() {
		Long claveTmp = 3l;
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
		tmp.setModelo("patito3000");
		computadoraRepository.save(tmp);
	}

}
