package controller;

import model.Boleto;

public interface IBoleto {
	 public void cadastrarBoleto(Boleto boleto);
	 public void atualizarBoleto(Boleto boleto);
	 public void removerBoleto(Boleto boleto);
	 public void buscarBoleto(Boleto boleto);
}

