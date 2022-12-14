package com.nttdata.ministerio_educacao.validatores;

import com.nttdata.ministerio_educacao.model.Aluno;
import com.nttdata.ministerio_educacao.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AlunoValidator {

    @Autowired
    private AlunoRepository repository;

    public Aluno postAluno(Aluno aluno) {
        if (aluno.getIdade() - aluno.getEscolaridade() == 5){
             return repository.save(aluno);
        }else {
            return null;
        }
    }
}
