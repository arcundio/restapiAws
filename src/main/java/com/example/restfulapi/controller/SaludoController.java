package com.example.restfulapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SaludoController {

    @GetMapping("/saludo")
    public String saludo(){
        return "hola";
    }

}
