package br.com.itau.datagenerator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.itau.datagenerator.domain.model.Consolidado;
import br.com.itau.datagenerator.domain.repository.ConsolidadoRepository;

@RestController
@RequestMapping("/api/consolidado")
public class ConsolidadoController extends BaseCrudController<Consolidado, Integer> {
    
	@Autowired
	private ConsolidadoRepository repository;

	ObjectMapper mapper = new ObjectMapper();
	
    public ConsolidadoController(ConsolidadoRepository repository) {
        this.repository = repository;
    }
    
    public ConsolidadoController() {
        
    }


   @Override
   	protected CrudRepository<Consolidado, Integer> getRepository() {
     return this.repository;
   }
    
   
}
