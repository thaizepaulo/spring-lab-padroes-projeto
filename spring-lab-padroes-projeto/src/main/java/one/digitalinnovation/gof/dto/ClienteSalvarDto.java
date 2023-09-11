package one.digitalinnovation.gof.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import one.digitalinnovation.gof.model.Cliente;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteSalvarDto {
    private String nome;
    private EnderecoSalvarDto endereco;

    public ClienteSalvarDto(Cliente cliente) {
        this.nome = cliente.getNome();
        this.endereco = new EnderecoSalvarDto(cliente.getEndereco());
    }

}
