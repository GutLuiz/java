package curso_programacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;



public class Main {
    public static void main(String[] args)  throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);	
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    /*
      CLASSES ABASTRATAS:
      == SAO CLASSES QUE NAO PODEM SER INSTANCIADAS.
      = É UMA FORMA DE GARANTIR HERANÇA TOTAL: SOMENTE SUBCLASSES NAO ABSTRATAS PODEM SER INSTANCIADA, MAS NUNCA A SUPER CLASSE ABSTRATA
      
     */
    
    List<Account> list = new ArrayList<>();
    
    list.add(new SavingsAccount (1001, "alex", 500,0.01));
    list.add(new BusinessAccount(1001, "ana", 600, 1200));
    
    double sum = 0;
    for(Account acc : list) {
    	sum += acc.getBalance();
    }
    
    System.out.println(sum);
    sc.close();
       
    }
}
