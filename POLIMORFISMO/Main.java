package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.SavingsAccount;



public class Main {

    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);	
   
    /*
    	POLIMORFISMO:
    	== Em POO, o polimorfismo é um recurso que permite que variaveis de um mesmo tipo mais generico possam apontar
    	para objetos de tipos especificos diferentes, tendo assim comportamentos diferentes confome cada tipo especifico:
    	
     */
    
    Account x = new Account(1020,"alex", 1000);
    Account y = new SavingsAccount(1023,"maria", 1000, 0.12);
    
    x.withdraw(50);
    y.withdraw(50);
   
   //Chamou o mesmo tipo so que tiveram comportamentos diferentes por isso se chama POLIMORFISMO!
   System.out.println(x.getBalance());
   System.out.println(y.getBalance());
    
    sc.close();
       
    }
}
