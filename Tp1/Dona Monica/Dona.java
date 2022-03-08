import java.util.Scanner;
public class Dona{
	public static int maisVelho(int n1, int n2, int n3){
		int n4 = n1 - (n2 + n3);
		if(n3 > n2 && n3 > n4){
			return n3;
		} else if(n2 > n3 && n2 > n4){
			return n2;
		} else {
			return n4;
		}
	}

	public static boolean isFim(int n){
		return (n == 0);
	}

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		int n1 = entrada.nextInt();
		int n2 = 0;
		int n3 = 0;
		do{
			n2 = entrada.nextInt();
			n3 = entrada.nextInt();
			if(n3 + n2 < n1 ){
				System.out.println(maisVelho(n1, n2, n3));
			} else {
				break;
			}
			n1 = entrada.nextInt();
		}while(!isFim(n1));
	}
}

