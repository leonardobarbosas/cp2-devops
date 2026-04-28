package br.com.oci.escola.model;
import jakarta.persistence.*;
@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String curso;
    private int semestre;
    private String email;
    public Aluno() {}
    public Aluno(String nome, String curso, int semestre, String email) {
        this.nome = nome; this.curso = curso;
        this.semestre = semestre; this.email = email;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
