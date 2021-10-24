package entities;

public class Fisica extends Pessoa {
	
	private Double gastosSaude;
	
	public Fisica() {
		super();
	}

	public Fisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculaImposto() {
		double imposto = 0.0;
		if (getRendaAnual() <= 20000.00) {
			imposto = getRendaAnual() * 0.15;
			if (getGastosSaude() > 0) {
				imposto -= getGastosSaude()/2;
			}
		} else if (getRendaAnual() > 20000.00) {
			imposto = getRendaAnual() * 0.25;
			if (getGastosSaude() > 0) {
				imposto -= getGastosSaude()/2;
			}
		}
		
		return imposto;
	}

}
