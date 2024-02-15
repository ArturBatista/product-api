package br.com.artur.productapi.converter;

import br.com.artur.productapi.model.Category;
import br.com.artur.productapi.model.Product;
import br.com.artur.shoppingclient.dto.CategoryDTO;
import br.com.artur.shoppingclient.dto.ProductDTO;

public class DTOConverter {
    public static CategoryDTO convert(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setNome(category.getNome());
        return categoryDTO;
    }

    public static ProductDTO convert(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductIdentifier(product.getProductIdentifier());
        productDTO.setDescricao(product.getDescricao());
        productDTO.setNome(product.getNome());
        productDTO.setPreco(product.getPreco());
        if(product.getCategory() != null){
            productDTO.setCategoryDTO(
                DTOConverter.convert(product.getCategory())
            );
        }
        return productDTO;
    }
}
