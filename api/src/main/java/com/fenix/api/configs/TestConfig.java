package com.fenix.api.configs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration // isso demonstra que é uma classe de configuração
@Profile("test") // isso aponta que essa classe é uma configuração especifica para teste
public class TestConfig implements CommandLineRunner {// essa classe serve para popular o a nossa aplicação
    
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        
    }
    }

