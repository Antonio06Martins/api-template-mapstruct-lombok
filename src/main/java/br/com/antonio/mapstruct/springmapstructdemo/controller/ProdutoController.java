package br.com.antonio.mapstruct.springmapstructdemo.controller;


import br.com.antonio.mapstruct.springmapstructdemo.dto.ProdutoDto;
import br.com.antonio.mapstruct.springmapstructdemo.mapper.ProdutoMapper;
import br.com.antonio.mapstruct.springmapstructdemo.model.Produto;
import br.com.antonio.mapstruct.springmapstructdemo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoMapper produtoMapper;

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<Produto> salva(@RequestBody ProdutoDto produtoDto) {
        return new ResponseEntity<>(produtoRepository.save(
                produtoMapper.dtoToModel(produtoDto)), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDto>> buscaTodos() {
        return new ResponseEntity<>(produtoMapper.modelsToDtos(produtoRepository.findAll()), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDto> buscaPorId(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<>(produtoMapper.modelToDto(produtoRepository.findById(id).get()), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletaPorId(@PathVariable(value = "id") Long id) {
        ProdutoDto produtoDto = produtoMapper.modelToDto(produtoRepository.findById(id).get());
        produtoRepository.deleteById(produtoDto.getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
