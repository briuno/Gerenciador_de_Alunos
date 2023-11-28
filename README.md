## Sobre o Projeto:

Uma aplicação web modelada no padrão MVC em Java e construída com o Spring Boot, o projeto conta com uma estrutura de CRUD, no qual os dados estão sendo persistidos em um banco de dados (MySQL). Na camada de visualização foi utilizado HTML, CSS, o framework Bootstrap e o template Thymeleaf.  Também foi utilizado o JavaScript para validação de uma regra de negócio. O sistema possui outras funcionalidades como, tela de login/cadastro, criptografia de dados do usuário, entre outras.
 
## Tecnologias Utilizadas

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- HTML/CSS/JS
- Bootstrap
- MySQL

### Formulário de Cadastro
<img src=".github/Formulario.jpg" alt="Formulario" />

### Opções de Lista
<img src=".github/Procura.jpg" alt="Procura" />

### Lista de Alunos
<img src=".github/Lista.jpg" alt="Lista" />


## Banco de Dados

### Entidade Aluno
![Entidade Aluno](https://user-images.githubusercontent.com/89096854/170030916-5c05c8c3-71d7-432e-aa6c-02b0ccf30409.PNG)

### Entidade Usuário
![Entidade Usuario](https://user-images.githubusercontent.com/89096854/170030921-8948e471-b0c1-4fcc-94aa-4bc94a554df9.PNG)

## Instalação

O projeto é gerenciado pelo Maven, então para usa-lo basta importa-lo para uma IDE.

## Configurações do banco de dados
Você pode criar um banco de dados MySQL com o nome o nome de sua preferência, porém é necessario adequar o projeto de acordo com as suas configurações. Para isso abra o arquivo application.properties, localizado em src/main/resources/application.properties e altere os seguintes comandos ao arquivo:

```
spring.datasource.url = Sua URL MySQL
spring.datasource.username = Seu username
spring.datasource.password = Sua Senha
```
 

## Execução
Execute o projeto através do IDE, abra um navegador de sua preferência e digite: http://localhost:8080
