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
      UPCASTING: 
       =CASTING DA SUBCLASSE PARA SUPERCLASSE
       == USO COMUM: POLIMORFISMO
       
       DOWNCASTING:
       = CASTING SUPERCLASSE PARA SUBCLASSE
       == PALAVRA INSTANCEOF
       === USO COMUM: METODOS QUE RECEBM PARAMETROS GENERICOS (EX: EQUALS)
       
     */
    
    
    Account acc = new Account(100, "alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1000, "maria", 0.0, 400);
    
    //UPCASTING:
    //Como a Account é uma superclasse pode ser possivel essas operaçoes: 
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(100, "bob" , 0.0, 200);
    Account acc3 = new SavingsAccount(10, "anna", 0.0, 2);
    		
    //DOWNCASTING:
    
    BusinessAccount acc4 = (BusinessAccount)acc2;
    acc4.loan(100);
    
    //Erro frequente: Algumas vezes tera um erro na tentativa de downcasting como por exemplo:
    // BusinessAccount acc5 = (BusinessAccount)acc3;
    //Para evitar esse erro precisa usar a palavra INSTANCEOF
    
    //se for instanciada pelo BusinessAccount tera a mensagem no compilador "Loan!"
    if(acc3 instanceof BusinessAccount) {
    	BusinessAccount acc5 = (BusinessAccount)acc3;
    	acc5.loan(100);
    	System.out.println("Loan!");
    }
    
    //se for instanciada pelo SavingsAccount tera a mensagem no compilador "upadate!"
    if(acc3 instanceof SavingsAccount) {
    	SavingsAccount acc5 = (SavingsAccount)acc3;
    	acc5.updateBalance();
    	System.out.println("Update!");
    	
    }
    
    
    sc.close();
       
    }
}
