import java.util.Scanner;

public class Cometa{
	public static int cometaAno(int ano){
		int inicio = 1986;
		for(inicio = 1986; inicio <= ano; inicio += 76){
		}
		return inicio;
	}	

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		int ano = entrada.nextInt();
		do{
			System.out.println(cometaAno(ano));
			ano = entrada.nextInt();
		}while(ano != 0);
	}
}
