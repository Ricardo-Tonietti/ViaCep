package br.com.alura.viacep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="ViaCep", url="https://viacep.com.br/ws/")
public interface ViaCep {
	
	@GetMapping(value="{cep}/json", produces = "application/Json")
	Endereco buscaEnderecoPor(@PathVariable("cep") String cep);

}
