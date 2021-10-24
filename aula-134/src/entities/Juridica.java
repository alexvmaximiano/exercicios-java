package entities;

public class Juridica extends Pessoa {

	private Integer numeroFuncionarios;
	
	public Juridica() {
		super();
	}
	
	
	public Juridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}


	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}


	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}


	@Override
	public double calculaImposto() {
		Double imposto = 0.0;
		if (numeroFuncionarios > 10) {
			imposto = getRendaAnual() * 0.14;
		} else {
			imposto = getRendaAnual() * 0.16;
		}
		
		return imposto;
	}

}
