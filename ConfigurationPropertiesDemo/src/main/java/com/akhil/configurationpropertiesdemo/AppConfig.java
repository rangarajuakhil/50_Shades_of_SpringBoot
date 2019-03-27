package com.akhil.configurationpropertiesdemo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Component
@PropertySource("classpath:application.properties")
@Configuration
public class AppConfig {

    private String environment;
    private String name;
    private String description;
    private final Auth auth = new Auth();

    @Getter
    @Setter
    public static class Auth {
        private List<String> roles;
        private Map<String, Boolean> allow;
    }

}

