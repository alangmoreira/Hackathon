package br.com.itau.datagenerator.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.datagenerator.domain.model.Consolidado;

@Repository
public interface ConsolidadoRepository extends CrudRepository<Consolidado, Integer> {
	
	Consolidado FindByClienteidAndAtivocod(int cliente_id, String ativo_cod);
	
}
