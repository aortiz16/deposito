package DepositoCombustible;

import static org.junit.Assert.*; 
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
 import org.junit.After;
import org.junit.Before;
  import DepositoCombustible.DepositoCombustibleTestOrtiz.DepositoCombustibleTest;

public class DepositoCombustibleTestOrtiz  {
	private double nivelinicial;
	private double nivelmaximo;
	private double resultado;
//	 private DepositoCombustibleTestOrtiz d ;
 	  DepositoCombustibleTestOrtiz d = new DepositoCombustibleTestOrtiz(10, 60,10);
 
  

	public DepositoCombustibleTestOrtiz(double i, double m, double r) { //<<  CONSTRUCTOR DE LA CLASE  >>>
	// TODO Apéndice de constructor generado automáticamente
		  nivelinicial  = i;
		  nivelmaximo   = m;
		  resultado     = r;
}

//	class DepositoCombustibleTestOrtiz {//(double nivelinicial, double nivelmaximo) {
		// TODO Apéndice de constructor generado automáticamente
 	//	private DepositoCombustibleTestOrtiz d = new DepositoCombustibleTestOrtiz(10, 50,10);
 	//	d = new DepositoCombustibleTestOrtiz(10, 50,10);
//}

 
		public void inicioPruebas() {
 			DepositoCombustibleTestOrtiz d = new DepositoCombustibleTestOrtiz(10, 50, 10);
			assertNotNull(d);
		}

	@BeforeClass
	 static void setUpBeforeClass() throws Exception {
		double nivelinicial   = 10 ;
		double nivelmaximo    = 50 ;
	//	d = new DepositoCombustibleTestOrtiz(nivelinicial, nivelmaximo);
		
	}
/*
	public void DepositoParametros (double p1 , double p2   ) {
		nivelinicial  = p1;
		nivelmaximo   = p2;
		resultado	  = r ;
	}
	
	
	public static  Collection <Object[]>valores(){
		return Array.asList(new Object[][] {   
			(10, 60 , 70) , (10 , 60, 20)  ,(10 , 60, 1  ) , (60, 60 , 20) } 
	}
			
*/
	
	
@Test
	public void testGetDepositoNivelOrtiz() {
		int r  =  d.getDepositoNivel(10);
	 	assertEquals(10,  d.getDepositoNivel());
}
	/*
	  float resultadoReal = EmpleadoBR.calculaSalarioBruto(
              TipoEmpleado.vendedor, 2000.0f, 8.0f);
float resultadoEsperado = 1360.0f;
assertEquals(resultadoEsperado, resultadoReal, 0.01);
		fail("No implementado aun");
	}
*/
	@Test
	public void testGetDepositoMaxOrtiz() {
		if (  nivelinicial == nivelmaximo )
		   assertTrue(p1.equals(p2) );
	}

	@Test
	public void testEstaVacioOrtiz() {
		if (  nivelinicial <= 1 )
			  assertTrue(p1.equals(p2) );
	}

	@Test
	public void testEstaLlenoOrtiz() {
		//public void testEquals(double p1, double p2){
	        assertFalse(d.p1.equals(d.p2) );
	        assertTrue(p1.equals(p2) );
	}
	 
	@Test
	public void testFillOrtiz() {
		double r  =  d.fill(10);
	 	assertEquals(20, d.getDepositoNivel() ) ;
	}

	@Test
	public void testConsumirOrtiz() {
		double r = d.consumir(6);	
	  	assertEquals(4, d.getDepositoNivel() ) ;
	}
	

	@Test(expected=Exception.class)			// prueba de AÑADIR   cantidad NEGATIVA
	public void testAnadirCantidadNegativaOrtiz() throws Exception{
		double r =  d.fill(-10);
	}	
	
	@Test(expected=Exception.class)		// AÑADIR  más de lo que CABE
	public void testAnadirExcesivoOrtiz() throws Exception{
		d.fill(70);	
	}
	
	@Test(expected=Exception.class)		// CONSUMIR NADA:  " 0 "
	public void testConsumirNadaOrtiz() throws Exception{
		d.consumir(0);	
	}
	
	@Test(expected=Exception.class)		// CONSUMIR  más del Nivel Actual
	public void testConsumirExcesivoOrtiz() throws Exception{
		d.consumir(70);	
	}
	
	@Test(expected=Exception.class)		// CONSUMIR  AÑADIENDO cantidad a lo q tiene
	public void testConsumirSumandoOrtiz() throws Exception{
		d.consumir(-20);	
	}
	

}
