package br.com.oci.escola;
import br.com.oci.escola.model.Aluno;
import br.com.oci.escola.repository.AlunoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.List;


@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(AlunoRepository repository) {
        return args -> {

            if (repository.count() == 0) {

                repository.saveAll(List.of(
                        new Aluno("Leonardo", 20),
                        new Aluno("Maria", 22),
                        new Aluno("João", 19),
                        new Aluno("Ana", 21),
                        new Aluno("Carlos", 23)
                ));

                System.out.println("✅ 5 alunos inseridos!");
            } else {
                System.out.println("ℹ️ Banco já possui dados.");
            }
        };
    }
}