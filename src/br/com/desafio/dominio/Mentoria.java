package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	private LocalDate data;
	
	public Mentoria()  {
		// TODO Auto-generated constructor stub
	}

	

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + data + "]";
	}



	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
	
	
}
