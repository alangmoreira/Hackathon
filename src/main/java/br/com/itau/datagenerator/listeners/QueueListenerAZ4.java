package br.com.itau.datagenerator.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.itau.datagenerator.domain.service.ConsolidadoService;

@Component
@RabbitListener(queues = "g9-mov-az4")
public class QueueListenerAZ4 {

	@Autowired
	private ConsolidadoService service;
	
    @RabbitHandler
    public void receive(String in) throws Exception {
        System.out.println(" [x] Received AZ4 '" + in + "'");
        service.consolidarPosicao(in);
    }
 
}
