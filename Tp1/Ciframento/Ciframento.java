import java.util.Scanner;

public class Ciframento{
	public static String ciframentoCesar(String frase){
		int ascii = 0;
		String crip = "";
		for(int i = 0; i < frase.length(); i++){
			ascii = 3 + (int) frase.charAt(i);
			crip += (char) ascii;
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
			MyIO.println(ciframentoCesar(frase));
			frase = MyIO.readLine();
		}while(!isFim(frase));
	
	}
}
