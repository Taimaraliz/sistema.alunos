package br.com.edu.sistema.alunos.br.edu.sistema.alunos.repository;

import br.com.edu.sistema.alunos.br.edu.sistema.alunos.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
