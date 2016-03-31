package modelo;
public class LogicGate implements Source, Drain{
	private InputPin pin;
	private boolean outputValue;
	//private Source source;
	
	public InputPin getInputPin(int index) {
		return pin;
	}
	public boolean getOutputValue(int index) {
		return outputValue ;
	}
	
	

}
