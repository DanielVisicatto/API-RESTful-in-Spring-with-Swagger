package dio.myfirstwebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to my 1st SpringBoot We API";
    }
}
/*Controller é uma classe que contém anotações específicas para a disponibilização de recursos HTTP
baseados em nossos serviços e regras de negócios.
Anotações mais comuns:

@RestController = Responsável por designar bean component que suporta requisições HTTP com base na
arquitetura REST.
@RequestMapping("prefix") = Determina  qual a URI comum para todos os recursos disponibilizados pela
controller.
@GetMapping = Determina que o método HTTP aceitará requisições do tipo GET.
@PostMapping = Determina que o método HTTP aceitará requisições do tipo POST.
@PutMapping = Determina que o método HTTP aceitará requisições do tipo PUT.
@DeleteMapping = Determina que o método HTTP aceitará requesições do tipo DELETE.
@RequestBody = Converte um JSON para o tipo do objeto esperado como parâmetro no método.
@PathVariable = Consegue determinar que parte da URI será composta por parâmetros recebidos
nas requisições.

Vamos fazer um Controle de Usuários, que terá nossas requisições.
 */
