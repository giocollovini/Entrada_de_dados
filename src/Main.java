import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		System.out.println("Digite um valor String.");
		x = sc.next();
		System.out.println("Você digitou o valor String: " + x);
		
		//--------------
		
		int y;
		
		System.out.println("Digite um valor Inteiro.");
		y = sc.nextInt();
		System.out.println("Você digitou o valor Inteiro: " + y);
		
		//--------------
		
		double z;
		
		System.out.println("Digite um valor Double.");
		z = sc.nextDouble();
		// valor deve ser digitado com (,), se quiser digitar com (.) deve-se declarar a Locale.setDefault(Locale.US)
		System.out.println("Você digitou o valor Double: " + z);		
		
		
		//--------------
		
		char t;
		
		System.out.println("Digite um Caracter.");
		t = sc.next().charAt(0);
		// como é um caracter, podemos digitar mais de uma letra que somente irá pegar a primeira 
		System.out.println("Você digitou o valor Caracter: " + t); 
		
		//--------------
		
		// Ler entrada com quebra de linha, ou seja, digita 1 valor, da enter e digita outro valor... 
		String s1, s2, s3;
		
		// coloquei essa linha (sc.nextLine())  pq tem System.out.println no comando anterior e isso consome a primeira linha 
		// digitada fazendo que só seja lido 2 valores
		sc.nextLine();
		
		System.out.println("Digite um Primeiro String.");
		s1 = sc.nextLine(); 
		System.out.println("Digite um Segundo String.");
		s2 = sc.nextLine();
		System.out.println("Digite um Terceiro String.");
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		sc.close();

		
		
	}

}
