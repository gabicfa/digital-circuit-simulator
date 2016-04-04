package test.java.modelo;
import main.java.modelo. *;


import org.junit.Assert;
import org.junit.Test;

public class FullAdderTest {
	FullAdder fullAdder = new FullAdder();
	Switch chave1= new Switch();
	Switch chave2= new Switch();
	InputPin pinA = new InputPin();
	InputPin pinB = new InputPin();
	InputPin pinC = new InputPin();

	
	@Test
	public void testeFullAdderTrueTrueTrue(){
		chave1.ligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave1);
		pinC.setSource(chave1);

		
		fullAdder.setPinA(pinA);
		fullAdder.setPinB(pinB);
		fullAdder.setPinC(pinC);

		
		Assert.assertTrue(fullAdder.getOutputValue(0));
		Assert.assertTrue(fullAdder.getOutputValue(1));
	}
	
	@Test	
	public void testeFullAdderTrueTrueFalse(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave1);
		pinC.setSource(chave2);

		
		fullAdder.setPinA(pinA);
		fullAdder.setPinB(pinB);
		fullAdder.setPinC(pinC);

		
		Assert.assertFalse(fullAdder.getOutputValue(0));
		Assert.assertTrue(fullAdder.getOutputValue(1));
	}
	
	@Test	
	public void testeHalfAdderTrueFalseTrue(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		pinC.setSource(chave1);

		
		fullAdder.setPinA(pinA);
		fullAdder.setPinB(pinB);
		fullAdder.setPinC(pinC);

		
		Assert.assertFalse(fullAdder.getOutputValue(0));
		Assert.assertTrue(fullAdder.getOutputValue(1));
	}
	
	@Test	
	public void testeFullAdderTrueFalseFalse(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		pinC.setSource(chave2);
		
		fullAdder.setPinA(pinA);
		fullAdder.setPinB(pinB);
		fullAdder.setPinC(pinC);
		
		Assert.assertTrue(fullAdder.getOutputValue(0));
		Assert.assertFalse(fullAdder.getOutputValue(1));
	}
	
	@Test	
	public void testeFullAdderFalseTrueTrue(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave2);
		pinB.setSource(chave1);
		pinC.setSource(chave1);
		
		fullAdder.setPinA(pinA);
		fullAdder.setPinB(pinB);
		fullAdder.setPinC(pinC);
		
		Assert.assertFalse(fullAdder.getOutputValue(0));
		Assert.assertTrue(fullAdder.getOutputValue(1));
	}
	
	@Test	
	public void testeFullAdderFalseTrueFalse(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave2);
		pinB.setSource(chave1);
		pinC.setSource(chave2);
		
		fullAdder.setPinA(pinA);
		fullAdder.setPinB(pinB);
		fullAdder.setPinC(pinC);
		
		Assert.assertTrue(fullAdder.getOutputValue(0));
		Assert.assertFalse(fullAdder.getOutputValue(1));
	}
	
	@Test	
	public void testeFullAdderFalseFalseTrue(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave2);
		pinB.setSource(chave2);
		pinC.setSource(chave1);
		
		fullAdder.setPinA(pinA);
		fullAdder.setPinB(pinB);
		fullAdder.setPinC(pinC);
		
		Assert.assertTrue(fullAdder.getOutputValue(0));
		Assert.assertFalse(fullAdder.getOutputValue(1));
	}
	
	@Test	
	public void testeFullAdderFalseFalseFalse(){
		
		chave1.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave1);
		pinC.setSource(chave1);
		
		fullAdder.setPinA(pinA);
		fullAdder.setPinB(pinB);
		fullAdder.setPinC(pinC);
		
		Assert.assertFalse(fullAdder.getOutputValue(0));
		Assert.assertFalse(fullAdder.getOutputValue(1));
	}
}
