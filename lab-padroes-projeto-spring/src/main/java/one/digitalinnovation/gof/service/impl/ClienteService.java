/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;

/**
 *
 * @author Aldernei
 */
public interface ClienteService {
    
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId (Long id);
    void inserir(Cliente cliente);
    void atualizar (Long id, Cliente cliente);
    void deletar(Long id);
}
