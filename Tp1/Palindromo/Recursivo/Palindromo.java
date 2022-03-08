import java.util.Scanner;
public class Palindromo {
	public static boolean isPalindromo(String frase, int i, int f){
		boolean result = false;
		if(frase.charAt(i) == frase.charAt(f) && frase.length() > i){
			i++;
			f--;
			if(i >= frase.length()){
				result = true;
			} else {
				result = true && isPalindromo(frase, i, f);
			}
		} else {
			result = false;
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
			int tam = frase.length() - 1;
			if(isPalindromo(frase, 0, tam)){
				System.out.println("SIM");
			} else {
				System.out.println("NAO");
			}
			frase = entrada.nextLine();
		}
	}
}
