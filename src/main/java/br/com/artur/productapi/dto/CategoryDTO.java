package br.com.artur.productapi.dto;

import br.com.artur.productapi.model.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {

    private Long id;
    private String nome;

    public static CategoryDTO convert(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(categoryDTO.getId());
        categoryDTO.setNome(category.getNome());
        return categoryDTO;
    }
}
