package com.utp.servidor.services;

import com.utp.servidor.entidad.Cliente;
import com.utp.servidor.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepository repositorio;

    public List<Cliente> listarTodos(){
        return repositorio.findAll();
    }

    public Cliente buscarPorID(Integer codigo){
        return repositorio.findById(codigo).orElse(null);
    }

    public Cliente registrar(Cliente bean) {

        return repositorio.save(bean);//código del docente tiene que ser 0

    }

    public void actualizar(Cliente bean) {

        repositorio.save(bean);//código del docente tiene que existir
    }

    public void eliminar(Integer codigo) {

        repositorio.deleteById(codigo);
    }
}
