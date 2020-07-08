package curso.api.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@GetMapping(value = "/", produces = "application/json")
	@RequestMapping(value = "/usuario")
	public ResponseEntity init(@RequestParam(value = "nome", defaultValue = "Nome não informado.") String nome,
							@RequestParam(value = "salario", defaultValue = "Salario não informado.") Long salario) {
		
		System.out.println("Parametro recebido: " + nome + " e salário: " + salario);
		
		return new ResponseEntity("Olá usuário. Seu nome é: " + nome  + " e salário: " + salario, HttpStatus.OK);
	}

}
