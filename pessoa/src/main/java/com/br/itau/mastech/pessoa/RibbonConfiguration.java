package com.br.itau.mastech.pessoa;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RibbonConfiguration {

    @Bean
    public IRule iRule() {
        return new WeightedResponseTimeRule();
    }

}
