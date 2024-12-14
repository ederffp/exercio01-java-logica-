<h2> Algoritmo 02 - Pratica de algoritmos em Java </h2>

<h2>Sobre: </h2>

- Algoritmo tem como finalidade solicitar nome e senha de usuário. Caso o Nome do usuário e senha sejam iguais novamente será solicitado a inserção de senha distinta ao do nome informado, advertindo que é um risco para sua privacidade.

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String nameUser = "";
        String passUser = "";

        while(nameUser.equals(passUser)) { 
        
          try {

            System.out.println("-> Insira seu nome: ");
            nameUser = scan.next();

            System.out.println("-> Insira sua senha: ");
            passUser = scan.next();

            if (nameUser.equals(passUser)) {
                System.out.println("Error: ... Name user e password user são iguais: " + nameUser + " | " + passUser);
            }
          
         } catch (InputMismatchException e) {

            System.out.println("-> ERROR: ... Tipo de dados invalidos ");
            return;
          }
      
       }
        
        System.out.println();
        System.out.println("-> Ok ... formatação correta"); 
        System.out.println("-> Nome: " + nameUser + " e Senha: " + passUser + " são distintos");
        scan.close();
    }
}

```

<h2> Analise: </h2>

- Importamos a biblioteca <b>InputMismatchException</b> para tratar alguma exceção como entrada de dado invalida por divergência de tipos; 
- Importamos biblioteca da classe <b>Scanner</b> responsavel pela coleta de dados - enttrada.
- Declaramos a classe principal -> <b>App</b>.
- Declaramos o metodo principal da classe App -> <b>main</b>.
- Instanciamos um objeto chamado <b>scan</b> da classe Scannner.
- Declaramos 2 variáveis de tipo String - <b>nameUser</b> e <b>passUser</b>, lembrando que, Strings em java não é necessáriamente um tipo de dado mas sim uma Classe.
- Invocamos um laço de repetição <b>while</b> que averigua a condição caso verdadeira, ou seja, se nameUser e passUser for iguais ele continuará a solicitar um nome diferente do password.
- Invocamos <b>try-catch{}</b> para usar os recursos da biblioteca <b>InputMismatchException</b>, onde contém uma mensagem alertado do erro em função da divergência.
- Dentro do laço testamos e alertamos o usuário para a igualdade dos dados informados, ou seja, informação invalida.
- Invocamos um <b>System.out.println()</b> afim de pular uma linha.
- Mostramos uma mensagem de OK ao usuário avisando que a entrada dos dados foi valida.
- Imprimimos outra mensagem mostrando que seu nameUser e passUser são validos.
- Encerramos o uso do nosso objeto scan que faz chamada da nossa classe Scanner com <b>scan.close()</b>.

<h2> Conclusão: </h2>

- Embora simples o programa mostra de algum modo um proposta um pouco mais elaborada afim de solucionar o problema, como por exemplo, o uso de tratamento de exceções <b>Try-catch()</b>

<h2> Referências: </h2>

<h3> biblioteca java.util.Scanner</h3>
[Consulta a documentação referencia a biblioteca] (https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)

<h3> biblioteca import java.util.InputMismatchException</h3>
[Consulta a documentação referência a bilbioteca] (https://docs.oracle.com/javase/8/docs/api/java/util/InputMismatchException.html)

