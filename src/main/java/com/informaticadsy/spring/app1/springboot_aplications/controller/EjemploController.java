package com.informaticadsy.spring.app1.springboot_aplications.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {

    @GetMapping("/detalles")
 

    public String info(Map<String,Object> mod){
        mod.put("Titulo", "Pagina Spring");
        mod.put("Nombre", "Megan");
        mod.put("Apellido", "Fox");
        mod.put("Edad", "33");
        mod.put("Extra", "te amo");

        return "detalles";
    }
}
