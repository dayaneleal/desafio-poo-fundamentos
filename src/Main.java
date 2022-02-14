import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Conteudo;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Introdu��o ao Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Javascript");
		curso2.setDescricao("Introdu��o ao Javascript");
		curso2.setCargaHoraria(8);
		
//		Conteudo conteudo = new Curso();
//		List<String>palavras = new ArrayList<>();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("Mentoria de introdu��o ao Java");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		System.out.println("\n\n\n------DEV CAMILA---------------");
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos: " + devCamila.getConteudosInscritos());
		System.out.println("-");
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Conte�dos Concluidos: " + devCamila.getConteudosConcluidos());
		System.out.println("Conte�dos Inscritos: " + devCamila.getConteudosInscritos());
		System.out.println("XP: " + devCamila.calcularXp());
		System.out.println("\n\n\n------DEV JO�O---------------");
		Dev devJoao = new Dev();
		devJoao.setNome("Jo�o");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos: " + devJoao.getConteudosInscritos());
		System.out.println("-");
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conte�dos Concluidos: " + devJoao.getConteudosConcluidos());
		System.out.println("Conte�dos Inscritos: " + devJoao.getConteudosInscritos());
		System.out.println("XP: " + devJoao.calcularXp());
		
	}

}
