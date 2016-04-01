package modelo;

public class NotGate extends LogicGate{
	private InputPin pin;
	
	public void setPin(InputPin pin) {
		this.pin = pin;
	}
	
    public boolean getOutputValue(int index) {
      boolean sinalA = pin.getSource().getOutputValue(pin.getIndex());
      return ! sinalA;
    }
    
}



