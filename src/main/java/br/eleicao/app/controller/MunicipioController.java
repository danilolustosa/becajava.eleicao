package br.eleicao.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.eleicao.app.model.*;
import br.eleicao.app.repository.MunicipioRepository;

@RestController
@RequestMapping("/municipios")
public class MunicipioController {
	
	final MunicipioRepository _municipioRepository;	//Criando propriedade da Interface Município
	
	
	public MunicipioController(MunicipioRepository municipioRepository) {
		_municipioRepository = municipioRepository; //Alimentando a propriedade com a construção da classe
	}
	
	@PostMapping
    public ResponseEntity inserir(@RequestBody Municipio municipio) {		
		_municipioRepository.save(municipio);		
		return ResponseEntity.status(HttpStatus.CREATED).body("Município criado com sucesso!");
    }
	
	
	@GetMapping
    public ResponseEntity listar() {
		Iterable<Municipio> municipios = _municipioRepository.findAll();		
    	return ResponseEntity.status(HttpStatus.OK).body(municipios);
    }
	
	@GetMapping(path = "/{id}")
    public ResponseEntity obter(@PathVariable Long id) {    	  	    	
		Optional<Municipio> municipio = _municipioRepository.findById(id);    	
        return ResponseEntity.status(HttpStatus.OK).body(municipio);
    }
	

    @PutMapping(path = "/{id}")
    public ResponseEntity atualizar(@RequestBody Municipio municipio, @PathVariable Long id) {
    	municipio.setId(id);
		_municipioRepository.save(municipio);		
        return ResponseEntity.status(HttpStatus.OK).body("Município atualizado com sucesso!");
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
    	_municipioRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
