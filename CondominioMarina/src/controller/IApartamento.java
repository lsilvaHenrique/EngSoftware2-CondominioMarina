package controller;

import model.Apartamento;

public interface IApartamento {
	public void cadastrarApartamento(Apartamento apartamento);
	public void atualizarApartamento(Apartamento apartamento);
	public void removerApartamento(Apartamento apartamento);
	public void buscarApartamento(Apartamento apartamento);
}
