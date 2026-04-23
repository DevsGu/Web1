# 📚 Aula 1 - Cliente \& Servidor





&#x20;   OBS:. As respostas serão sempre buscando associações de analogias para que se tenha uma melhor compreensão e rentenção do contéudo



&#x20;   1. Como funciona uma solicitação HTTP?

&#x20;   2. Quais os Metodos HTTP?



R1:. Uma pessoa quer acessar algum site , para isso ela acessa o seu navegador(firefox , google crome ...) coloca o endereço do site que ela quer , e faz um requisição , pedindo permissão para entrar. O site(Servidor) vai analisar o pedido e mandar uma resposta(Acesso Autorizado).Assim , a pessoa pode visualizar os objetos da página(html , css , js ...). Logo podemos dizer que a solicitação HTTP é uma permissão para acessar algum "endereço" do Servidor.



R2:. A forma de como o Navegador(Cliente) e o site(Servidor) se comunica é atraves dos Métodos HTTP(Mas não isso).


| Métodos    | Função |
|----------|-------|
| GET  | Busca dados   | 
| POST    | Envia dados    |
| PUT  | Atualiza todos os dados  | 
| PATCH    | Atualiza parte dos dados    |
| DELETE  | Deletar dados  | 
| HEAD    |  Metadados de identificação |
| OPTION    | Opções  |



#### 🧠 Mnemônico



Sua cabeça tem muitas Opçoes. pode atualizar parte dos dados ou completamente . pode ainda , buscar , enviar e deletar.





&#x20;   3. O que é Get Condicional?

&#x20;   4. O que é Caching HTTP?

&#x20;   5. Cite 5 Status Code ?



R3:. Gosto de dizer que Get Condicional é uma busca de condição , durante o processor clinte\&servidor , se o cliente ja acessou a página uma vez e aquela página não foi alterada pelo Servidor , o cliente não precisa baixar novamente pois fica salva no cache do navegador. então ocorre uma solicitação GET e o servidor responde com status code 304 Not Modified, enviando um corpo de resposta sem dados. Caso algo tenha sido alterado na Página então é preciso fazer novamente o download dos objetos. por isso Get Condicional , se ja tem não precisa baixar novamente.



R4:. Caching HTTP é basicamente um menicanismo que armazena respostas HTTP , ou seja o get Condicionale o caching http andam juntos , facilitando assim a comunicação entre cliente e servidor.



R5:.É um dos mecanismo de conversação entre Cliente e Servidor. para saber de comunicação foi clara entre Cliente e servidor , usa -se Status Code. por ex :. Cliente faz requisição , Servidor responde 200 OK(logo o acesso está liberado para o cliente).



| Código | Status                  | Significado                         |
|--------|------------------------|-------------------------------------|
| 200    | OK                     | Requisição aceita                   |
| 404    | Not Found              | Página não encontrada               |
| 304    | Not Modified           | Não houve modificações no cache     |
| 403    | Forbidden              | Acesso proibido                     |
| 500    | Internal Server Error  | Erro interno no servidor            |



&#x20;   6. O que são os cabeçalhos?

&#x20;   7. Para que serve?





R6:. Os cabeçalhos também fazer parte da comunicação entre Cliente e Servidor. Cabeçalhos são Metadados que tem do lado cliente e servidor para se entenderem melhor. Dentre os dados do Metadados temos:



Identificação: User Agente -> Navegador // Host -> endereço.

Sessão: iniciar sua Sessão // Manter Login.

Cache: if\_modified\_since // last Modified -> pergunta se for modificado.

Formato dos Dados: Content-Type(html , css etc) // Aceppted(o que o usuario aceita).

Autenticação: autorizacao , envia credenciais.





&#x20;   Imagino essa etapa como se fosse um acesso ao Facebook , então voce tem q ter autorizacao pra entrar , envia as credenciais. inicia a sessao e se mantem. ve o conteúdo da pagina e aceita. caso ja tenha de antes , fica salvo no cache se nao faz o download. atraves do seu navegador tem sua id.







### Métodos GET \& POST





&#x20;   8. O que é o Método Get?

&#x20;   9. O que é o Método Post?





R8:. O Metodo Get busca os objetos da página porém não pode alterar nada(não altera o estado da página).



&#x20;   é semelhante a um rapaz que olha um cardapio , mas não tem pretenção de comprar apenas de consultar o preço.







R9:. Metodo Post envia dados no corpo da requisição , geralmente com objetivo de criar ou modificar recurso do servidor.



&#x20;   é semelhante a um rapaz que olha o cardapio e compra um hamburguer. ele envia dados , o restaurante prepara(isso muda o estado pois agora tem um pedido na cozinha)



### Para finalizar - Host \& Set Cookie



&#x20;   10. Pra que serve o Host

&#x20;   11. Pra que serve o set-Cookie





R10:. Host serve para identificar qual site/ dominio do servidor está sendo acessado



R11:. resumindo , o set cookie serve para armazenar informações no navegador e manter sessao , permitindo funcionalidades como login , carrinho de compras e personalização em sites modernos.

