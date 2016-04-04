package main.java.modelo;

public class HalfAdder extends LogicGate {
	private InputPin pinA;
	private InputPin pinB;
	
	AndGate and = new AndGate();
	XorGate xor = new XorGate();
	
	public InputPin getPinA() {
		return pinA;
	}
	
	public void setPinA(InputPin pinA) {
		this.pinA = pinA;
	}
	
	public InputPin getPinB() {
		return pinB;
	}
	
	public void setPinB(InputPin pinB) {
		this.pinB = pinB;
	}
	
	public boolean getOutputValue(int index) {
		
		if(index==0){
			xor.setPinA(pinA);
			xor.setPinB(pinB);
			return xor.getOutputValue(0);		
		}
		
		else{
			and.setPinA(pinA);
			and.setPinB(pinB);
			return and.getOutputValue(0);
		}
		
	}

}
