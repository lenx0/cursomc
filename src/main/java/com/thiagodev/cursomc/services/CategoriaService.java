package com.thiagodev.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagodev.cursomc.domain.Categoria;
import com.thiagodev.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}
	
	
}

//Categoria no método, é o tipo de dados que o método vai retornar.
//como implementar um serviço que busca uma categoria?
//esse serviço tem que chamar uma operação do objeto de acesso a dados, que vai ser do tipo CategoriaRepository
//por isso é instanciado uma dependencia de um objeto do tipo CategoriaRepository
//@Autowired é usado para instanciar um repository