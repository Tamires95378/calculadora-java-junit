import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTeste {
	
	Calculadora calculadora = new Calculadora();
	@Test
	public void TesteSoma() {
		
		//Act 
		double result = calculadora.Soma(10,10);
		
		//Assert
		Assertions.assertEquals(result,calculadora.Soma(result,0));
	}
	
	@Test
	public void TesteSubtracao() {
	
	//Act
	double result = calculadora.Subtracao(10, 10);
	
	//Assert
	Assertions.assertEquals(result,calculadora.Subtracao(result,0));
	}
	
	@Test
	public void TesteDivisao() {
		
		//Act
		double result = calculadora.Divisao(10, 10);
		
		//Assert
		Assertions.assertEquals(result,calculadora.Divisao(result, 1));
	}
	
	@Test
	public void TesteMultiplcacao() {
		
		//Act
		double result = calculadora.Multiplicacao(10,10);
		
		//Assert
		Assertions.assertEquals(result,calculadora.Multiplicacao(result, 1));
		
	}
	
	@Test
	public void TestePotenciacao() {
		
		//Act
		double result = calculadora.Potenciacao(10,10);
		
		//Assert
		Assertions.assertEquals(result,calculadora.Potenciacao(result, 1));
		
	}
}
