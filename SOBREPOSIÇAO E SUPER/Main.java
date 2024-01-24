package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;



public class Main {

    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);	
   
    /*
    	SOBREPOSIÇAO:
    		=É A IMPLEMENTAÇAO DE UM METODO DE UMA SUPERCLASSE NA SUBCLASSSE
       
       	@override:
       	= É FORTEMENTE RECOMENDAVEL USAR ESSA ANOTAÇAO EM UM METODO SOBRESCRITO, POIS FACILITA A LEITURA E A COMPREENÇAO DO CODIGO.
     */
    
   // com a taxa de 5:
    Account acc1 = new Account(1001,"alex", 1000);
    acc1.withdraw(200);
    System.out.println(acc1.getBalance());
    
   // Sem a taxa de 5, mas com o mesmo metodo da superclasse, apenas sobrescrito: 
    Account acc2 = new SavingsAccount(1002,"ana", 1000, 0.01);
    acc2.withdraw(200);
    System.out.println(acc2.getBalance());
    
    //Com a taxa de 2 com as regras da superclasse:
    Account acc3 = new BusinessAccount(100, "gut", 1000, 500 );
    acc3.withdraw(200);
    System.out.println(acc3.getBalance());
    
    sc.close();
       
    }
}
