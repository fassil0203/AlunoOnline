package com.alunoonline2.api.controller;

import com.alunoonline2.api.model.Disciplina;
import com.alunoonline2.api.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DisciplinaController {


    @Autowired
    DisciplinaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Disciplina> criar(@RequestBody Disciplina disciplina) {
        Disciplina disciplinaCriada = service.criar(disciplina);

        return ResponseEntity.status(201).body(disciplinaCriada);
    }

    @GetMapping("/professor/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Disciplina> listarDisciplinasPeloProfessorId(@PathVariable Long id){
        return service.listarDisciplinasPeloProfessorId(id);
    }



}
