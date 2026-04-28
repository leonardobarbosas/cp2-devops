# CP2 DevOps - API de Alunos

## Descrição

API REST em Spring Boot com CRUD de alunos, conectada a um banco MySQL em container, executando em uma VM na Oracle Cloud.

---

## Tecnologias

* Java 17
* Spring Boot
* MySQL
* Docker 

---

## Endpoint da API

http://136.248.68.118:8080

---

## Endpoints

### Listar alunos

GET /alunos

### Criar aluno

POST /alunos

Body:
{
"nome": "Leonardo",
"idade": 20
}

### Atualizar aluno

PUT /alunos/{id}

### Deletar aluno

DELETE /alunos/{id}


