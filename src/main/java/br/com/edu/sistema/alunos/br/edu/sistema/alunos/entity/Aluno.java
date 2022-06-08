package br.com.edu.sistema.alunos.br.edu.sistema.alunos.entity;

import javax.persistence.*;

@Entity
@Table(name="alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator ="seq_aluno")
    private long id;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="sobrenome")
    private String sobrenome;

    @Column(name="idade")
    private int  idade;

    @Column(name="email")
    private String email;


    public String getSobrenome() {
        return sobrenome;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Aluno() {

    }

    public Aluno(String nome, String sobrenome, int idade, String email) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.email = email;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
