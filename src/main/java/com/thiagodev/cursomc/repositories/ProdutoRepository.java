package com.thiagodev.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiagodev.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	

}
//Integer é o tipo do atributo identificador da classe produto, pois é o ID da classe.
//produto é o tipo do objeto, que no caso será do tipo produto.
//Agora, feito tudo isso, um objeto do tipo CategoriaRepository vai ser capaz de realizar 
//operações de acesso a dados pode ser buscar, 
//alterar deletar, pesquisar, referentes ao 
//objeto produto, que por sua vez está mapeado 
//com a tabela produto com o banco de dados.