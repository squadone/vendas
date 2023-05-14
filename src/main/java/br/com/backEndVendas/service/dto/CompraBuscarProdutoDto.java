package br.com.backEndVendas.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraBuscarProdutoDto {

    private int idProduto,qtdEstoque;
    private String nomeProduto;
    private double precoUnit;

}
