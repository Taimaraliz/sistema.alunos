package br.com.edu.sistema.alunos.br.edu.sistema.alunos.serviceImplements;

import br.com.edu.sistema.alunos.br.edu.sistema.alunos.entity.Aluno;
import br.com.edu.sistema.alunos.br.edu.sistema.alunos.repository.AlunoRepository;
import br.com.edu.sistema.alunos.br.edu.sistema.alunos.service.AlunoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class AlunoServiceImplements implements AlunoService {

     private AlunoRepository alunoRepository;

    public AlunoServiceImplements(AlunoRepository alunoRepository) {
        super();
        this.alunoRepository = alunoRepository;
    }

    @Override
    public List<Aluno> getAllAlunos(){
        return alunoRepository.findAll();

    }

    @Override
    public Aluno salvarAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno getAlunoById(Long id){
        return alunoRepository.findById(id).get();

    }

    @Override
    public Aluno atualizarAluno(Aluno aluno){
        return alunoRepository.save(aluno);

    }
    @Override
    public void excluirAlunoById(Long id){
        alunoRepository.deleteById(id);

    }


}
