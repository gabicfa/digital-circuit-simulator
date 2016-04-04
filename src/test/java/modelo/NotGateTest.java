package test.java.modelo;

import org.junit.Assert;
import org.junit.Test;

public class NotGateTest {
	NotGate not = new NotGate();
	Switch chave= new Switch();
	InputPin pin = new InputPin();
	
	@Test
	public void testeNotTrue(){
		chave.ligarBotao();
		
		pin.setSource(chave);
		
		not.setPin(pin);
		
		Assert.assertFalse(not.getOutputValue(0));
	}
	
	@Test	
	public void testeNandFalse(){
		
		chave.desligarBotao();
		
		pin.setSource(chave);
		
		not.setPin(pin);
		
		Assert.assertTrue(not.getOutputValue(0));		
	}

}
