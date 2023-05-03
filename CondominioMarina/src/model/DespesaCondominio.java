package model;

public class DespesaCondominio {
	private double valorAgua;
	private double valorLuz;
	private double valorGas;
	private Condominio codCondominio;
	private String referencia;
	private String despesaAdicional;
	private double valorDespesaAdicional;
	
	public double getValorAgua() {
		return valorAgua;
	}
	public void setValorAgua(double valorAgua) {
		this.valorAgua = valorAgua;
	}
	public double getValorLuz() {
		return valorLuz;
	}
	public void setValorLuz(double valorLuz) {
		this.valorLuz = valorLuz;
	}
	public double getValorGas() {
		return valorGas;
	}
	public void setValorGas(double valorGas) {
		this.valorGas = valorGas;
	}
	public Condominio getCodCondominio() {
		return codCondominio;
	}
	public void setCodCondominio(Condominio codCondominio) {
		this.codCondominio = codCondominio;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getDespesaAdicional() {
		return despesaAdicional;
	}
	public void setDespesaAdicional(String despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	public double getValorDespesaAdicional() {
		return valorDespesaAdicional;
	}
	public void setValorDespesaAdicional(double valorDespesaAdicional) {
		this.valorDespesaAdicional = valorDespesaAdicional;
	}
	@Override
	public String toString() {
		return "DespesaCondominio [valorAgua=" + valorAgua + ", valorLuz=" + valorLuz + ", valorGas=" + valorGas
				+ ", codCondominio=" + codCondominio + ", referencia=" + referencia + ", despesaAdicional="
				+ despesaAdicional + ", valorDespesaAdicional=" + valorDespesaAdicional + "]";
	}
}
