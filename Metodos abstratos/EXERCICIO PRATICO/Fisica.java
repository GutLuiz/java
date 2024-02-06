package entities;

public class Fisica extends Pessoa {
	private double gastosComSaude;

	Fisica() {
		super();
	}

	public Fisica(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double imposto() {
		double basicTax;
		if (getRendaAnual() < 20000) {
			basicTax = getRendaAnual() * 0.15;
		} else {
			basicTax = getRendaAnual() * 0.25;
		}
		basicTax = basicTax - gastosComSaude * 0.50;
		if (basicTax < 0) {
			basicTax = 0;
		}
		return basicTax;
	}
}
