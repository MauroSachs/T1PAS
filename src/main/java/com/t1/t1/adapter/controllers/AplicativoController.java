package com.t1.t1.adapter.controllers;

import com.t1.t1.application.dtos.AplicativoDTO;
import com.t1.t1.application.dtos.AplicativoRequestDTO;
import com.t1.t1.application.usecases.aplicativo.AlterarAplicativoUseCase;
import com.t1.t1.application.usecases.aplicativo.CreateAplicativoUseCase;
import com.t1.t1.application.usecases.aplicativo.ListarAplicativosUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aplicativo")
public class AplicativoController {

    private final CreateAplicativoUseCase createAplicativoUseCase;
    private final ListarAplicativosUseCase listarTodosAplicativosUseCase;
    private final AlterarAplicativoUseCase alterarAplicativoUseCase;

    public AplicativoController(CreateAplicativoUseCase createAplicativoUseCase, ListarAplicativosUseCase listarAplicativosUseCase, AlterarAplicativoUseCase alterarAplicativoUseCase) {
        this.createAplicativoUseCase = createAplicativoUseCase;
        this.listarTodosAplicativosUseCase = listarAplicativosUseCase;
        this.alterarAplicativoUseCase = alterarAplicativoUseCase;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AplicativoDTO> create(@RequestBody AplicativoRequestDTO request) {
        try {
            AplicativoDTO aplicativoDTO = createAplicativoUseCase.call(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(aplicativoDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AplicativoDTO>> listarTodos() {
        try {
            List<AplicativoDTO> aplicativos = listarTodosAplicativosUseCase.call();
            return ResponseEntity.ok(aplicativos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PatchMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AplicativoDTO> alterar(@PathVariable Long id, @RequestBody AplicativoRequestDTO request) {
        try {
            AplicativoDTO aplicativoDTO = alterarAplicativoUseCase.call(id, request);
            return ResponseEntity.ok(aplicativoDTO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}