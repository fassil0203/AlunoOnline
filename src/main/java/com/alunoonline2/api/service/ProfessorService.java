package com.alunoonline2.api.service;

import com.alunoonline2.api.model.Professor;
import com.alunoonline2.api.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository repository;

    public Professor criar(Professor professor)
    {return repository.save(professor);}


}
