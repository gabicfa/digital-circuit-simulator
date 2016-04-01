package modelo;

public class HalfAdder extends LogicGate {
	private InputPin pinA;
	private InputPin pinB;
	int index;
	
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
	
	public int getIndex() {
		return index;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public boolean getOutputValue(int index) {
				
	      //boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
	      //boolean sinalB = pinB.getSource().getOutputValue(pinB.getIndex());
	      //return sinalA && sinalB;
	    }

}
