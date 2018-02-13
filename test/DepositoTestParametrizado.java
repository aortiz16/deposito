import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import mydeposito.DepositoCombustible;           ///   IMPORTAR LA CLASE A TESTEAR  -- ES CORRECTO? ???  ****

@RunWith(Parameterized.class)
public class DepositoTestParametrizado {

	private double nivelinicial;
	private double nivelmaximo;
	private double resultado;
	private DepositoTestParametrizado d ;
	
	public DepositoTestParametrizado(double i, double m, double r) { //<<  CONSTRUCTOR DE LA CLASE  >>>
		// TODO Apéndice de constructor generado automáticamente
			  nivelinicial  = i;
			  nivelmaximo   = m;
			  resultado     = r;
	}
	
	
	@Parameters   // Bateria de Pruebas, -- Grupo de 3 Parametros --
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][]  { { 10,50,10 }  ,
			{ 10,50,70 } , { 10,50,0 } , { 10,50,-10 },  { 0,50,0 },  { 50,50,10 },  { 50,50,-10 } ,  { 0,50,70 }   } );
	}
	
	
	
	@Test
	public void testGetDepositoNivelOrtiz() {
		DepositoCombustible d    =   new DepositoCombustible(nivelinicial, nivelmaximo);
		double litros = d.fill();
		assertEquals(resultado,litros);
				
	}

	@Test
	public void testGetDepositoMaxOrtiz() {
		DepositoCombustible d    =   new DepositoCombustible(nivelinicial, nivelmaximo);
		if (  nivelinicial == nivelmaximo )
			   assertTrue(nivelinicial.equals(nivelmaximo) );

	}

	@Test
	public void testEstaVacioOrtiz() {
		if (  nivelinicial <= 1 )
			   assertTrue(nivelinicial.equals(nivelmaximo) );
	}

	@Test
	public void testEstaLlenoOrtiz() {
		if (  nivelinicial == nivelmaximo )
			   assertTrue(nivelinicial.equals(nivelmaximo) );

	}

	@Test
	public void testFillOrtiz() {
		double r  =  d.fill(10);
	// 	assertEquals(20, d.testGetDepositoNivel() ) ;    ///   cual es la forma correscta, ERRORES en ambas formas ***
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
