package one.digitalinnovation.gof.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import one.digitalinnovation.gof.dto.ClienteSalvarDto;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;

    public Cliente(ClienteSalvarDto clienteSalvarDto) {
        this.nome = clienteSalvarDto.getNome();
        this.endereco = new Endereco(clienteSalvarDto.getEndereco());
    }

}
