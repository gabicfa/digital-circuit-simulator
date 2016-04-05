package main.java.modelo;
public class Switch implements Source {
	private boolean botao;
	
	public void ligarBotao(){
		botao = true;
	}
	
	public void desligarBotao(){
		botao = false;
	}
	
	public boolean getOutputValue(int index){
		return botao;
	}
	
	public boolean setBotao(boolean x){
		botao = x;
		return botao;
	}
	
}
