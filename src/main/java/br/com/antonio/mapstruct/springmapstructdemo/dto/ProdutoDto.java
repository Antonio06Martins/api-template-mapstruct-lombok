package br.com.antonio.mapstruct.springmapstructdemo.dto;

import br.com.antonio.mapstruct.springmapstructdemo.model.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class ProdutoDto {

    @Id
    private Long id;
    private String nome;
    private String marca;
    private String descricao;
    private String quantidade;
    private BigDecimal valor;
    //private String itemId;

    //private List<Item> itensList;
}
