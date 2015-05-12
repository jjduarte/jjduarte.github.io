package br.com.tragaasvelas.java;  

public class Post{
	private String data;
	private String titulo;
	private String descricao;

	public Post(){
	}


	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao(){
		return descricao;
	}

	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setData(String data){
		this.data = data;
	}

	public String getData(){
		return data;
	}
}