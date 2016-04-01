package modelo;

public class XorGate extends LogicGate {
	private InputPin pinA;
    private InputPin pinB;
    
	NandGate nand1 = new NandGate();
	NandGate nand2 = new NandGate();
	NandGate nand3 = new NandGate();
	NandGate nand4 = new NandGate();
	
	InputPin pinS1 = new InputPin();
	InputPin pinS2 = new InputPin();
	InputPin pinS3 = new InputPin();
    
	public void setPinA(InputPin pinA) {
		this.pinA = pinA;
	}
	
	public void setPinB(InputPin pinB) {
		this.pinB = pinB;
	}

    public boolean getOutputValue(int index) {
    	
    	nand1.setPinA(pinA);
    	nand1.setPinB(pinB);    	
		pinS1.setSource(nand1);
		
		nand2.setPinA(pinA);
		nand2.setPinB(pinS2);
		pinS2.setSource(nand2);
		
		nand3.setPinA(pinS1);
		nand3.setPinB(pinB);
		pinS3.setSource(nand3);
		
		nand4.setPinA(pinS2);
		nand4.setPinB(pinS3);
		
		return nand4.getOutputValue(0);
    }
}
