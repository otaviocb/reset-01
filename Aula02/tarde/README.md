

### Modificadores de Acesso

São padrões de visibilidade de acesso à **classes**, **atributos** e **métodos**. 

- **public**: Define que a declaração pode ser acessada de qualquer lugar e por qualquer entidade que possa visualizar a classe a que ela pertence.
- **private**: Define que os métodos e atributos não podem ser acessados ou usados por nenhuma outra classe, inclusive classes herdadas. Não se aplica às classes.
- **protected**: Torna o membro acessível às classes do mesmo pacote ou através de herança, seus membros herdados não são acessíveis a outras classes fora do pacote em que foram declarados.
- **default (padrão)**: A classe e/ou seus membros são acessíveis somente por classes do mesmo pacote, na sua declaração não é definido nenhum tipo de modificador, sendo este identificado pelo compilador.
- **final**: Quando é aplicado na classe, não permite estende-la, nos métodos impede que o mesmo seja sobrescrito na subclasse, e nos valores de variáveis não pode ser alterado depois que já tenha sido atribuído um valor.
- **abstract**: Não é aplicado nas variáveis, apenas nas classes. Uma classe abstrata não pode ser instanciada, ou seja, não pode ser chamada pelos seus construtores. Se houver alguma declaração de um método como abstract (abstrato), a classe também deve ser marcada como abstract.
- **static**: É usado para a criação de uma variável que poderá ser acessada por todas as instâncias de objetos desta classe como uma variável comum, ou seja, a variável criada será a mesma em todas as instâncias e quando seu conteúdo é modificado numa das instâncias, a modificação ocorre em todas as demais. E nas declarações de métodos ajudam no acesso direto à classe, portanto não é necessário instanciar um objeto para acessar o método. Nas variáveis estáticas todas as instâncias da mesma classe compartilham a mesma cópia das variáveis estáticas, sendo inicializadas quando a classe é carregada (instanciada).

#### Tabela

|                                     | private | default |	protected |	public |
| ----------------------------------- | ------- | ------- | --------- | ------ |
| mesma classe                        | sim     | sim     | sim       | sim    |
| mesmo pacote                        | não     | sim     | sim       | sim    |
| pacotes diferentes (subclasses)     | não     | não     |	sim       |	sim    |
| pacotes diferentes (sem subclasses) | não     |	não     |	não       |	sim    |

### Enum

São usados para a criação de estruturas de dados organizados, podendo agrupar valores que tenham o mesmo sentido para dentro dessa estrutura.
São tipos de campos que consistem em um conjunto fixo de constantes (`static final`), representados como uma lista de valores pré-definidos. No Java, definimos uma enumeração usando a palavra chave `enum`.

#### Características

- As instâncias dos tipos `enum` são criadas e nomeadas junto com a declaração da classe, sendo fixas e imutáveis (o valor é fixo)
- Não é permitido criar novas instâncias com a palavra chave `new`;
- O construtor é declarado `private`, embora não precise de modificador `private` explícito;
- Seguindo a convenção, por serem objetos constantes e imutáveis (`static final`), os nomes declarados recebem todas as letras em **MAIÚSCULAS**;
- As instâncias dos tipos `enum` devem obrigatoriamente ter apenas um nome;
- Opcionalmente, a declaração da classe pode incluir variáveis de instância, construtor, métodos de instância, de classe, etc.


#### Exemplos

- Enum simples

  ```java
  public enum TipoPessoa {
      PESSOA_FISICA,
      PESSOA_JURIDICA;
  }
  ```

- Enum com atributos

  ```java
  public enum Cor {

      AZUL("#0000FF"),
      AMARELO("#00FFFF"),
      VERMELHO("#FF0000"),
      VERDE("#00FF00"),
      PRETO("#000000"),
      BRANCO("#FFFFFF");

      private String codigoHexadecimal;

      Cor(String codigoHexadecimal) {
          this.codigoHexadecimal = codigoHexadecimal;
      }
  }
  ```

- Enum com outro enum como atributo
  
  ```java
  public enum Compromisso {

      CONSULTA_MEDICA(Cor.AMARELO, 2),
      REUNIAO(Cor.AZUL, 1),
      ANIVERSARIO(Cor.VERDE, 3),
      FESTA_ANIVERSARIO(Cor.VERMELHO, 4);

      private Cor cor;

      private int ordemPrioridade;

      Compromisso(Cor cor, int ordemPrioridade) {
          this.cor = cor;
          this.ordemPrioridade = ordemPrioridade;
      }
  }
  ```

### Coleções

São estruturas de dados que permitem o armazenamento de diversos elementos

#### Array

- Tamanho pré-definido
- Não pode ser redimensionado
- Impossível buscar diretamente por um elemento cujo índice é desconhecido

**Exemplo de Uso**
  ```java
  Aluno[] alunos = new Aluno[2];
  alunos[0] = new Aluno("Alexandre");
  ```

#### Vector

- Basicamente é um Array com tamanho dinâmico

**Exemplo de Uso**
  ```java
  Vector<Aluno> alunos = new Vector<>();
  alunos.add(new Aluno("Alexandre"));
  ```

#### Collection

É um conjunto bem definido de classes e interfaces para representar e tratar grupos de dados como uma única unidade. A API de Collections é robusta e possui diversas classes que representam estruturas de dados avançadas. As Coleções são usadas para armazenar, recuperar, manipular e comunicar dados agregados

![Collection](https://raw.githubusercontent.com/wiki/wilsonjuniorwj/java-wiki/conteudos/java-se/collections/01.png)

- **Collection**: está no topo da hierarquia. Não existe implementação direta dessa interface, mas ela define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;
- **Set**: interface que define uma coleção que não permite elementos duplicados. A interface SortedSet, que estende Set, possibilita a classificação natural dos elementos, tal como a ordem alfabética;
- **List**: Define uma coleção ordenada, podendo conter elementos duplicados. Em geral, o usuário tem controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices. Prefira esta interface quando precisar de acesso aleatório, através do índice do elemento.
- **Queue**: um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, definida pela implementação de Comparable ou Comparator, determina essa prioridade. Com a interface fila pode-se criar filas e pilhas;
- **Map**: Mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. 

#### Implementações


| Interfaces | Tabela de Espalhamento | Array Redimensionável | Árvore  | Lista Ligada | Tabela de Espalhamento + Lista Ligada |
| ---------- | ---------------------- | --------------------- | ------- | ------------ | ------------------------------------- |
| Set        | HashSet                |                       | TreeSet |              | LinkedHashSet                         |
| List       |                        | ArrayList             |         | LinkedList   |                                       |
| Queue      |                        |                       |         |              |                                       |
| Map        | HashMap                |                       | TreeMap |              | LinkedHashMap                         | 

- **ArrayList**: é como um array cujo tamanho pode crescer. A busca de um elemento é rápida, mas inserções e exclusões não são. Podemos afirmar que as inserções e exclusões são lineares, o tempo cresce com o aumento do tamanho da estrutura. Esta implementação é preferível quando se deseja acesso mais rápido aos elementos. 
- **LinkedList**: implementa uma lista ligada, ou seja, cada nó contém o dado e uma referência para o próximo nó. Ao contrário do ArrayList, a busca é linear e inserções e exclusões são rápidas. Portanto, prefira LinkedList quando a aplicação exigir grande quantidade de inserções e exclusões. 
- **HashSet**: o acesso aos dados é mais rápido que em um TreeSet, mas nada garante que os dados estarão ordenados. Escolha este conjunto quando a solução exigir elementos únicos e a ordem não for importante. 
- **TreeSet**: os dados são classificados, mas o acesso é mais lento que em um HashSet. Se a necessidade for um conjunto com elementos não duplicados e acesso em ordem natural, prefira o TreeSet. É recomendado utilizar esta coleção para as mesmas aplicações de HashSet, com a vantagem dos objetos estarem em ordem natural;
- **LinkedHashSet**: é derivada de HashSet, mas mantém uma lista duplamente ligada através de seus itens. Seus elementos são iterados na ordem em que foram inseridos. Opcionalmente é possível criar um LinkedHashSet que seja percorrido na ordem em que os elementos foram acessados na última iteração.
- **HashMap**: baseada em tabela de espalhamento, permite chaves e valores null. Não existe garantia que os dados ficarão ordenados. Escolha esta implementação se a ordenação não for importante e desejar uma estrutura onde seja necessário um ID (identificador). 
- **TreeMap**: implementa a interface SortedMap. Há garantia que o mapa estará classificado em ordem ascendente das chaves. Mas existe a opção de especificar uma ordem diferente. Use esta implementação para um mapa ordenado. Aplicação semelhante a HashMap, com a diferença que TreeMap perde no quesito desempenho;
- **LinkedHashMap**: mantém uma lista duplamente ligada através de seus itens. A ordem de iteração é a ordem em que as chaves são inseridas no mapa. Se for necessário um mapa onde os elementos são iterados na ordem em que foram inseridos, use esta implementação. 

**Exemplo de Uso**
```java
// List e ArrayList
List<Aluno> alunos = new ArrayList<>();
alunos.add(new Aluno("Alexandre"));

// Set e HashSet
Set<Aluno> alunos = new HashSet<>();
alunos.add(new Aluno("Alexandre"));

// Map e HashMap
Map<String, Livro> catalogoLivros = new HashMap<>();
catalogoLivros.put("85-359-0277-5", new Livro("O Senhor dos Anéis"));
```

### Data e Hora

O Java, a partir da versão 8, possui 2 estruturas de classes que nos permitem trabalhar com datas.
A primeira delas, e mais antiga, é baseada na interface Calendar.
Já a mais recente, e bem mais robusta, está disponível no pacote `java.time` e possui classes para trabalharmos com os mais diversos cenários envolvendo data e hora.

#### Principais classes

- **LocalDate**: representa uma data, ou seja, um período de 24 horas com dia, mês e ano definidos.
  ```java
  LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
  LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);
  ```

- **LocalTime**: representa apenas um horário, sem data específica
  ```java
  LocalTime horarioDeEntrada = LocalTime.of(8, 30);
  LocalTime horarioDeSaida = LocalTime.of(17, 0);
  ```

- **LocalDateTime**: representa uma data e hora específicas
  ```java
  LocalDateTime agora = LocalDateTime.now();
  LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0);
  ```

- **Period**: Serve para calcularmos a duração entre dois LocalDate e já trata anos bissextos e outros detalhes.
  ```java
  Period periodo = Period.between(homemNoEspaco, homemNaLua);
  ```

- **Duration**: Serve para medir uma quantidade de tempo em termos de nanossegundos. Permite obter essa quantidade de tempo em diversas unidades através dos métodos: `toNanos`, `toMillis`, `getSeconds`, etc.
  ```java
  Duration cargaHoraria = Duration.between(horarioDeEntrada, horarioDeSaida);
  Long horas = cargaHoraria.toHours();
  ```
