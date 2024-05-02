package com.t1.t1.adapter.controllers;

import com.t1.t1.application.dtos.ClienteDTO;
import com.t1.t1.application.dtos.ClienteRequestDTO;
import com.t1.t1.application.usecases.cliente.AlterarClienteUseCase;
import com.t1.t1.application.usecases.cliente.CreateClienteUseCase;
import com.t1.t1.application.usecases.cliente.ListarClientesUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final CreateClienteUseCase createClienteUseCase;
    private final ListarClientesUseCase listarTodosClientesUseCase;
    private final AlterarClienteUseCase alterarClienteUseCase;

    public ClienteController(CreateClienteUseCase createClienteUseCase, ListarClientesUseCase listarClientesUseCase, AlterarClienteUseCase alterarClienteUseCase) {
        this.createClienteUseCase = createClienteUseCase;
        this.listarTodosClientesUseCase = listarClientesUseCase;
        this.alterarClienteUseCase = alterarClienteUseCase;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteDTO> create(@RequestBody ClienteRequestDTO request) {
        try {
            ClienteDTO clienteDTO = createClienteUseCase.call(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(clienteDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ClienteDTO>> listarTodos() {
        try {
            List<ClienteDTO> clientes = listarTodosClientesUseCase.call();
            return ResponseEntity.ok(clientes);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PatchMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteDTO> alterar(@PathVariable Long id, @RequestBody ClienteRequestDTO request) {
        try {
            ClienteDTO clienteDTO = alterarClienteUseCase.call(id, request);
            return ResponseEntity.ok(clienteDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
