/*
 *  - Algoritmo tem como objeto solicitar nome e senha ao usuário.
 *  - Caso a Nome usuário e senha for iguais novamente é soclitado a inserção de Nome e Senha até que sejam distintos.
 */

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
