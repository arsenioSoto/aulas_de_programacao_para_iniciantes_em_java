package com.mz.soto.junior._051_encapsulamento;

public class Cliente {

	//public, private, package, abstract, protected, final
	
	private String nome;
	private String apelido;
	private Double altura;
	private Integer anoDeNascimento;
	private Boolean casado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Integer getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(Integer anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	public Boolean getCasado() {
		return casado;
	}
	public void setCasado(Boolean casado) {
		this.casado = casado;
	}
	
	
}
