import static org.junit.Assert.*;

import org.junit.Test;

public class TestCCuentaZAM {
	Ccuenta miCuenta=new Ccuenta("Ana","López",3200,1);
	
//1.- Al crear una nueva cuenta, el objeto no es nulo.
	@Test
	public void testCrearCuentaZAM() {
		assertNotNull(miCuenta);
	}
	
//2.- Tras crear una cuenta con un saldo de 3200, al obtener el saldo, este sigue siendo 3200.
	@Test
	public void testObtenerSaldoZAM() {
		assertEquals(3200,miCuenta.getSaldo(),0);
	}
	
//3.- Una prueba para ingresar una cantidad y que al obtener el saldo, éste sea correcto.
	@Test
	public void testIngresaSaldoZAM() throws Exception {
		miCuenta.ingresar(1000);
		assertEquals(4200,miCuenta.getSaldo(),0);
	}
	
//4.- Una prueba de ingresar una cantidad negativa.
	@Test(expected=Exception.class)
	public void testIngresarZAM() throws Exception{
		miCuenta.ingresar(-700);
		}
	
//5.- Una prueba de retirar una cantidad y que al obtener el saldo, éste es correcto.
	@Test
	public void testRetirarZAM() throws Exception{
		miCuenta.retirar(1000);
		assertEquals(2200,miCuenta.getSaldo(),0);
	}
	
//6.- Una prueba de retirar más del saldo de la cuenta.
	@Test(expected=Exception.class)
	public void testRetirarMasZAM() throws Exception{
		miCuenta.retirar(5000);
		}
}
