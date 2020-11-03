package br.eleicao.app;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Municipio;
import br.eleicao.app.repository.MunicipioRepository;

@SpringBootApplication
public class EleicaoApplication  implements CommandLineRunner {
	
	final MunicipioRepository _municipioRepository;	//Criando propriedade da Interface Município
	
	public EleicaoApplication(MunicipioRepository municipioRepository) {
		_municipioRepository = municipioRepository; //Alimentando a propriedade com a construção da classe
	}

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {			
		
		
		//Salvar Município
//		Municipio municipio = new Municipio();
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		
//		municipio = new Municipio();
//		municipio.setNome("Sorocaba");
//		municipio.setPopulacao(140000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		
//		municipio = new Municipio();
//		municipio.setNome("Guarulhos");
//		municipio.setPopulacao(1400000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
		
		
		
		
		
		//Deletando um município
//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(1));
//		_municipioRepository.delete(municipio);;
//		System.out.println("Município deletado com sucesso!");
		
		
		
		
		
		//Atualizando um município
//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(2));
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");	
		
		
		
		
			

		
		//Selecionando apenas UM município
//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(2));
//		System.out.println("Município: " + municipio.get().getNome());
		
		
		//Selecionando todos os municípios
//		Iterable<Municipio> municipios = _municipioRepository.findAll();		
//		for(Municipio m : municipios) {
//			System.out.println("Município: " + m.getNome());
//		}
		

		
	}

}
