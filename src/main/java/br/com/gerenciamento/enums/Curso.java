package br.com.gerenciamento.enums;

public enum Curso {

    ADMINISTRACAO("Administração"),
    INFORMATICA("Informática"),
    CONTABILIDADE("Contabilidade"),
    ENFERMAGEM("Enfermagem"),
    BIOMEDICINA("Biomedicina"),
    DIREITO("Direito"),
    Medicina("Medicina"),
    Marketing("Marketing"),
    VETERINARIA("Veterinária"),
    DESIGN("Design"),
    PSICOLOGIA("Psicologia");

    private String curso;

    private Curso(String curso) {
        this.curso = curso;
    }

}
