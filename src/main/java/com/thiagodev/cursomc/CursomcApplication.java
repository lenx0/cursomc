package com.thiagodev.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thiagodev.cursomc.domain.Categoria;
import com.thiagodev.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		//salva os 2 objetos dentro de uma lista e vai para o banco
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}


//A implementação CommandLineRunner, vai permitir implementar 
//um método auxiliar, pra executar alguma ação quando a aplicação iniciar
//Para usar os métodos de salvar, lembrar sempre de criar a dependência CategoriaRepository
//Depois de instanciar os objetos, você precisa salva-los no banco de dados 
//usando o objeto categoriaRepository que foi declarado
//