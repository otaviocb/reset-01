## Modificadores de Fluxo de Execução

### Condicionais

Permite que alteremos o fluxo de execução baseado em uma determinada condição. Ou seja, podemos definir que um trecho do código só será executado se determinada variável possui um valor específico. Essa condição sempre retorna um valor booleano (ou verdadeiro ou falso). Os condicionais `if` possuem uma condição e um corpo.

```java
// a condicao sempre será booleana
if (mana > 0) {
  lancarMagia();
}

boolean possuiMana = mana > 0 // guardo o resultado da comparação (true ou false) na variável "possuiMana"
// esse if possui o mesmo comportamento do anterior, porem uma melhor legibilidade (lê-se "se possui mana, então lançar magia")
if (possuiMana) {
  lancarMagia();
}
```

### Decisores

Permite dividir o fluxo de execução em várias opções de acordo com o valor de uma variável. Funciona como vários `if` encadeados. Para isso usamos o `switch` que recebe um argumento e possui n fluxos possíveis de acordo com o valor do argumento. Cada fluxo deve ser definido usando `case <valor>:` terminando com `break`. Existe ainda um fluxo padrão para o caso do valor da variável não coincidir com nenhum cenário planejado, nesse caso usamos o `default`.

```java
switch(magia) {
  case "dardos místicos":
    dano = 20;
    mana -= 10;
    break;

  case "flecha ácida de Melf":
    dano = 80;
    mana -= 30;
    break;

  case "relâmpagos":
    dano = 50;
    mana -= 20;
    break;

  default:
    dano = 0;
}
```

> Lembrando que em OO tudo deve ser representado por objetos, logo, a magia também deveria ser um objeto.

## Mais Sobre Orientação a Objetos

> Achou que o assunto havia acabado? Achou errado.

### Herança

- Mecanismo da orientação a objetos que permite classes já existentes (superclasses), serem estendidas por classe filhas (subclasses).
- As subclasses herdam todas características da superclasse, podem alterar comportamentos existentes e são mais específicas que ela, tendo características mais especializadas que a superclasse.
- Herança faz com que exista um nível muito maior de acoplamento entre as classes, uma classe passa a depender da outra. Faz com que o programador precise conhecer todo o código da classe mãe e das classes filhas.

> Regra básica: usa-se herança quando se pode dizer que a subclasse É UM TIPO DE superclasse. Exemplo: Druida é um tipo de Sacerdote.
> Dica importante: nunca use herança apenas para reaproveitar atributos. Isso pode não fazer muito sentido agora, mas um dia vai ficar mais claro.

```java
// superclasse
class Sacerdote {

  int mana;
  float poder;

  Sacerdote(int mana, float poder) {
    this.mana = mana;
    this.poder = poder;
  }

  void usarPoderDivino(String poderDivino) {
    ...
  }

}

// subclasse
class Druida extends Sacerdote {

  // método específico do Druida
  void metamorfosear(String animal) {
    ...
  }

  // possui também o método usarPoderDivino e o construtor do Sacerdote
}

// outra subclasse
class Clerigo extends Sacerdote {

  // método específico do Clerigo
  void poderDaFe() {
    ...
  }

  // possui também o método usarPoderDivino e o construtor do Sacerdote
}

Druida druida = new Druida(100, 150f);
Clerigo clerigo = new Clerigo(100, 150f);

druida.usarPoderDivino("invocar animais"); // ok - método herdado do Sacerdote
druida.metamorfosear("águia"); // ok - método específico do Druida
druida.poderDaFe(); // nok - esse método só existe para clérigo

clerigo.usarPoderDivino("curar ferimentos"); // ok - método herdado do Sacerdote
clerigo.poderDaFe(); // ok - método específico do Clerigo
clerigo.metamorfosear("águia"); // nok - esse método só existe para druida

```

### Polimorfismo

> Do dicionário: qualidade ou estado de ser capaz de assumir diferentes formas.

```java

Sacerdote sacerdoteDruida = new Druida(100, 150f);
Sacerdote sacerdoteClerigo = new Clerigo(100, 150f);

sacerdoteDruida.usarPoderDivino("invocar animais"); // ok - método herdado do Sacerdote
sacerdoteDruida.metamorfosear("águia"); // nok - a variável sacerdoteDruida é do tipo Sacerdote, então mesmo instanciando um Druida não podemos usar as habilidades dele

sacerdoteClerigo.usarPoderDivino("invocar animais"); // ok - método herdado do Sacerdote
sacerdoteClerigo.poderDaFe(); // nok - a variável sacerdoteClerigo é do tipo Sacerdote, então mesmo instanciando um Clerigo não podemos usar as habilidades dele
```
