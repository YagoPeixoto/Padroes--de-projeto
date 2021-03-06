package br.yago;

public class Fluorescente extends Lampada {

	protected Fluorescente(String eficiencia, String tipo, String watts, String marca) {
		super(eficiencia, tipo, watts, marca);
	}

	@Override
	public void exibirDados() {
		System.out.println(
				this.getEficiencia() + " , " + this.getTipo() + " , " + this.getWatts() + " , " + this.getMarca());
	}

}
