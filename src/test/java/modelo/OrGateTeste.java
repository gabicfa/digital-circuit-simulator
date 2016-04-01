package modelo;

import org.junit.Assert;
import org.junit.Test;

public class OrGateTeste {
	OrGate or = new OrGate();
	Switch chave1= new Switch();
	Switch chave2= new Switch();
	InputPin pinA = new InputPin();
	InputPin pinB = new InputPin();
	
	@Test
	public void testeOrTrueTrue(){
		chave1.ligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave1);
		
		or.setPinA(pinA);
		or.setPinB(pinB);
		
		Assert.assertTrue(or.getOutputValue(0));
	}
	
	@Test	
	public void testeOrTrueFalse(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		or.setPinA(pinA);
		or.setPinB(pinB);
		
		Assert.assertTrue(or.getOutputValue(0));		
	}
	
	@Test	
	public void testeOrFalseTrue(){
		
		chave2.ligarBotao();
		chave1.desligarBotao();
		
		pinA.setSource(chave2);
		pinB.setSource(chave1);
		
		or.setPinA(pinA);
		or.setPinB(pinB);
		
		Assert.assertTrue(or.getOutputValue(0));		
	}
	
	@Test	
	public void testeOrFalseFalse(){
		
		chave1.desligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		or.setPinA(pinA);
		or.setPinB(pinB);
		
		Assert.assertFalse(or.getOutputValue(0));		
	}	

}
