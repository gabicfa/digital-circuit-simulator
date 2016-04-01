package modelo;

import org.junit.Assert;
import org.junit.Test;

public class NandGateTest {
	NandGate nand = new NandGate();
	Switch chave1= new Switch();
	Switch chave2= new Switch();
	InputPin pinA = new InputPin();
	InputPin pinB = new InputPin();
	
	@Test
	public void testeNandTrueTrue(){
		chave1.ligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave1);
		
		nand.setPinA(pinA);
		nand.setPinB(pinB);
		
		Assert.assertFalse(nand.getOutputValue(0));
	}
	
	@Test	
	public void testeNandTrueFalse(){
		
		chave1.ligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		nand.setPinA(pinA);
		nand.setPinB(pinB);
		
		Assert.assertTrue(nand.getOutputValue(0));		
	}
	
	@Test	
	public void testeNandFalseTrue(){
		
		chave2.ligarBotao();
		chave1.desligarBotao();
		
		pinA.setSource(chave2);
		pinB.setSource(chave1);
		
		nand.setPinA(pinA);
		nand.setPinB(pinB);
		
		Assert.assertTrue(nand.getOutputValue(0));		
	}
	
	@Test	
	public void testeNandFalseFalse(){
		
		chave1.desligarBotao();
		chave2.desligarBotao();
		
		pinA.setSource(chave1);
		pinB.setSource(chave2);
		
		nand.setPinA(pinA);
		nand.setPinB(pinB);
		
		Assert.assertTrue(nand.getOutputValue(0));		
	}	
}
