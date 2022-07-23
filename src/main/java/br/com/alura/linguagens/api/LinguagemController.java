package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// para aplicação entender que isso é um controller, usar a anotação @RestController
// usando assim o padrão rest
@RestController
public class LinguagemController {

    /// Consumindo do Spring
    // método http get; obs.: url ex. http://localhost:8080/linguagem-preferida

    // @GetMapping(value="/linguagem-preferida")
    // public String processaLinguagemPreferida(){
    //     return "Oi, Java";
    // }

    // private List<Linguagem> linguagens = List.of(
    //     new Linguagem("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
    //     new Linguagem("php", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png", 2)
    // );

    // @GetMapping(value="/linguagens")
    // public List<Linguagem> obterLinguagens(){
    //     return linguagens;
    // }

    /// Consumindo do Spring fim

    /// Consumindo do MongoDB
    // anotação @Autowired para o spring gerenciar, injetar o objeto pronto aqui
    // anotação @RequestBody para indicar que se estar passando no corpo da requisição uma Linguagem

    @Autowired
    private LinguagemRepository repositorio;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
    }
    
    @PostMapping("/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem){
        Linguagem linguagemSalva = repositorio.save(linguagem);
        return linguagemSalva;
    }

    //TODO fazer os outros métodos crud aqui !
    //TODO fazer o obterLinguagens ordenar por ranking

    /// Consumindo do MongoDB fim
    
}
