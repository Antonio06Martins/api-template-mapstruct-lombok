package br.com.antonio.mapstruct.springmapstructdemo.repository;

import br.com.antonio.mapstruct.springmapstructdemo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
