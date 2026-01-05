# Desafio CRUD

<p align="center">
  <img src="https://spring.io/img/projects/spring-boot.svg" alt="Spring Boot" width="180"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-4.x-brightgreen"/>
  <img src="https://img.shields.io/badge/Java-21-blue"/>
</p>

---
### Adicionei a classe ResourceConflictException para um possível conflito de CPF, coloquei coincidentemente o mesmo CPF no primeiro ID do SEED do banco de dados, usado para corrigir o desafio, assim tratei mais uma possível exception:
  <img width="876" height="420" alt="Captura de tela de 2026-01-05 02-08-53" src="https://github.com/user-attachments/assets/6549785a-a225-43af-85a6-a521ca2a44d1" />

---
```

public class ResourceConflictException extends RuntimeException {
    public ResourceConflictException(String msg) {
        super(msg);
    }
}
```
---
<img width="869" height="466" alt="Captura de tela de 2026-01-05 02-05-23" src="https://github.com/user-attachments/assets/8349dd4a-e508-4e4a-9ae1-4a84fc64dd06" />

<img width="877" height="354" alt="Captura de tela de 2026-01-05 02-05-45" src="https://github.com/user-attachments/assets/c9a6311f-9e8e-4349-9ed2-ee12b02ec259" />
