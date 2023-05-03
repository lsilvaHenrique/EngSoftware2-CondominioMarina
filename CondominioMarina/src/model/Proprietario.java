package model;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    private String nome;
    private String telefone;
    private List<Apartamento> apartamentos;

    public Proprietario(String nome, String telefone) {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setApartamentos(new ArrayList<>());
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Apartamento> getApartamentos() {
		return apartamentos;
	}

	public void setApartamentos(List<Apartamento> apartamentos) {
		this.apartamentos = apartamentos;
	}

	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + ", telefone=" + telefone + ", apartamentos=" + apartamentos + "]";
	}
	
}
