package br.com.professorisidro.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.Scanner;

// tornei a classe HelloController um Controller REST
// ou seja, vai expor os métodos na forma de URL

@RestController
public class HelloController {
    /* atraves desta anotação , temos um caminho de url definido

    http://localhost:8080/hello

     */
    @GetMapping("/hello")
    public String sayHello(){

        return "Boa noite, Gabriel aqui";
    }

    @GetMapping("/hellohtml")
    public String sayHelloEmHtml(){
        return "      <html>"
                +"<body>"
                +"    <h1> Ola </h1>"
                +"<hr>"
                +"<p> Curso Modern Web development <p>"
                +"</body>"
                +"</html>";
    }


}