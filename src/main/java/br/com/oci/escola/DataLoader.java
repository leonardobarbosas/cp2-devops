package br.com.oci.escola;
import br.com.oci.escola.model.Aluno;
import br.com.oci.escola.repository.AlunoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class DataLoader implements CommandLineRunner {
    private final AlunoRepository repository;
    public DataLoader(AlunoRepository repository) { this.repository = repository; }
    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            repository.saveAll(List.of(
                new Aluno("Ana Lima",       "ADS", 2, "ana.lima@escola.com"),
                new Aluno("Bruno Souza",    "SI",  3, "bruno.souza@escola.com"),
                new Aluno("Carla Matos",    "CC",  1, "carla.matos@escola.com"),
                new Aluno("Diego Nunes",    "ADS", 4, "diego.nunes@escola.com"),
                new Aluno("Elisa Ramos",    "EC",  2, "elisa.ramos@escola.com"),
                new Aluno("Felipe Costa",   "SI",  1, "felipe.costa@escola.com"),
                new Aluno("Gabriela Rocha", "CC",  3, "gabriela.rocha@escola.com"),
                new Aluno("Henrique Lima",  "ADS", 5, "henrique.lima@escola.com")
            ));
            System.out.println("✅ 8 alunos inseridos!");
        }
    }
}
