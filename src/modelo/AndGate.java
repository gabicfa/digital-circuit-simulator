package modelo;

public class AndGate extends LogicGate {
	private InputPin pinA;
    private InputPin pinB;
    /* ...algum código... */
    // Este método devolve o sinal de um pino de saída da porta,
    // indicado pelo índice index.
    //@Override	
    public boolean getOutputValue(int index) {
      boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
      boolean sinalB = pinB.getSource().getOutputValue(pinB.getIndex());
      return sinalA && sinalB;
    }
    /* ...algum código... */
}
