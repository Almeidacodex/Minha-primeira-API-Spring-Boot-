package br.com.professorisidro.hello.controller;

import br.com.professorisidro.hello.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UsuarioController {

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario dadosLogin){

        System.out.println("Recebido " + dadosLogin.getEmail() + "/" + dadosLogin.getSenha());
        if (dadosLogin.getEmail().equals("gabrieldf@gmail.com")){
            if (dadosLogin.getSenha().equals("54484")){
                Usuario resposta = new Usuario();
                resposta.setId(5423);
                resposta.setNome("Gabriel ");
                resposta.setEmail("gabrieldf@gmail.com");
                resposta.setSenha("*******");
                // retorno a resposta de codigo 200 ok
                return ResponseEntity.ok(resposta);

            }
            return ResponseEntity.status(401).build();
        }
        return  ResponseEntity.notFound().build();//ResponseEntity.status(404).build() ;


    }
}
