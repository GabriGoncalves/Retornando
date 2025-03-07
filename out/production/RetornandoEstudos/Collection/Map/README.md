# MAP

- A interface Map é usada para mapear dados na forma de chaves e valores.
- O Map do Java é um objeto que mapeia chaves para valores.
- Um Map não pode conter chaves duplicadas: cada chave pode mapear no máximo um valor.
- A plataforma Java possui três implementações gerais de Map: HashMap, TreeMap e LinkedHashMap.
- As operações básicas do Map são: put (inserir ou atualizar), get (obter), containsKey (verificar se contém uma chave), containsValue (verificar se contém um valor), size (obter o tamanho) e isEmpty (verificar se está vazio).
> ###### *HashTable* é uma implementação antiga da interface Map no Java que é sincronizada e thread-safe, tornando-a adequada para uso em ambientes concorrentes. Ela não permite chaves ou valores nulos e os elementos não são mantidos em uma ordem específica.

>  ###### *LinkedHashMap*, por outro lado, é uma implementação da interface Map que preserva a ordem de inserção dos elementos. Cada elemento possui referências ao próximo e ao anterior, formando uma lista encadeada. Isso permite que os elementos sejam iterados na ordem em que foram inseridos. Além disso, o LinkedHashMap também permite chaves ou valores nulos.

>  ###### *HashMap* é uma implementação da interface Map que não mantém uma ordem específica dos elementos. Ele armazena os elementos internamente usando uma função de hash para melhorar a eficiência das operações de pesquisa e acesso. O HashMap também permite chaves ou valores nulos.

>> Fixando os Conhecimentos : 
> 
> ### Exercícios:
> - Operações Básicas com Map
> - Pesquisa em Map
> - Ordenação nas Map

## Operações Básicas com Map 
> ### 1. Agenda de Contatos
   >> Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

- adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
- removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
- exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
- pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.

> ### Desafio:
> ### 2. Dicionário
   >> Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

- adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
- removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
- exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
- pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.

## Pesquisa em Map
> #### 1. Estoque de Produtos com Preço
 >>  Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:

- adicionarProduto(long cod, String nome, int quantidade, double preco): Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
- exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e preços.
- calcularValorTotalEstoque(): Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
- obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
- obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
- obterProdutoMaiorQuantidadeValorTotalNoEstoque(): Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
> ### Desafio 
> ##### 2. Contagem de Palavras
  >> Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

- adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
- removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
- exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
- encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.

## Ordenação nos Map
> ### 1. Agenda de Eventos
  >> Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

- adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento à agenda.
- exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
- obterProximoEvento(): Retorna o próximo evento que ocorrerá.

>### Desafio 
> #### 2. Livraria Online
  >> Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

- adicionarLivro(String link, String titulo, String autor, private double preco): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
- removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
- exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
- pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
- obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
- exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.