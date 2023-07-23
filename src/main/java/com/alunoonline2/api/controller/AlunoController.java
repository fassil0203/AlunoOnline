    package com.alunoonline2.api.controller;

    import com.alunoonline2.api.model.Aluno;
    import com.alunoonline2.api.service.AlunoService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.Optional;

    @RestController
    @RequestMapping("/aluno")

        public class AlunoController {

        @Autowired
        AlunoService service;

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
            Aluno alunoCriado = service.criar(aluno);

            return ResponseEntity.status(201).body(alunoCriado);

        }

        @GetMapping("/listar-todos")

        @ResponseStatus(HttpStatus.OK)

        public List<Aluno> listarTodos() {

            return service.listarTodos();
        }

        @GetMapping("/{id}")
        @ResponseStatus(HttpStatus.OK)

        public Optional<Aluno> procurarPeloId(@PathVariable Long id) {

            return service.procurarPeloId(id);
        }

        @DeleteMapping("/{Id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)

        public void delete(@PathVariable Long id) {

            service.delete(id);
        }
    }

