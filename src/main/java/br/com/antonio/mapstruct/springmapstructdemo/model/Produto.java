package br.com.antonio.mapstruct.springmapstructdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;
    private String desc;
    private int quantidade;
    private BigDecimal valor;
    //private String itemId;

    //private List<Item> itens;
}
