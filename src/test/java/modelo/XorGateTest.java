package test.java.modelo;

import org.junit.Assert;
import org.junit.Test;

public class XorGateTest {
	XorGate xor = new XorGate();
	Switch chave1= new Switch();
	Switch chave2= new Switch();
	InputPin pinA = new InputPin();
	InputPin pinB = new InputPin();
	
	@Test
	public void testeXorTrueTrue(){
		chave1.ligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave1);
		
		xor.setPinA(pinA);
		xor.setPinB(pinB);
		
		Assert.assertFalse(xor.getOutputValue(0));
	}
	
	@Test	
	public void testeAndTrueFalse(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		xor.setPinA(pinA);
		xor.setPinB(pinB);
		
		Assert.assertTrue(xor.getOutputValue(0));		
	}
	
	@Test	
	public void testeAndFalseTrue(){
		
		chave2.ligarBotao();
		chave1.desligarBotao();
		
		pinA.setSource(chave2);
		pinB.setSource(chave1);
		
		xor.setPinA(pinA);
		xor.setPinB(pinB);
		
		Assert.assertTrue(xor.getOutputValue(0));		
	}
	
	@Test	
	public void testeAndFalseFalse(){
		
		chave1.desligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		xor.setPinA(pinA);
		xor.setPinB(pinB);
		
		Assert.assertFalse(xor.getOutputValue(0));		
	}	
	
	
}
