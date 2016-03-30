
public class AndGate extends LogicGate {
	private InputPin pinA;
    private InputPin pinB;
    /* ...algum código... */
    // Este método devolve o sinal de um pino de saída da porta,
    // indicado pelo índice index.
    @Override
    public boolean getOutputValue(int index) {
      // Como uma porta AND possui apenas um pino de saída, vamos
      // simplesmente supor que index é zero e ignorá-lo. Ele
      // poderia ser outros valores para portas que possuem
      // múltiplos pinos de saída, como um adder.
      boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
      boolean sinalB = pinB.getSource().getOutputValue(pinB.getIndex());
      return sinalA && sinal B;
    }
    /* ...algum código... */
}
