package br.com.gerenciamento.model;

import br.com.gerenciamento.enums.Curso;
import br.com.gerenciamento.enums.Status;
import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    @Size(min = 5, max = 35, message = "O Nome deve conter entre 5 a 35 caracteres")
    @NotBlank(message = "O nome não pode ser vazio")
    @NotNull
    private String nome;

    @Column(name = "curso")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Curso curso;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
