package br.com.jeferson.cadpessoas.controllers_jeferson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PessoaController {
    //raiz do site localhost:8080/ 
    @GetMappingapping
    public String index(){
        return "index.html";
    }

}