package br.com.desafio.dominio;

//NÃO CONSIGO CRIAR CONTEÚDO SE UTILIZAR ABSTRACT
public abstract class Conteudo {

		//FINAL: REPRESENTA UMA CONSTANTE;
		//STATIC: POSSO ACESSAR FORA DE CONTEUDO
		protected static final double XP_PADRAO = 10d;
		private String titulo;
		private String descricao;
		
		public abstract double calcularXp();

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

			

}
