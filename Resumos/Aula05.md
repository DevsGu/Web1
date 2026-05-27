# Arquitetura MVC e Processamento de Requisições em Java Web

## 1. Arquitetura MVC em Java Web (Servlets e JSP)

A arquitetura MVC (Model-View-Controller) é utilizada para organizar melhor o desenvolvimento de aplicações Web.

### Model

O Model é responsável pelos dados da aplicação e pelas regras de negócio. Ele realiza operações como buscar, salvar, alterar e excluir informações.

### View

A View é a parte visual da aplicação, ou seja, aquilo que o usuário vê na tela. Geralmente é desenvolvida utilizando JSP, HTML, CSS e JavaScript.

### Controller

O Controller é responsável por receber as requisições dos usuários. Em aplicações Java Web, normalmente essa função é realizada pelos Servlets. Ele recebe os dados enviados pelo usuário, chama o Model quando necessário e encaminha as informações para a View.

### Funcionamento do MVC

1. O usuário faz uma requisição para a aplicação.
2. O Servlet (Controller) recebe a requisição.
3. O Controller chama o Model para processar os dados.
4. O Model retorna o resultado solicitado.
5. O Controller envia os dados para a View (JSP).
6. A View gera a resposta e a apresenta ao usuário.

---

## 2. Processamento de Requisições HTTP com Servlets

O protocolo HTTP funciona através do modelo de requisição e resposta.

Quando um usuário acessa uma página ou envia um formulário, o navegador envia uma requisição HTTP para o servidor. O servidor identifica qual Servlet deve processar essa requisição.

O Servlet recebe a requisição através dos objetos `HttpServletRequest` e `HttpServletResponse`. Em seguida, ele executa o método correspondente ao tipo de requisição recebida.

### Principais métodos

- `doGet()` → utilizado para consultas e obtenção de informações.
- `doPost()` → utilizado para envio de dados.
- `doPut()` → utilizado para atualização de dados.
- `doDelete()` → utilizado para remoção de dados.

Após processar as informações, o Servlet gera uma resposta e a envia ao navegador do usuário.

### Ciclo de Vida de um Servlet

#### `init()`

Executado apenas uma vez quando o Servlet é criado e carregado pelo servidor.

#### `service()`

Recebe as requisições dos usuários e direciona para o método adequado (`doGet()`, `doPost()`, etc.).

#### `destroy()`

Executado quando o Servlet é removido da memória ou quando o servidor é encerrado.

### Configuração do Content-Type

O tipo de conteúdo enviado ao navegador pode ser definido utilizando:

```java
response.setContentType("text/html");
```

Outros exemplos:

```java
response.setContentType("application/json");
response.setContentType("text/plain");
```

Essa configuração informa ao navegador qual tipo de conteúdo está sendo recebido.

---

## 3. Geração de Conteúdo de Resposta

### a) Utilização de Arquivos Estáticos e Dinâmicos

Os arquivos estáticos possuem conteúdo fixo e são enviados ao navegador sem processamento pelo servidor.

#### Exemplos de arquivos estáticos

- HTML
- CSS
- JavaScript
- Imagens

Os arquivos dinâmicos, como JSP, são processados pelo servidor antes de serem enviados ao navegador. Eles podem exibir informações geradas em tempo de execução, como dados de usuários ou resultados de consultas ao banco de dados.

Dessa forma, os arquivos estáticos são utilizados para estrutura, estilo e interatividade, enquanto os arquivos dinâmicos são utilizados para gerar conteúdo personalizado.

### b) Pasta Utilizada para Arquivos Estáticos

Em projetos Java Web, os arquivos estáticos normalmente são armazenados na pasta:

```text
src/main/webapp
```

Ou em subpastas como:

```text
src/main/webapp/css
src/main/webapp/js
src/main/webapp/images
```

Por padrão, esses arquivos podem ser acessados diretamente pelo navegador através da URL da aplicação.

### c) Pasta Utilizada para Arquivos JSP

Os arquivos JSP geralmente são armazenados dentro da pasta:

```text
src/main/webapp/WEB-INF/views
```

Ou simplesmente:

```text
src/main/webapp/WEB-INF
```

Por padrão, arquivos localizados dentro da pasta `WEB-INF` não podem ser acessados diretamente pelo navegador.

Para que uma JSP seja exibida, é necessário que um Servlet realize o encaminhamento da requisição para ela. Essa prática aumenta a segurança e ajuda a manter a organização da aplicação seguindo o padrão MVC.