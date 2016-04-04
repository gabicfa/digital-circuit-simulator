package test.java.modelo;

import org.junit.Test;
import org.junit.Assert;
import main.java.modelo. *;
public class AndGateTest {
	
	AndGate and = new AndGate();
	Switch chave1= new Switch();
	Switch chave2= new Switch();
	InputPin pinA = new InputPin();
	InputPin pinB = new InputPin();
	
	@Test
	public void testeAndTrueTrue(){
		chave1.ligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave1);
		
		and.setPinA(pinA);
		and.setPinB(pinB);
		
		Assert.assertTrue(and.getOutputValue(0));
	}
	
	@Test	
	public void testeAndTrueFalse(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		and.setPinA(pinA);
		and.setPinB(pinB);
		
		Assert.assertFalse(and.getOutputValue(0));		
	}
	
	@Test	
	public void testeAndFalseTrue(){
		
		chave2.ligarBotao();
		chave1.desligarBotao();
		
		pinA.setSource(chave2);
		pinB.setSource(chave1);
		
		and.setPinA(pinA);
		and.setPinB(pinB);
		
		Assert.assertFalse(and.getOutputValue(0));		
	}
	
	@Test	
	public void testeAndFalseFalse(){
		
		chave1.desligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		and.setPinA(pinA);
		and.setPinB(pinB);
		
		Assert.assertFalse(and.getOutputValue(0));		
	}	
}
	

