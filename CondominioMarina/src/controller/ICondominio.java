package controller;

import model.Condominio;

public interface ICondominio {
	public void cadastrarCondominio(Condominio condominio);
	public void atualizarCondominio(Condominio condominio);
	public void removerCondominio(Condominio condominio);
	public void buscarCondominio(Condominio condominio);
}
