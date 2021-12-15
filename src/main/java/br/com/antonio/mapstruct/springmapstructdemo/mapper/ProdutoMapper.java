package br.com.antonio.mapstruct.springmapstructdemo.mapper;

import br.com.antonio.mapstruct.springmapstructdemo.dto.ProdutoDto;
import br.com.antonio.mapstruct.springmapstructdemo.model.Produto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = UUID.class)
public interface ProdutoMapper {

    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    @Mapping(source = "produto.desc", target = "descricao", defaultValue = "descricao")
//    @Mapping(target = "itemId", expression = "java(UUID.randomUUID().toString())")
//    @Mapping(source = "produto.itens", target = "itensList")
    ProdutoDto modelToDto(Produto produto);

    List<ProdutoDto> modelsToDtos(List<Produto> produtos);

    //@Mapping(source = "produtoDto.descricao", target = "desc", defaultValue = "descricao")
    @InheritInverseConfiguration
    Produto dtoToModel(ProdutoDto produtoDto);
}
