package com.akhil.configurationpropertiesdemo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {

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

