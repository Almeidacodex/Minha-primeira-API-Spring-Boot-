package br.com.professorisidro.hello.controller;

import br.com.professorisidro.hello.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UsuarioController {

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario dadosLogin){

        System.out.println("Recebido " + dadosLogin.getEmail() + "/" + dadosLogin.getSenha());
        if (dadosLogin.getEmail().equals("gabrieldf@gmail.com")){
            if (dadosLogin.getSenha().equals("54484")){
                Usuario resposta = new Usuario();
                resposta.setId(5423);
                resposta.setNome("Gabriel ");
                resposta.setEmail("gabrieldf@gmail.com");
                resposta.setSenha("*******");
                return resposta;

            }
            return null;
        }
        return null;


    }
}
