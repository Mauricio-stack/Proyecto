package com.utp.servidor.controller;

import com.utp.servidor.dto.ClienteDTO;
import com.utp.servidor.entidad.Cliente;
import com.utp.servidor.services.ClienteServices;
import com.utp.servidor.utils.MensajeResponse;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteServices service;

    //endpoint para registrar
    @Autowired
    private ModelMapper mapper;

    //endpoint para registrar
    @PostMapping("/guardar")
    public ResponseEntity<?> guardar(@Valid @RequestBody ClienteDTO bean) {
        try {
            Cliente doc=mapper.map(bean, Cliente.class);
            Cliente d=service.registrar(doc);
            ClienteDTO dto=mapper.map(d, ClienteDTO.class);

            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje("Guardado correctamente")
                    .object(dto).build(), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(MensajeResponse.builder()
                    .mensaje(e.getMessage())
                    .object(null).build(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //endpoint para listar
    @GetMapping("/listar")
    public List<Cliente> listar(){
        return service.listarTodos();
    }
    //endpoint para buscar
    @GetMapping("/buscar/{codigo}")
    public Cliente buscar(@PathVariable Integer codigo){
        return service.buscarPorID(codigo);
    }
}
