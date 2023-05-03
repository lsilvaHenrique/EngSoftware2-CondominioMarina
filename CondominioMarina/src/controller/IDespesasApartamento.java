package controller;

import model.DespesasApartamento;

public interface IDespesasApartamento {
	  public void cadastrarDespesasApartamento(DespesasApartamento despesaApto);
	  public void atualizarDespesasApartamento(DespesasApartamento despesaApto);
	  public void removerDespesasApartamento(DespesasApartamento despesaApto);
	  public void buscarDespesasApartamento(DespesasApartamento despesaApto);
}
