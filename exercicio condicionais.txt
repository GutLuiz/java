package curso_programacao;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//primeira questao:
		int inteiro;
		inteiro = sc.nextInt();
		if (inteiro < 0 ) {
			System.out.println("esse numero e negativo");
			
		}
		else {
			System.out.println("esse numero nao e negativo");
		}
		
		//segunda questao:
		int num;
		num = sc.nextInt();
		
		if(num % 2 == 0){
			System.out.println("esse numero e par");
		}
		else {
			System.out.println("esse numero e impar");
		}
		
		//terceira questao:
		int numero1, numero2;
		numero1= sc.nextInt();
		numero2 = sc.nextInt();
		
		if(numero1 * numero2 == 0 || numero2 * numero1 == 0) {
			System.out.println("sao mutiplos");
		}
		else {
			System.out.println("nao sao mutiplos");
		}
		
		//quarta questao:
		int comeco, termino, duracao;
		comeco = sc.nextInt();
		termino = sc.nextInt();
		
		if(comeco > 1 & comeco < 24) {
			duracao = termino - comeco;
			System.out.println("o jogo durou: " + duracao + "horas(s)");
		}
		else {
			System.out.println("nao teve jogo");
		}
		
		//quinta questao:
		int entrada;
		int quantidade;
		double valor;
		entrada = sc.nextInt();
		quantidade = sc.nextInt();
		
		double cachorroquente = 4;
		double xsalada = 4.50;
		double xbacon = 5.00;
		double torradasimples = 2.00;
		double refrigerante = 1.50;
		
		if(entrada == 1) {
			valor = cachorroquente * quantidade;
			System.out.println("total: " + valor);
		}
		else if (entrada == 2) {
			valor = xsalada * quantidade;
			System.out.println("total: " + valor);
		}
		else if (entrada == 3) {
			valor = xbacon * quantidade;
			System.out.println("total: "+ valor);
		}
		else if(entrada == 4 ) {
			valor = torradasimples * quantidade;
			System.out.println("total: " + valor);
		}
		else {
			valor = refrigerante * quantidade;
			System.out.println("total: " + valor);
		}
		
		//sexta questao:
		double entrada1;
		entrada1 = sc.nextDouble();
		
		if(entrada1 >= 0 & entrada1 <= 25) {
			System.out.println("intervalo (0,25)");
		}
		else if (entrada1 > 25 & entrada1 <= 50) {
			System.out.println("intervalo (25,50)");
		}
		else if (entrada1 > 50 & entrada1 <= 75) {
			System.out.println("intervalo (50,75)"); 
		}
		else if ( entrada1 > 75 & entrada1 <= 100) {
			System.out.println("intervalo (75,100)");
		}
		else {
			System.out.println("fora do intervalo");
		}
		
		// setima questao:
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0.0 & y == 0.0) {
			System.out.println("origem");
		}
		else if ( x == 0) {
			System.out.println("eixo x");
		}
		else if (y == 0 ) {
			System.out.println("eixo y");
		}
		else if ( x > 0.0 & y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 & y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 & y < 0.0) {
			System.out.println("Q3");
		}
		else{
			System.out.println("Q4");
		}
		
		//oitava questao:	
  double salario =sc.nextDouble();	        
  double imposto = 0.0;		
  
	 if (salario <= 2000.00) {
		System.out.println("Isento");  
	 } 
	 else if (salario <= 3000.00) {	 
         imposto = (salario - 2000.00) * 0.08;
         System.out.printf("R$ %.2f\n", imposto);
	 }
	 else if (salario <= 4500.00) {
         imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
         System.out.printf("R$ %.2f\n", imposto);
	 } 
	 else {
         imposto = (1000.00 * 0.08) + (1500.00 * 0.18) +(salario - 4500.00) * 0.28;
         System.out.printf("R$ %.2f\n", imposto);
     }
     	        
		
sc.close();
	}

}
