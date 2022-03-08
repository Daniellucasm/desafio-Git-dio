import java.util.Scanner;

public class Ciframento{
	public static String ciframentoCesar(String frase, int x){
		int ascii = 0;
		String crip = "";
		if(x < frase.length()){
			ascii = 3 + (int) frase.charAt(x);
			crip += (char) ascii;
			x++;
			crip += ciframentoCesar(frase, x);
		}
		return crip;
	}

	public static boolean isFim(String frase){
		return (frase.length() == 3 && frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M');
	}
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		String frase = MyIO.readLine();
		do{
			MyIO.println(ciframentoCesar(frase, 0));
			frase = MyIO.readLine();
		}while(!isFim(frase));
	
	}
}
