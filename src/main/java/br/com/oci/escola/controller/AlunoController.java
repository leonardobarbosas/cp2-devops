package br.com.oci.escola.controller;
import br.com.oci.escola.model.Aluno;
import br.com.oci.escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoRepository repository;
    @GetMapping
    public List<Aluno> listarTodos() { return repository.findAll(); }
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarPorId(@PathVariable Long id) {
        return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/curso/{curso}")
    public List<Aluno> buscarPorCurso(@PathVariable String curso) { return repository.findByCurso(curso); }
    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) { return repository.save(aluno); }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!repository.existsById(id)) return ResponseEntity.notFound().build();
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
