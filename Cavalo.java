package AuxiliaresHerançaPoli;

public class Cavalo extends Animais{
	private String crina;
	
	public Cavalo(String crina) {
		
		this.crina = crina;
	}
	public Cavalo() {
		// TODO Auto-generated constructor stub
	}
	public void correr() {
		System.out.println("O cavalo corre");
	}
	void emitirSom () {
		System.out.println("O cavalo relincha");
	}
}
