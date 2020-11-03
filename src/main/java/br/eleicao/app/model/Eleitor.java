package br.eleicao.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Eleitor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;	
	private String Nome;
	
	
	@ManyToMany(mappedBy = "Eleitores")
	private Set<Candidato> Candidatos = new HashSet<>();
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
}
