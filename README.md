# Spring Boot Workshop 

Este é um projeto de API robusta desenvolvida em Java com o Spring Framework, focado em boas práticas de desenvolvimento backend e pronto para produção.

 Tecnologias e Ferramentas
- **Java 21** (LTS)
- **Spring Boot**
- **Maven** (Gerenciamento de dependências)
- **Docker** (Containerização para implantação)
- **Render** (Plataforma de Cloud/Hospedagem)

 Diferencial Técnico: Deploy com Docker
Para garantir que a aplicação rode perfeitamente em qualquer ambiente de nuvem (independente do suporte nativo da plataforma hospedeira), o projeto foi totalmente containerizado utilizando **Docker**. 

O pipeline de build e execução foi estruturado em estágios (Multi-stage build) no `Dockerfile`:
1. **Estágio de Compilação:** Utiliza o Maven e JDK 21 para gerar o artefato `.jar`.
2. **Estágio de Execução:** Uma imagem leve do Eclipse Temurin 21 roda a aplicação de forma otimizada.

# Como Executar o Projeto

### Localmente com Docker
Se você tiver o Docker instalado, basta rodar o comando na raiz do projeto:
```bash
docker build -t springboot-workshop .
docker run -p 8080:8080 springboot-workshop

---
