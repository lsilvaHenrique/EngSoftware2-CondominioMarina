package model;

public class DespesasApartamento {
	private Apartamento apartamento;
	private Condominio codCondominio;
	private String tipoDespesa;
	private double valorDespesa;
	private String referência;
	public Apartamento getApartamento() {
		return apartamento;
	}
	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}
	public Condominio getCodCondominio() {
		return codCondominio;
	}
	public void setCodCondominio(Condominio codCondominio) {
		this.codCondominio = codCondominio;
	}
	public String getTipoDespesa() {
		return tipoDespesa;
	}
	public void setTipoDespesa(String tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}
	public double getValorDespesa() {
		return valorDespesa;
	}
	public void setValorDespesa(double valorDespesa) {
		this.valorDespesa = valorDespesa;
	}
	public String getReferência() {
		return referência;
	}
	public void setReferência(String referência) {
		this.referência = referência;
	}
	@Override
	public String toString() {
		return "DespesasApartamento [apartamento=" + apartamento + ", codCondominio=" + codCondominio + ", tipoDespesa="
				+ tipoDespesa + ", valorDespesa=" + valorDespesa + ", referência=" + referência + "]";
	}
}
