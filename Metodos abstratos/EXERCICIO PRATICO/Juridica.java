package entities;

public final class Juridica extends Pessoa {
	private int funcionarios;

	Juridica() {
		super();
	}

	public Juridica(String nome, double rendaAnual, int funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double imposto() {
		if (funcionarios > 10) {
			return getRendaAnual() * 0.14;
		}else {
			return getRendaAnual() * 0.16;
		}
	}
}
