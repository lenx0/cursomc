package com.thiagodev.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagodev.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	

}
//Integer é o tipo do atributo identificador da classe categoria, pois é o ID da classe.
//Categoria é o tipo do objeto, que no caso será do tipo Categoria.
//Agora, feito tudo isso, um objeto do tipo CategoriaRepository vai ser capaz de realizar 
//operações de acesso a dados pode ser buscar, 
//alterar deletar, pesquisar, referentes ao 
//objeto categoria, que por sua vez está mapeado 
//com a tabela categoria com o banco de dados.