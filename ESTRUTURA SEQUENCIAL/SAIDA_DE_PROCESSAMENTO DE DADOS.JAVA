package curso_program;

public class Main {

	public static void main(String[] args) {
		// exemplo de saida de dados:
		String nome = "gustty";
		int idade = 18;
		double renda = 4000.80;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais por hora%n" , nome, idade, renda);
		
		// exercicio 1:
		String produto1 = "computador";
		String produto2 = "mesa de trabalho";
		
		int age = 18;
		int codigo = 5290;
		char genero = 'F';
		
		double preço1 = 2100.0;
		double preço2 = 650.50;
		double medir = 53.23332;
		
		System.out.println(produto1 + ", cujo o preço e $" + preço1);
		System.out.println(produto2 + ",cujo o preço e $"+ preço2);
		System.out.println( age + " de idade,"+ codigo +" e o genero:" + genero);
		System.out.printf("medida com oito casa decimais: %.8f ",medir);
		
		//exemplos de processamentos de dados:
		//exemplo 1:
		int x;
		double y;
		x = 5;
		y = 2 * x;
		
		System.out.print(x);
		System.out.println(y);
		//exemplo 2:
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b+B) /2.0 * h;
		
		System.out.println(area);
		
		//exemplo 3 (casting) :
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = (double) a/c;
		
		System.out.println(resultado);
		
		
		
		
		

	}

}
