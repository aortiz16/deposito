package mydeposito;
/**
 * @author aortiz16
 * @Version 2.0  - 15 / 2 / 18 -
 *  
 * 
 */
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

 
	public class DepositoCombustibleTestOrtiz  {
		private double nivelinicial;
		private double nivelmaximo;
		private double resultado;
 		   DepositoCombustible d ;
	 	//  DepositoCombustible d = new DepositoCombustible(10, 60,10);
	 
	  
/*
		public DepositoCombustible(double i, double m, double r) { //<<  CONSTRUCTOR DE LA CLASE  >>>
		// TODO Apéndice de constructor generado automáticamente
			  nivelinicial  = i;
			  nivelmaximo   = m;
			  resultado     = r;
	}
*/

		@BeforeClass
		 public void InicioPruebasOrtiz() throws Exception {
			 nivelinicial   = 10 ;
			 nivelmaximo    = 50 ; 
			  d = new DepositoCombustible(nivelinicial, nivelmaximo);
			assertNotNull(d);
		//	d = new DepositoCombustibleTestOrtiz(nivelinicial, nivelmaximo);
		}
		
		@AfterClass
		public void finPruebasOrtiz() {
			d  =  null  ;  //   ---   Elimiar Objeto Deposito   ---
		}
 
		
		
	@Test
		public void testGetDepositoNivelOrtiz() {
		//	double r  =  d.getDepositoNivel(10);
		 	assertEquals(10,  d.getDepositoNivel(),0);
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
			//if (  nivelinicial == nivelmaximo )
			   assertEquals(50, d.getDepositoMax(), 0 ) ;
		}

		@Test 
		public void testEstaVacioOrtiz() {
			if (  nivelinicial <= 1 )
				  assertFalse(d.estaVacio()  ) ;
		}

		@Test
		public void testEstaLlenoOrtiz() {
			//public void testEquals(double p1, double p2){
		       
		        assertFalse(d.estaLleno() ) ;
		}
		 
		@Test
		public void testFillOrtiz() {
		//	double r  =  d.fill(10);
		 	assertEquals(25, (d.getDepositoMax() / 2 ) , 0 ) ;
		}

		@Test
		public void testConsumirOrtiz() {
		//	double r = d.consumir(6);	
		  	assertEquals(10, d.getDepositoNivel(), 0  ) ;
		}
		

		@Test(expected=Exception.class)			// prueba de AÑADIR   cantidad NEGATIVA
		public void testAnadirCantidadNegativaOrtiz() throws Exception{
	//		double r =  d.fill(-10);
			assertEquals(-20, d.getDepositoNivel() , 0 ) ;
		}	
		
		@Test(expected=Exception.class)		// AÑADIR  más de lo que CABE
		public void testAnadirExcesivoOrtiz() throws Exception{
		//	d.fill(70);	
			assertEquals(70, d.getDepositoNivel() , 0 ) ;
		}
		
		@Test(expected=Exception.class)		// CONSUMIR NADA:  " 0 "
		public void testConsumirNadaOrtiz() throws Exception{
		//	d.consumir(0);
			assertEquals(10, d.getDepositoNivel()  , 0 ) ;
		}
		
		@Test(expected=Exception.class)		// CONSUMIR  más del Nivel Actual
		public void testConsumirExcesivoOrtiz() throws Exception{
//			d.consumir(70);	
			assertEquals(20, d.getDepositoNivel()  , 0 ) ;

		}
		
		@Test(expected=Exception.class)		// CONSUMIR  AÑADIENDO cantidad a lo q tiene
		public void testConsumirSumandoOrtiz() throws Exception{
//			d.consumir(-20);	
			assertEquals(-20, d.getDepositoNivel()  , 0 ) ;
		}
		

	}

