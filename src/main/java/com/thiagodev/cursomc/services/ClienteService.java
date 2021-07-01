package com.thiagodev.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thiagodev.cursomc.domain.Cliente;
import com.thiagodev.cursomc.repositories.ClienteRepository;
import com.thiagodev.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));

	}

}

//Categoria no método, é o tipo de dados que o método vai retornar.
//como implementar um serviço que busca uma categoria?
//esse serviço tem que chamar uma operação do objeto de acesso a dados, que vai ser do tipo CategoriaRepository
//por isso é instanciado uma dependencia de um objeto do tipo CategoriaRepository
//@Autowired é usado para instanciar um repository