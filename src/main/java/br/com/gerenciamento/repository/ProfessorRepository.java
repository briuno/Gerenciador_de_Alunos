package br.com.gerenciamento.repository;

import br.com.gerenciamento.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    @Query("SELECT a FROM Professor a WHERE a.status = 'ATIVO' ")
    public List<Professor> findByStatusAtivo();

    @Query("SELECT i FROM Professor i WHERE i.status = 'INATIVO' ")
    public List<Professor> findByStatusInativo();

    public List<Professor> findByNomeContainingIgnoreCase(String nome);

}
