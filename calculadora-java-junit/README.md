# calculadora-java-junit
Este é um projeto desenvolvido para treinar testes unitários em Java. Inicialmente, será desenvolvida uma calculadora simples em Java com as operações básicas, como soma, subtração, multiplicação, divisão e potenciação. Após a implementação da calculadora, serão criados testes unitários para validar o funcionamento correto de cada método. Siga as instruções abaixo para usar a calculadora e, posteriormente, executar os testes unitários.

# Calculadora
Este é um projeto de uma calculadora simples em Java, onde o usuário pode escolher entre as seguintes operações: soma, subtração, multiplicação, divisão e potenciação.

# Ferramentas utilizadas
Visual Studio Code - Um editor de código-fonte desenvolvido pela Microsoft.

Java - Uma linguagem de programação de alto nível e plataforma computacional.

JUnit - Um framework de testes unitários para a linguagem de programação Java.

# Como usar
Clone o repositório na sua máquina local.
Abra o projeto em sua IDE favorita.
Execute o arquivo "Main.java".
Siga as instruções no console para realizar as operações desejadas.
# Contribuindo
Se você deseja contribuir para este projeto, siga os passos abaixo:

1- Faça um fork deste repositório.
2- Crie uma branch para sua nova feature (git checkout -b feature/nova-feature).
3- Faça o commit de suas alterações (git commit -am 'Adicionando nova feature').
4 -Faça o push para a branch (git push origin feature/nova-feature).
5- Crie um novo Pull Request.
# Licença
Este projeto está sob a licença MIT. Leia o arquivo "LICENSE" para mais informações.

# Autor
Este projeto foi desenvolvido por Tamires Rodrigues de Oliveira.

# Atividade que foi pedida primeira questão :
Escreva uma Calculadora em Java que contenha uma classe chamada 
Calculadora.Java .
Essa classe terá os métodos: 
somar(numeroUm + NumeroDois)
subtrair(numeroUm - NumeroDois)
multiplicar(numeroUm * numeroDois)
dividir(numeroUm / numeroDois)
potenciar(numeroUm ^ numeroDois)
Escreva os algoritmos de todos os métodos acima.
Passo a Passo .
Criei uma nova classe chamada "Calculadora" com um construtor que recebe dois números como parâmetros e implementei os métodos de soma, subtração, multiplicação, divisão e potenciação nessa classe.

No método main, criei um objeto da classe Scanner para ler a entrada do usuário e solicitei que ele inserisse os dois números que deseja calcular.

Criei um objeto da classe Calculadora com os números inseridos pelo usuário como parâmetros do construtor.

Utilizei um loop do-while para exibir o menu da calculadora e permitir que o usuário escolha a operação desejada.

Utilizei um switch-case para executar a operação selecionada pelo usuário e exibir o resultado.

Adicionei uma verificação para evitar a divisão por zero e exibir uma mensagem de erro ao usuário caso isso ocorra.

Por fim, adicionei um historico usando Array .

# Primeiro teste unitário
Para começar a praticar a escrita de testes unitários em Java, decidir criar um teste simples para a classe Calculadora. O objetivo do teste é validar a funcionalidade do método soma(), que deve retornar a soma de dois números.

Aqui está o código do nosso primeiro teste unitário:

package Calculo;

import org.junit.Test;
import static org.junit.Assert.*;

public class Calculadoratest {
  @Test

  public void testSoma() {
    // Cria uma nova instância de Calculadora com os valores 5 e 5
    Calculadora calculadora = new Calculadora(5, 5);
    
    // Chama o método soma() da instância criada e armazena o resultado em uma variável
    double resultado = calculadora.soma();
    
    // Define o valor esperado da soma
    double esperado = 10;
    
    // Usa o método assertEquals() do JUnit para comparar o valor esperado com o valor retornado pelo método soma()
    assertEquals(esperado, resultado, 0);
  }
}

Na seção de Testes Unitários, foram adicionados dois novos métodos, subtracao() e multiplicacao(), que seguem a mesma lógica do método soma(). O erro anterior de dificuldade em realizar os testes foi corrigido com a adição da anotação @Test antes de cada método de teste. Abaixo está o código atualizado da classe CalculadoraTest:

package Calculo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
  @Test
  public void testSoma() {
    Calculadora calculadora = new Calculadora(5, 5);
    double resultado = calculadora.soma();
    double esperado = 10;
    assertEquals(esperado, resultado, 0);
  }

  @Test
  public void testSubtracao() {
    Calculadora calculadora = new Calculadora(5, 5);
    double resultado = calculadora.subtracao();
    double esperado = 0;
    assertEquals(esperado, resultado, 0);
  }

  @Test
  public void testMultiplicacao() {
    Calculadora calculadora = new Calculadora(5, 5);
    double resultado = calculadora.multiplicacao();
    double esperado = 25;
    assertEquals(esperado, resultado, 0);
  }
}
# Testes unitários divisão e potenciacao :
os testes para divisao() e potenciacao() serão diferentes dos testes de soma(), subtracao() e multiplicacao(), pois os métodos possuem lógicas diferentes. Veja como eu fiz ;

@Test
  public void testDivisao() {
    Calculadora calculadora = new Calculadora(10, 2);
    double resultado = calculadora.divisao();
    double esperado = 5;
    assertEquals(esperado, resultado, 0);
  }

  @Test
  public void testDivisaoPorZero() {
    Calculadora calculadora = new Calculadora(10, 0);
    double resultado = calculadora.divisao();
    double esperado = 0;
    assertEquals(esperado, resultado, 0);
  }

  @Test
  public void testPotenciacao() {
    Calculadora calculadora = new Calculadora(2, 3);
    double resultado = calculadora.potenciacao();
    double esperado = 8;
    assertEquals(esperado, resultado, 0);
  }
assertEquals()
assertEquals() é um método da biblioteca JUnit que é usado para verificar se o valor esperado de um teste é igual ao valor real. É usado para testes unitários em Java.

 # A sintaxe do método é a seguinte:

assertEquals(esperado, atual, margemDeErro);
Onde:
esperado: valor que se espera obter no teste.

atual: valor que foi retornado pelo código testado.

margemDeErro: valor máximo permitido para a diferença entre o valor esperado e o valor real.

Se o valor esperado e o valor atual forem iguais dentro da margem de erro especificada, o teste passará. Caso contrário, o teste falhará.

# ADICIONANDO CASE 6 - HISTORICO
Primeiro importei a biblioteca
import java.util.ArrayList;
Criei a lista com o nome :
ArrayList<String> historico = new ArrayList<>();
No começo o case estava assim :

System.out.println("======HISTORICO======");
                     for (String item : historico) {
                       System.out.println(item);
                     }
Adicionei o IF para quando a lista tiver vazia ficou assim ;

 case 6:
                     System.out.println("======HISTÓRICO======");
                  if (historico.isEmpty()) {
                    System.out.println("Não há operações registradas no histórico ainda.");
                  } else {
                     System.out.println("Operações registradas no histórico:");
                    for (String item : historico) {
            System.out.println(item);
                         }
                     }
                      break;
# O que é o is.Empty
isEmpty() é um método da classe String em Java que retorna um valor booleano indicando se uma determinada string está vazia ou não. O método verifica se a string não tem nenhum caractere e retorna true se estiver vazia e false caso contrário.
