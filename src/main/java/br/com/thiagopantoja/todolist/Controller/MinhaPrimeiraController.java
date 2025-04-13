package br.com.thiagopantoja.todolist.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiro")
public class MinhaPrimeiraController {

    @GetMapping
    public String olaMundo() {
        return "Olá mundo! Essa é minha primeira rota Spring Boot!";
    }
}
// package br.com.thiagopantoja.todolist.Controller;