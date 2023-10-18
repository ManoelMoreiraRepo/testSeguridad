package com.Cliente.conexion.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivaController {
    
    @GetMapping("/restrict")
    public String dicirHola(){
    
        return "<h1> 😈☠️ Restric Zone 😈☠️  </h1>";
    }
    
}
