package modelo;

import org.junit.Assert;
import org.junit.Test;

public class HalfAdderTest {
	HalfAdder halfAdder = new HalfAdder();
	Switch chave1= new Switch();
	Switch chave2= new Switch();
	InputPin pinA = new InputPin();
	InputPin pinB = new InputPin();
	
	@Test
	public void testeHalfAdderTrueTrue(){
		chave1.ligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave1);
		
		halfAdder.setPinA(pinA);
		halfAdder.setPinB(pinB);
		
		Assert.assertFalse(halfAdder.getOutputValue(0));
		Assert.assertTrue(halfAdder.getOutputValue(1));
	}
	
	@Test	
	public void testeHalfAdderTrueFalse(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		halfAdder.setPinA(pinA);
		halfAdder.setPinB(pinB);
		
		Assert.assertTrue(halfAdder.getOutputValue(0));
		Assert.assertFalse(halfAdder.getOutputValue(1));
	}
	
	@Test	
	public void testeOrFalseTrue(){
		
		chave1.desligarBotao();
		chave2.ligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		halfAdder.setPinA(pinA);
		halfAdder.setPinB(pinB);
		
		Assert.assertTrue(halfAdder.getOutputValue(0));
		Assert.assertFalse(halfAdder.getOutputValue(1));	
	}
	
	@Test	
	public void testeOrFalseFalse(){
		
		chave1.desligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		halfAdder.setPinA(pinA);
		halfAdder.setPinB(pinB);
		
		Assert.assertFalse(halfAdder.getOutputValue(0));
		Assert.assertFalse(halfAdder.getOutputValue(1));
	}
	

}
