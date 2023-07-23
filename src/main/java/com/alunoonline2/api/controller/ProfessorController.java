package com.alunoonline2.api.controller;


import com.alunoonline2.api.model.Professor;
import com.alunoonline2.api.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professor")

public class ProfessorController {

    ProfessorService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Professor> criar(@RequestBody Professor professor){

        Professor professorCriado = service.criar(professor);

        return ResponseEntity.status(201).body(professorCriado);
    }

}
