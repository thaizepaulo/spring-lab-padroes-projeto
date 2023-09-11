package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.dto.ClienteSalvarDto;
import one.digitalinnovation.gof.model.Cliente;

/**
 *
 * Interface que define o padrão <b>Strategy</b> no domínio do cliente.
 * Com isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 *
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    Cliente inserir(ClienteSalvarDto cliente);
    Cliente atualizar(Long id, ClienteSalvarDto cliente);
    void deletar(Long id);

}
