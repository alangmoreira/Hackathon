package br.com.itau.datagenerator.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.itau.datagenerator.domain.service.ConsolidadoService;

@Component
@RabbitListener(queues = "g9-mov-az2")
public class QueueListenerAZ2 {

	@Autowired
	private ConsolidadoService service;
	
    @RabbitHandler
    public void receive(String in) throws Exception {
        System.out.println(" [x] Received AZ2 '" + in + "'");

        service.consolidarPosicao(in);
    }
 
}
