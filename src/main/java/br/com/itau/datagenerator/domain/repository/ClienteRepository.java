package br.com.itau.datagenerator.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.datagenerator.domain.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	Cliente findClienteById(int id_cliente);
}
