package bound;

import controller.IApartamento;
import model.Apartamento;

public class ApartamentoBoundary {

    private IApartamento controller;

    public ApartamentoBoundary(IApartamento controller) {
    this.controller = controller;
    }

	public void cadastrarApartamento() {
        Apartamento apartamento = new Apartamento();
        apartamento.setProprietario(null);
        apartamento.setQuantidadeQuartos(0);
        apartamento.setTipoOcupacao(null);
        apartamento.setCodCondominio(null);
        apartamento.setNumero(0);
        controller.cadastrarApartamento(apartamento);
    } 
}
