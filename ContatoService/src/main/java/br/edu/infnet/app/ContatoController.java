package br.edu.infnet.app;

import br.edu.infnet.domain.Contato;
import br.edu.infnet.infra.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping({"/contatos"})
public class ContatoController {

    @Autowired
    private ContatoRepository repository;

    @GetMapping
    public Collection<Contato> listarContatos() {

        return repository.listar();
    }

    @GetMapping(path = {"/{id}"})
    public Contato obterContato(@PathVariable int id) {

        return repository.obter(id);
    }
}