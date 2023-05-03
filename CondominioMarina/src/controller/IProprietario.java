package controller;

import model.Proprietario;

public interface IProprietario {
	public void cadastrarProprietario(Proprietario proprietario);
	public void atualizarProprietario(Proprietario proprietario);
	public void removerProprietario(Proprietario proprietario);
	public void buscarProprietario(Proprietario proprietario);
}
