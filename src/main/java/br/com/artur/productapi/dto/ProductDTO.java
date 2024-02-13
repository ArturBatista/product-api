package br.com.artur.productapi.dto;

import br.com.artur.productapi.model.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    @NotBlank
    private String productIdentifier;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotNull
    private Float preco;
    @NotNull
    private CategoryDTO categoryDTO;

    public static ProductDTO convert(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setNome(product.getNome());
        productDTO.setPreco(product.getPreco());
        productDTO.setProductIdentifier(productDTO.getProductIdentifier());
        productDTO.setDescricao(product.getDescricao());
        if(product.getCategory() != null){
            productDTO.setCategoryDTO(
                CategoryDTO.convert(product.getCategory())
            );
        }
        return productDTO;
    }
}
