package controller;

import model.DespesaCondominio;

public interface IDespesaCondominio {
	public void cadastrarDespesaCondominio(DespesaCondominio despesaCond);
	public void atualizarDespesaCondominio(DespesaCondominio despesaCond);
	public void removerDespesaCondominio(DespesaCondominio despesaCond);
	public void buscarDespesaCondominio(DespesaCondominio despesaCond);
}
