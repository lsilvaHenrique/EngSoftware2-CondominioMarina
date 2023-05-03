package controller;

import model.Apartamento;
import bound.ApartamentoBoundary;

public class ApartamentoController implements IApartamento {
	
	private ApartamentoBoundary boundary;
	
	public ApartamentoController(ApartamentoBoundary boundary) {
		this.boundary = boundary;
	}

	@Override
	public void cadastrarApartamento(Apartamento apartamento) {
		boundary.cadastrarApartamento();
	}

	@Override
	public void atualizarApartamento(Apartamento apartamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerApartamento(Apartamento apartamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarApartamento(Apartamento apartamento) {
		// TODO Auto-generated method stub
		
	}
}