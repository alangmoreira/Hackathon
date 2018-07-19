package br.com.itau.datagenerator.domain.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.itau.datagenerator.domain.model.Cliente;
import br.com.itau.datagenerator.domain.model.Consolidado;
import br.com.itau.datagenerator.domain.model.JsonReader;
import br.com.itau.datagenerator.domain.repository.ClienteRepository;
import br.com.itau.datagenerator.domain.repository.ConsolidadoRepository;

@Service
public class ConsolidadoService {
	@Autowired
	private ConsolidadoRepository repository;
	
	@Autowired
	private ClienteRepository cr;

	ObjectMapper mapper = new ObjectMapper();
	
	
	 public void consolidarPosicao(String json) throws Exception{
		  	
	    	try {
	    		JsonReader jsonConvertido = mapper.readValue(json, JsonReader.class);
		  		System.out.println("Json: " + json);

		  		Consolidado consolidado = new Consolidado();
		  		consolidado = repository.FindByClienteidAndAtivocod(jsonConvertido.getCliente().getId(), jsonConvertido.getAtivo().getCodigo());
		  		
		  		int idCliiente = jsonConvertido.getCliente().getId();
		  		Cliente cliente = cr.findClienteById(idCliiente);
		  		
		  		java.util.Date dtNow = Calendar.getInstance().getTime();
		  				  		
		  		consolidado.setAtivo_cod(jsonConvertido.getAtivo().getCodigo());
		  		consolidado.setAtivo_nome(jsonConvertido.getAtivo().getNome());
		  		consolidado.setCliente_DOC(0);
		  		if(jsonConvertido.getCliente().getDocumento() != null){
		  			consolidado.setCliente_DOC(Double.parseDouble(jsonConvertido.getCliente().getDocumento()));
		  		}
		  		consolidado.setCliente_nome(cliente.getNome());
		  		consolidado.setCliente_id(jsonConvertido.getCliente().getId());
		  		consolidado.setDt_atualizacao(dtNow);
		  		consolidado.setPlataforma(jsonConvertido.getAtivo().getPlataforma().getNome());
		  		consolidado.setQuantidade_posicao(jsonConvertido.getQuantidade());
		  		consolidado.setSegmento(jsonConvertido.getCliente().getSegmento());
		  		consolidado.setValor_posicao(jsonConvertido.getValorOperacao());
		  		
		  		repository.save(consolidado);
		  		
			} catch (Exception e) {
				System.out.println("Eroo "+ e.toString());
				throw new Exception();
				// TODO: handle exception
			}
	    	
	    }
}
