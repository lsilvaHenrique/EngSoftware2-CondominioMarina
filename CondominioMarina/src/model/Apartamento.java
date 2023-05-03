package model;

public class Apartamento {
    private int numero;
    private int quantidadeQuartos;
    private String tipoOcupacao;
    private Proprietario proprietario;
    private Condominio codCondominio;

   public Apartamento(int numero, int quantidadeQuartos, String tipoOcupacao, Proprietario proprietario, Condominio codCondominio) {
        this.setNumero(numero);
        this.setQuantidadeQuartos(quantidadeQuartos);
        this.setTipoOcupacao(tipoOcupacao);
        this.setProprietario(proprietario);
        this.setCodCondominio(codCondominio);
    } 
	public Apartamento() {
		// TODO Auto-generated constructor stub
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}

	public void setQuantidadeQuartos(int quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}

	public String getTipoOcupacao() {
		return tipoOcupacao;
	}

	public void setTipoOcupacao(String tipoOcupacao) {
		this.tipoOcupacao = tipoOcupacao;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Condominio getCodCondominio() {
		return codCondominio;
	}

	public void setCodCondominio(Condominio codCondominio) {
		this.codCondominio = codCondominio;
	}

	@Override
	public String toString() {
		return "Apartamento [numero=" + numero + ", quantidadeQuartos=" + quantidadeQuartos + ", tipoOcupacao="
				+ tipoOcupacao + ", proprietario=" + proprietario + ", codCondominio=" + codCondominio + "]";
	}
    
}
