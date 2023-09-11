package one.digitalinnovation.gof.service;

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
    Cliente inserir(Cliente cliente);
    Cliente atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
