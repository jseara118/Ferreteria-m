
package com.Ferreteria_m.controller;

import com.Ferreteria_m.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/")
    public String Listado(Model model){
        var lista = productoService.getProductos(false);
        model.addAttribute("productos", lista);
        return "index";
    }
}
    
   