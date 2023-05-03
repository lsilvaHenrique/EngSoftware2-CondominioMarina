package model;

import java.util.Date;

public class Boleto {
	private Apartamento apartamento;
	private Condominio codCondominio;
	private DespesasApartamento despesasApartamento;
	private String referência;
	private Date dataPagamento;
	private boolean multaAtraso;
	private double valorMulta;
	
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
	public DespesasApartamento getDespesasApartamento() {
		return despesasApartamento;
	}
	public void setDespesasApartamento(DespesasApartamento despesasApartamento) {
		this.despesasApartamento = despesasApartamento;
	}
	public String getReferência() {
		return referência;
	}
	public void setReferência(String referência) {
		this.referência = referência;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public boolean isMultaAtraso() {
		return multaAtraso;
	}
	public void setMultaAtraso(boolean multaAtraso) {
		this.multaAtraso = multaAtraso;
	}
	public double getValorMulta() {
		return valorMulta;
	}
	public void setValorMulta(double valorMulta) {
		this.valorMulta = valorMulta;
	}
	@Override
	public String toString() {
		return "Boleto [apartamento=" + apartamento + ", codCondominio=" + codCondominio + ", despesasApartamento="
				+ despesasApartamento + ", referência=" + referência + ", dataPagamento=" + dataPagamento
				+ ", multaAtraso=" + multaAtraso + ", valorMulta=" + valorMulta + "]";
	}
}
