# 📋 Sistema de Cadastro e Listagem de Usuários

## 📖 Descrição

Este projeto consiste em uma aplicação web desenvolvida em **Java**, utilizando **Servlets**, **JSP** e uma organização baseada no padrão **MVC (Model-View-Controller)**.

O sistema permite realizar o cadastro de usuários informando **nome** e **e-mail**, além de disponibilizar uma página para visualização de todos os usuários cadastrados durante a execução da aplicação.

O objetivo principal do projeto é aplicar os conceitos estudados em sala de aula relacionados ao desenvolvimento web com Java, separação de responsabilidades entre camadas e validação de dados.

---

## 🚀 Funcionalidades

### ✅ Cadastro de Usuários

* Cadastro de usuários através de formulário web.
* Geração automática de identificador (ID).
* Validação de campos obrigatórios.
* Verificação de e-mails duplicados.

### ✅ Listagem de Usuários

* Exibição de todos os usuários cadastrados.
* Apresentação dos dados em formato tabular.
* Atualização automática da lista após novos cadastros.

---

## 🏗️ Arquitetura Utilizada

O projeto foi organizado seguindo os princípios básicos do padrão MVC:

### Model

Responsável pela representação dos dados da aplicação.

* `Usuario.java`

### Service

Responsável pelas regras de negócio e validações.

* `UsuarioService.java`

### Controller

Responsável pelo tratamento das requisições HTTP.

* `UsuarioServlet.java`

### View

Responsável pela interface com o usuário.

* `index.jsp`
* `listar.jsp`

---

## ✔️ Regras de Validação

O sistema realiza as seguintes validações:

* Nome obrigatório.
* E-mail obrigatório.
* Não permite cadastro de e-mails duplicados.
* Retorno de mensagens de erro quando necessário.
* Utilização de códigos HTTP apropriados para respostas inválidas.

---

## 💾 Persistência dos Dados

Os dados são armazenados em memória utilizando uma estrutura do tipo `ArrayList`.

Por se tratar de uma atividade acadêmica, não foi utilizado banco de dados, mantendo os dados disponíveis apenas enquanto a aplicação estiver em execução.

---

## 🛠️ Tecnologias Utilizadas

* Java 17+
* Jakarta Servlet
* JSP
* Apache Tomcat 10
* Maven
* HTML

---

## 📂 Estrutura do Projeto

```text
src/main/java
├── com.example.atividade
│   ├── model
│   │   └── Usuario.java
│   ├── service
│   │   └── UsuarioService.java
│   └── servlet
│       └── UsuarioServlet.java

src/main/webapp
├── index.jsp
└── listar.jsp
```

---

## 🎯 Objetivos de Aprendizagem

Durante o desenvolvimento deste projeto foram praticados os seguintes conceitos:

* Desenvolvimento Web com Java.
* Criação e utilização de Servlets.
* Utilização de JSP para apresentação de dados.
* Implementação do padrão MVC.
* Tratamento de requisições HTTP.
* Validação de formulários.
* Manipulação de coleções com ArrayList.
* Organização e estruturação de projetos Maven.

---

## 👨‍💻 Autor

Projeto desenvolvido como atividade acadêmica da disciplina de Desenvolvimento Web com Java, com foco na aplicação dos conceitos de Servlets, JSP e arquitetura MVC.
