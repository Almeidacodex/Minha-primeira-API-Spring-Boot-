package br.com.professorisidro.hello.controller;

import br.com.professorisidro.hello.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/produto")
    public Produto recuperarProduto(){
        Produto prod;
        prod = new Produto();
        prod.setId(12345);
        prod.setDescricao("Computador");
        prod.setPreco(2500);
        return prod;
    }
}
