package br.eleicao.app.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;

@Entity
public class Voto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@ManyToOne
    @JoinColumn(name ="CandidatoId")
	private Candidato Candidato;

	@ManyToOne
    @JoinColumn(name ="EleitorId")
	private Eleitor Eleitor;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Candidato getCandidato() {
		return Candidato;
	}

	public void setCandidato(Candidato candidato) {
		Candidato = candidato;
	}

	public Eleitor getEleitor() {
		return Eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		Eleitor = eleitor;
	}

	
}
