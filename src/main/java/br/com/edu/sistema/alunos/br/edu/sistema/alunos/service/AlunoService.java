package br.com.edu.sistema.alunos.br.edu.sistema.alunos.service;

import br.com.edu.sistema.alunos.br.edu.sistema.alunos.entity.Aluno;
import java.util.List;

public interface AlunoService {

    List<Aluno> getAllAlunos();


    Aluno salvarAluno(Aluno aluno);


    Aluno getAlunoById(Long id);

    Aluno atualizarAluno(Aluno aluno);


    void excluirAlunoById(Long id);
}
