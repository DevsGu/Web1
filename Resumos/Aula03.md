# 📚 Aula 03 - Entendendo HTTP na prática

Nessa aula, o objetivo foi entender como visualizar os dados de requisição e resposta no modelo cliente-servidor.

## 🧪 Instruções do professor

1. Acessar um site qualquer
2. Abrir o DevTools (F12)
3. Ir na aba **Network (Rede)**
4. Identificar:

   * Método HTTP
   * URL
   * Status Code
   * Headers principais
   * Formato da resposta
5. Acessar também: https://fakestoreapi.com/products  
e comparar com a requisição anterior.

\---

## 🔍 Análise realizada

Escolhi acessar o site https://www.crunchyroll.com/pt-br/discover, pois gosto de animes.

Ao abrir o DevTools, observei diversas requisições, principalmente carregamento de imagens e dados da página.

### 📌 Requisição principal

* **Método:** GET
* **Status Code:** 200 OK
* **Host:** crunchyroll.com

\---

## 📡 Headers HTTP (comparação)

|Header|Crunchyroll|FakeStore API|
|-|-|-|
|authority|crunchyroll.com|fakestoreapi.com|
|method|GET|GET|
|accept|*/*|application/json|
|accept-language|pt-BR|pt-BR|
|content-type|text/html|application/json|
|cookie|(presente)|(ausente)|
|user-agent|Mozilla/5.0|Mozilla/5.0|

\---

## 📊 Conclusão

Foi possível perceber que:

* Sites como o Crunchyroll retornam **HTML e vários recursos (imagens, scripts, etc.)**
* Já APIs como a FakeStore retornam **dados em JSON**
* Os headers variam de acordo com o tipo de requisição e resposta

\---

## 🖼️ Evidências da análise

!\[Requisição 1](Imagens/git-web1.png)

!\[Requisição 2](Imagens/img2.png)

!\[Requisição 3](Imagens/img3.png)

