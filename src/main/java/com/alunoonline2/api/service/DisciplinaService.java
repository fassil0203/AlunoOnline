package com.alunoonline2.api.service;

import com.alunoonline2.api.model.Disciplina;
import com.alunoonline2.api.repository.DisciplinaRepository;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class DisciplinaService {

    @Autowired
    DisciplinaRepository repository;


    public Disciplina criar(Disciplina disciplina){
        return repository.save(disciplina);
    }

    public List<Disciplina> listarDisciplinasPeloProfessorId(Long professorId) {

        return repository.findByProfessorId(professorId);
    }

    }
