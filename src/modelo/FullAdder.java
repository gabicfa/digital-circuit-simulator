package modelo;
public class FullAdder extends LogicGate {
	private InputPin pinA;
	private InputPin pinB;
	private InputPin pinC;
	
	XorGate xor1 = new XorGate();
	XorGate xor2 = new XorGate();
	AndGate and1 = new AndGate();
	AndGate and2 = new AndGate();


	OrGate or = new OrGate();
	
	InputPin pinS1 = new InputPin();
	InputPin pinS2 = new InputPin();
	InputPin pinS3 = new InputPin();
	
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
	
	public InputPin getPinC() {
		return pinC;
	}
	
	public void setPinC(InputPin pinC) {

		this.pinC = pinC;
	}
	
	public boolean getOutputValue(int index) {
		if(index == 0){
			xor1.setPinA(pinA);
			xor1.setPinB(pinB);
			pinS1.setSource(xor1);
			
			xor2.setPinA(pinS1);
			xor2.setPinB(pinC);
			return xor2.getOutputValue(0);		
		}
		
		else{
			xor1.setPinA(pinA);
			xor1.setPinB(pinB);
			pinS1.setSource(xor1);
			
			and1.setPinA(pinA);
			and1.setPinB(pinB);
			pinS2.setSource(and1);
			
			and2.setPinA(pinS1);
			and2.setPinB(pinC);
			pinS3.setSource(and2);
			
			or.setPinA(pinS2);
			or.setPinB(pinS3);
			return or.getOutputValue(0);
			
		}
	}
	
	
	

}
