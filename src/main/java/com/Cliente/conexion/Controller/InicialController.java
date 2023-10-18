package com.Cliente.conexion.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicialController {
    @GetMapping("/hola")
    public String dicirHola(){
    
        return "<h1> ♥♥♥♥♥♥😊 Hola Todos Bienvenidos😊 ♥♥♥♥♥♥♥♥  </h1>";
    }
}
