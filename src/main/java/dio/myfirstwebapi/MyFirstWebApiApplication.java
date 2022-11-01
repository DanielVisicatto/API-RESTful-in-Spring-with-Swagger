package dio.myfirstwebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebApiApplication.class, args);
	}

}
/*
A anotação @ControllerAdvice nos permite consolidar nossos múltiplos @ExceptionHandlers espalhados
de antes, em um único componente global de tratamento de erros.
- Isso nos dá controle total sobre corpo da resposta, bem como o código do Status.
- Ele fornece o mapeamento de várias exceções ao mesmo método, para serem tratadas em conjunto.
- Ele faz bom uso da resposta RESTful ResponseEntity mais recente.
 */
