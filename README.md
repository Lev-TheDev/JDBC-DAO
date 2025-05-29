🏦 Vendedor-Departamento: Operações JDBC com DAO
✨ Sobre o Projeto
Bem-vindo ao projeto Vendedor-Departamento! 🚀 Este é um sistema robusto desenvolvido em Java que demonstra a implementação de operações CRUD (Create, Read, Update, Delete) em um banco de dados MySQL, utilizando o padrão DAO (Data Access Object) e a tecnologia JDBC (Java Database Connectivity).

O objetivo principal deste projeto é simular um cenário de gerenciamento de dados para vendedores e seus respectivos departamentos, realizando diversas operações de persistência de forma eficiente e organizada.

🛠️ Tecnologias Utilizadas
Java: Linguagem de programação principal.

JDBC: API para conexão e manipulação de banco de dados.

MySQL: Sistema de gerenciamento de banco de dados relacional.

DAO Pattern: Padrão de projeto para abstração da camada de persistência.

🚀 Funcionalidades
Este projeto oferece as seguintes operações essenciais:

insert ➕: Adiciona um novo vendedor ou departamento ao banco de dados.

update ✏️: Atualiza informações de um vendedor ou departamento existente.

deleteById 🗑️: Remove um vendedor ou departamento com base no seu ID.

findById 🔍: Busca e retorna um vendedor ou departamento específico pelo seu ID.

findAll 📚: Retorna uma lista completa de todos os vendedores ou departamentos.

findByDepartment 💼: Permite buscar vendedores associados a um departamento específico.

⚙️ Configuração e Execução
Para rodar este projeto em sua máquina local, siga os passos abaixo:

Pré-requisitos
Certifique-se de ter instalado:

JDK (Java Development Kit): Versão 11 ou superior.

MySQL Server: E um cliente MySQL (ex: MySQL Workbench, DBeaver) para gerenciar o banco de dados.

Configuração do Banco de Dados
Crie um banco de dados MySQL chamado coursejdbc (ou o nome que preferir, lembrando de ajustar no código).

Execute o script SQL para criar as tabelas Department e Seller. Você pode encontrar o script no diretório src/main/resources (ou similar) do projeto, ou criar manualmente com as seguintes estruturas:

CREATE TABLE Department (
  Id INT NOT NULL AUTO_INCREMENT,
  Name VARCHAR(60) NOT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE Seller (
  Id INT NOT NULL AUTO_INCREMENT,
  Name VARCHAR(60) NOT NULL,
  Email VARCHAR(100) NOT NULL,
  BirthDate DATETIME NOT NULL,
  BaseSalary DOUBLE NOT NULL,
  DepartmentId INT NOT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY (DepartmentId) REFERENCES Department(Id)
);

Preencha as tabelas com alguns dados de exemplo para testar as operações.

Configuração do Projeto Java
Clone este repositório para o seu ambiente local:

git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git

(Substitua SEU_USUARIO e SEU_REPOSITORIO pelos seus dados reais.)

Abra o projeto em sua IDE Java favorita (IntelliJ IDEA, Eclipse, VS Code).

Verifique o arquivo de configuração do banco de dados (geralmente db.properties ou similar) e ajuste as credenciais de acesso ao seu MySQL (usuário, senha, porta).

Certifique-se de que as bibliotecas JDBC para MySQL (MySQL Connector/J) estejam configuradas no seu pom.xml (se for um projeto Maven) ou adicionadas ao classpath do projeto.

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.28</version> </dependency>

Executando o Projeto
Após a configuração, você pode executar as classes principais que contêm os exemplos de operações DAO. Procure por classes com métodos main() que demonstram as funcionalidades de insert, update, deleteById, findById, findAll e findByDepartment.

🧑‍💻 Como Contribuir
Contribuições são sempre bem-vindas! Se você tiver ideias para melhorias, novas funcionalidades ou encontrar algum bug, sinta-se à vontade para abrir uma issue ou enviar um pull request.

Faça um fork do projeto.

Crie uma nova branch para sua funcionalidade (git checkout -b feature/nova-funcionalidade).

Faça suas alterações e commit (git commit -am 'Adiciona nova funcionalidade').

Envie suas alterações para o fork (git push origin feature/nova-funcionalidade).

Abra um Pull Request.

📄 Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
