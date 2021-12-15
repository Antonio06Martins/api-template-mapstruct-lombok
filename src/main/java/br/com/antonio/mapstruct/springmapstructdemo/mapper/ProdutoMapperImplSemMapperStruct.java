//package br.com.antonio.mapstruct.springmapstructdemo.mapper;
//
//import br.com.antonio.mapstruct.springmapstructdemo.dto.ProdutoDto;
//import br.com.antonio.mapstruct.springmapstructdemo.model.Produto;
//
//public class ProdutoMapperImplSemMapperStruct implements ProdutoMapper {
//
//    @Override
//    public ProdutoDto modelToDto(Produto produto) {
//
//        ProdutoDto produtoDto = new ProdutoDto();
//
//        produtoDto.setId(produto.getId());
//        produtoDto.setNome(produto.getNome());
//        produtoDto.setMarca(produto.getMarca());
//        produtoDto.setQuantidade(produto.getQuantidade());
//        produtoDto.setValor(produto.getValor());
//
//        return produtoDto;
//    }
//
//    @Override
//    public Produto dtoToModel(ProdutoDto produtoDto) {
//
//        Produto produto = new Produto();
//
//        produto.setId(produtoDto.getId());
//        produto.setNome(produtoDto.getNome());
//        produto.setMarca(produtoDto.getMarca());
//        produto.setQuantidade(produtoDto.getQuantidade());
//        produto.setValor(produtoDto.getValor());
//
//        return produto;
//    }
//}

// Adicionando a dependencia do MapperStruct e em seguinda compilando(compile) temos a classe de
// implementação da interface ProdutoMapper gerada na pasta target***