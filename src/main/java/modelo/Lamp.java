package main.java.modelo;

public class Lamp implements Drain{
	private InputPin pin;

	public InputPin getInputPin(int index) {
		return pin;
	}

	public void setInputPin(InputPin pin) {
		this.pin = pin;
	}

	public boolean getLampValue() {
		return pin.getSource().getOutputValue(0);
	}

}
