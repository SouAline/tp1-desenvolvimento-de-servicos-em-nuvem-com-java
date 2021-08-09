package br.edu.infnet.infra;

        import br.edu.infnet.domain.Contato;
        import java.util.Collection;
        import java.util.HashMap;
        import org.springframework.stereotype.Repository;

@Repository
public class ContatoRepository {

    private HashMap<Integer, Contato> contatos;
    private static int ids = 4;

    public ContatoRepository() {

        contatos = new HashMap<>();
        contatos.put(1, new Contato(1, "Laura Silveira", "laura@gmail.com", "5198888800"));
        contatos.put(2, new Contato(2, "Vinicius Silveira", "vinicius@gmail.com", "51998653300"));
        contatos.put(3, new Contato(3, "Chloe Silveira", "chloe@gmail.com", "51999887766"));
    }

    public Collection<Contato> listar() {

        return contatos.values();
    }

    public Contato obter(int id) {

        return contatos.get(id);
    }
}