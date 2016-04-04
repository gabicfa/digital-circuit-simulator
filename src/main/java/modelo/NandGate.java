package main.java.modelo;

public class NandGate extends LogicGate implements Source {
	private InputPin pinA;
	private InputPin pinB;
		
	AndGate and = new AndGate();
	NotGate not = new NotGate();
	InputPin pinS = new InputPin();
	
	public void setPinA(InputPin pinA) {
		this.pinA = pinA;
	}
	
	public void setPinB(InputPin pinB) {
		this.pinB = pinB;
	}
	
	

	public boolean getOutputValue(int index) {
		
		and.setPinA(pinA);
		and.setPinB(pinB);
				
		pinS.setSource(and);
		
		not.setPin(pinS);

		
		return not.getOutputValue(0);		
	}
}
