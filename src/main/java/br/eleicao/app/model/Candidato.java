package br.eleicao.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;


@Entity
public class Candidato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Numero;
	private String Nome;
	@ManyToOne
    @JoinColumn(name ="MunicipioId")
	private Municipio Municipio;
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Voto", 
        joinColumns = { @JoinColumn(name = "CandidatoId") }, 
        inverseJoinColumns = { @JoinColumn(name = "EleitorId") }
    )
    Set<Eleitor> Eleitores = new HashSet<>();
	
	
	
	
	public Set<Eleitor> getEleitores() {
		return Eleitores;
	}

	public void setEleitores(Set<Eleitor> eleitores) {
		Eleitores = eleitores;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Municipio getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(Municipio municipio) {
		Municipio = municipio;
	}

	
}
