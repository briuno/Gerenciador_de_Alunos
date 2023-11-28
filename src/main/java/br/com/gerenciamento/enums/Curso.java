package br.com.gerenciamento.enums;

public enum Curso {

    ADMINISTRACAO("Administração"),
    INFORMATICA("Informática"),
    CONTABILIDADE("Contabilidade"),
    ENFERMAGEM("Enfermagem"),
    BIOMEDICINA("Biomedicina"),
    DIREITO("Direito"),
    MEDICINA("Medicina"),
    MARKETING("Marketing"),
    VETERINARIA("Veterinária"),
    DESIGN("Design"),
    PSICOLOGIA("Psicologia");

    private String curso;

    private Curso(String curso) {
        this.curso = curso;
    }

}
