import java.util.Scanner;
public class Palindromo {
	public static boolean isPalindromo(String frase){
		int tam = frase.length() - 1;
		boolean result = true;
		for(int i = 0; i < frase.length(); i++){
			if(frase.charAt(i) == frase.charAt(tam)){
				result = result && true;
			} else {
				result = false;
			}
			tam--;
		}
		return result;
	}

	public static boolean isFim(String frase){
		return (frase.length() == 3 && frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M');
	}

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		String frase = entrada.nextLine();
		while(!isFim(frase)){
			if(isPalindromo(frase)){
				System.out.println("SIM");
			} else {
				System.out.println("NAO");
			}
			frase = entrada.nextLine();
		}
	}
}
