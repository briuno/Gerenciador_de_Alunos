package br.com.gerenciamento.controller;

import br.com.gerenciamento.repository.ProfessorRepository;
import br.com.gerenciamento.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.util.List;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/inserirProfessores")
    public ModelAndView insertProfessores(Professor professor) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Professor/formProfessor");
        modelAndView.addObject("professor", new Professor());
        return modelAndView;
    }

    @PostMapping("InsertProfessores")
    public ModelAndView inserirProfessor(@Valid Professor professor, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        if(bindingResult.hasErrors()) {
            modelAndView.setViewName("Professor/formProfessor");
            modelAndView.addObject("professor");
        } else {
        modelAndView.setViewName("redirect:/professores-adicionados");
        professorRepository.save(professor);
        }
        return modelAndView;
    }

    @GetMapping("professores-adicionados")
    public ModelAndView listagemProfessores() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Professor/listProfessor");
        modelAndView.addObject("professoresList", professorRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/professor/editar/{id}")
    public ModelAndView editar(@PathVariable("id")Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Professor/editar");
        Professor professor = professorRepository.getById(id);
        modelAndView.addObject("professor", professor);
        return modelAndView;
    }

    @PostMapping("/professor/editar")
    public ModelAndView editar(Professor professor) {
        ModelAndView modelAndView = new ModelAndView();
        professorRepository.save(professor);
        modelAndView.setViewName("redirect:/professor-adicionados");
        return modelAndView;
    }

    @GetMapping("/professor/remover/{id}")
    public String removerProfessor(@PathVariable("id") Long id) {
        professorRepository.deleteById(id);
        return "redirect:/professores-adicionados";
    }

    @GetMapping("filtro-professores")
    public ModelAndView filtroProfessores() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Professor/filtroProfessores");
        return modelAndView;
    }

    @GetMapping("professores-ativos")
    public ModelAndView listaProfessoresAtivos() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Professor/professores-ativos");
        modelAndView.addObject("professoresAtivos", professorRepository.findByStatusAtivo());
        return modelAndView;
    }

    @GetMapping("professores-inativos")
    public ModelAndView listaProfessoresInativos() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Professor/professores-inativos");
        modelAndView.addObject("professoresInativos", professorRepository.findByStatusInativo());
        return modelAndView;
    }

    @PostMapping("/pesquisar-professores")
    public ModelAndView pesquisarProfessores(@RequestParam(required = false) String nome) {
        ModelAndView modelAndView = new ModelAndView();
        List<Professor> listaProfessores;
        if(nome == null || nome.trim().isEmpty()) {
            listaProfessores = professorRepository.findAll();
        } else {
            listaProfessores = professorRepository.findByNomeContainingIgnoreCase(nome);
        }
        modelAndView.addObject("ListaDeProfessores", listaProfessores);
        modelAndView.setViewName("Professor/pesquisa-resultado");
        return modelAndView;
    }
}
