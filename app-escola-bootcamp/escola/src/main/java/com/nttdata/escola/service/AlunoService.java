package com.nttdata.escola.service;

import com.nttdata.escola.model.Aluno;
import com.nttdata.escola.repository.AlunoRepository;
import com.nttdata.escola.validatores.AlunoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlunoService  {

    @Autowired
    private AlunoRepository repo;

    @Autowired
    private AlunoValidator valid;

    public List<Aluno> listAll() {
        return repo.findAll();
    }

    public void save(Aluno aluno) {
        if(valid.validarAluno(aluno)) {
            repo.save(aluno);
        }
    }

    public Aluno get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

}
