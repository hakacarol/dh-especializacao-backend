package com.dh.apigatewayaux.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

@Component
public class LogFilter extends AbstractGatewayFilterFactory<LogFilter.Config> {

    private static Logger log = Logger.getLogger(LogFilter.class.getName());
    private static AtomicInteger COUNT_CALL_GATEWAY = new AtomicInteger(0);

    public LogFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config){
        return (exchange, chain) -> {
            //Filtro prévio à invocação do serviço real associado ao gateway
            //log.info("Path requested: " + exchange.getRequest().getPath());
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                //Filtro posterior à invocação do serviço real associado ao gateway
//                log.info("Time response: " + Calendar.getInstance().getTime());
                log.info("Contador de chamadas: " + COUNT_CALL_GATEWAY.incrementAndGet());
            }));
        };
    }

    public static class Config {
        //Put the configuration properties
    }
}

// implementaremos um filtro global desenvolvendo uma classe que implemente Log4j para registrar dados de header
// em um pré-filtro e dados de tempo de resposta de registro em um pós-filtro.
// Esta classe deve herdar da fábrica de filtros fornecida pela Cloud Gateway (AbstractGatewayFilterFactory),
// onde devemos implementar o comportamento do método public GatewayFilter apply(Config config).