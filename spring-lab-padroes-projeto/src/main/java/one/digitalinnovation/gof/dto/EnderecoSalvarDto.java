package one.digitalinnovation.gof.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import one.digitalinnovation.gof.model.Endereco;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoSalvarDto {
    private String cep;

    public EnderecoSalvarDto(Endereco endereco) {
        this.cep = endereco.getCep();
    }
}
