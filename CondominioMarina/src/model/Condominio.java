package model;

import java.util.Date;

public class Condominio {
	private String CNPJ;
	private String Endereco;
	private int codCondominio;
	private Date dataCadastro;
	
	 public Condominio (String CNPJ, String Endereco, int codCondominio, Date dataCadastro) {
	        this.setCNPJ(CNPJ);
	        this.setEndereco(Endereco);
	        this.setCodCondominio(codCondominio);
	        this.setDataCadastro(dataCadastro);
	    }

	
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public int getCodCondominio() {
		return codCondominio;
	}
	public void setCodCondominio(int codCondominio) {
		this.codCondominio = codCondominio;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	@Override
	public String toString() {
		return "Condominio [CNPJ=" + CNPJ + ", Endereco=" + Endereco + ", codCondominio=" + codCondominio
				+ ", dataCadastro=" + dataCadastro + "]";
	}
}
