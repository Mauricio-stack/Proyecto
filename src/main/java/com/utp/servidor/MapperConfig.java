package com.utp.servidor;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean

    public org.modelmapper.ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
