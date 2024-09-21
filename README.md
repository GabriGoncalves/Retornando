# Trilha Java + SpringBoot
- - -
#### Linkando repositório remoto do GitHub com projeto local
- criar um repositório no gitHub
- pegar o url no gitHub para fazer o clone
- abrir a pasta no computador onde será feito o git clone
- abrir o gitBash dentro da pasta
- fazer o git clone + url do repositório
#### Subir projeto para GtiHub
- git status (para ver oque tem de novo no projeto, que ainda não está no git e o que tem no git)
- git add . (caso queira adicionar todo conteúdo do projeto coloque o "." , ou seja algo especifico, coloque o nome da pasta que queira adicionar)
- git commit -m "Espaço para escrever algo sobre o projeto que está subindo"
- git push origin main (main é a branch que estamos mandando o projeto)
- - -
#### Estudando criação de métodos
- Projeto -> Sistema Smart TV
- - -
#### Criando um documentario web
- Usando esse código no terminal, a gente cria um documentario na web

"javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java"
- - -
#### Estudando método Scanner
- Projeto -> Digite Seus Dados
- - -
#### Estudando Estruturas Condicionais
- Condicinal Simples que utilizamos apenas IF
- Condicional Composta que utiliza IF e ELSE
- Condicional Encadeada que utiliza um ELSE / IF entre o IF e ELSE
- Switch Case
- - -
#### Estudando Estrutura de Repetição
- FOR
- FOR com ARRAYS
- WHILE
- DO WHILE
- - -
#### Estudando Estruturas Excepcionais
- Try / Catch para tratar exceções de forma simples.
- - -
#### Estudando Debugging
- Fazendo debbuging e entendendo como nos ajuda a encontrar um problema.
- Pilha de Execução.
- - -
#### Modificadores de Acesso
- Os modificadores de acesso, são para criar mais segurança entre as classes.
- Existem 4 tipos de modificares de acesso, sendo eles:

 ###### Default: 
 modificador padrão, quando não declaramos nenhum modificador,
 ele é acessível apenas dentro do mesmo pacote, e subclasses fora do pacote não têm acesso.
 
###### Public: 
ele é um modificador acessivel a todas classes dentro e fora do pacote.

###### Protected: 
ele é um modificador acessível dentro do mesmo pacote, e para subclasses, 
mesmo se estiverem em pacotes diferentes.

Private - ele é um modificador privado apenas para a mesma classe.
- - -
#### Getter e Setters
- Getter, é usado para pegar/chamar a variavel desejada.
Ex.: Quando queremos chamar um nome, primeiro chamamos o objeto que criamos então logo em seguida usamos o get
gabriel.getNome()
- Setters, é usado para modificar ou estabelecer um nome a variavel desejada, diferente do get, o set recebe parametros
a serem definidos quando é chamado.
Ex.: Após criarmos o objeto chamamos o set, gabriel.setNome( "Gabriel" );
- - -
#### Construtores
- Estudando construtores, todo construtor deve ter o mesmo nome da classe que você está utilizando. 
- Contrutor padrão: não recebe parametro dentro dos parenteses,
- Construtores que recebem parametros dentro dos parenteses, para criação de novos objetos.
- - -
#### POO (Programação Orientada Objetos)
###### Encapsulamento : 
É utilizarmos um método dentro de outro, usando os modificadores de acesso para definir o que poderá ser acesso ou não
pela pessoa que estará usando nosso programa. Existem coisas, comandos que não precisam ser vistas,
apenas que aconteça a determinada função.
###### Herança : 
É utilizarmos um mesmo método, para varios outros objetos.
Ex.: Um celular e um telefone fixo, os tem a mesma função de telefonar, e para não criarmos uma função para cada
podemos criar uma classe Pai/Mãe com o método ligar, e essas duas classes filhas herdarem essa determinada função "ligar".
###### Abstração : 
É usar termos ou uma lógica diferente para cada objeto. Pensando no mesmo exemplo anterior, os dois aparelhos,
Celular e Telefone herdaram o método ligar, porém cada aparelho tem sua maneira de efetuar a chamada,
então, utilizamos a palavra "abstract" na criação do método, e quando ele for chamado na classe celular e telefone
teremos que fazer sua implementação de lógica. Ex.: No celular, digitamos o numero ou escolher na agenda e precisamos apertar
em ligar para efetuar a chamada, já no telefone, nós só precisamos discar o número para quem queremos ligar
e assim que terminar, o próprio telefone já efetua a chamada, dois aparelhos, com a mesma função, porém com uma
lógica diferente um do outro.
###### Polimorfismo:
Capacidade de referenciar objetos construídos por classes específicas como objetos de uma classe genérica, 
desde que essa classe genérica respeite a hierarquia em questão.
- - -
