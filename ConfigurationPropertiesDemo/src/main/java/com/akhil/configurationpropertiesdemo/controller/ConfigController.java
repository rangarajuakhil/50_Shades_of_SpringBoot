package com.akhil.configurationpropertiesdemo.controller;

import com.akhil.configurationpropertiesdemo.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private AppConfig appConfig;

    @GetMapping("/")
    public ResponseEntity<AppConfig> getProperties(){
        return ResponseEntity.ok().body(appConfig);
    }
}
