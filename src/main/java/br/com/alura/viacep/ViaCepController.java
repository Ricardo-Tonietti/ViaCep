package br.com.alura.viacep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ViaCepController {
	
	@Autowired
	ViaCep viaCep;
	
	@GetMapping(value="{cep}/json",produces = "application/Json")
	//@RequestMapping(value = "/{cep}/json", method = RequestMethod.GET) //buscar todos
	public Endereco buscaEnderecoPor(@PathVariable("cep") String cep) {
		System.out.println(cep);
		return viaCep.buscaEnderecoPor(cep); 
	};

}
