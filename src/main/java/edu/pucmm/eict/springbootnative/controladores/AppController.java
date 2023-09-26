package edu.pucmm.eict.springbootnative.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/mvc")
public class AppController {

    @RequestMapping(path = "/")
    public String index(Model model){
        model.addAttribute("mensaje", "Utilizando Plantillas");
        return "index.html";
    }
}
