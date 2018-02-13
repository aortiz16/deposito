package deposito;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Test;

public class DepositoCombustibleTestOrtiz {

	private double nivelinicial;
	private double nivelmaximo;
	private double resultado;
	
	private DepositoCombustibleTestOrtiz d ;
	
	public DepositoCombustibleTestOrtiz(double i, double m, double r) { //<<  CONSTRUCTOR DE LA CLASE  >>>
		// TODO Apéndice de constructor generado automáticamente
			  nivelinicial  = i;
			  nivelmaximo   = m;
			  resultado     = r;
	}
	
	@BeforeClass
	public static void InicioPruebasOrtiz() throws Exception {
		//double nivelinicial   = 10 ;
		//double nivelmaximo    = 50 ;
	//	DepositoCombustibleTestOrtiz d    =    DepositoCombustibleTestOrtiz(10,50)
		DepositoCombustible d    =    DepositoCombustible(10,50)
		assertNotNull(d);
	}
	
	
	@After
	public void finPruebas() {
		d  =  null  ;  //   ---   Elimiar Objeto Deposito   ---
	}

	
	@Test
	public void testGetDepositoNivelOrtiz() {
 			int r  =  d.getDepositoNivel(10);
		 	assertEquals(10,  d.getDepositoNivel());
	}

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
		if (  nivelinicial = p2 )
	        assertFalse(d.p1.equals(d.p2) ) ;
	        assertTrue(p1.equals(p2) ) ;
	}

	@Test
	public void testFillOrtiz() {
		double r  =  d.fill(10);
	 	assertEquals(20, d.testGetDepositoNivelOrtiz() ) ;
	}

	@Test
	public void testConsumirOrtiz() {
	 
		double r = d.consumir(6);	
	  	assertEquals(4, d.testGetDepositoNivelOrtiz() ) ;
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
