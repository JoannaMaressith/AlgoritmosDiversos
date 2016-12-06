
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();

		int soma=0;
		for(int i = 1; i<num; i++){
			if ( SomaImparFibonacci.fibonacci(i)>= 1000000 )  {
				System.out.println("O maior valor da sequência deve ser menor que UM MILHÃO. "); 
				System.exit(0);
			}else if ((SomaImparFibonacci.fibonacci(i) % 2) !=0) { 
				soma  += SomaImparFibonacci.fibonacci(i);
			
			}

			//System.out.println(SomaImparFibonacci.fibonacci(i)+ " ");
			
		}  
		System.out.println("A soma é: "+soma);


	}

}


