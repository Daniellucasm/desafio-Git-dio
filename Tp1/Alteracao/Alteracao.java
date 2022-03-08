import java.util.Random;
import java.util.Scanner;

public class Alteracao{
	public static String alteracaoAlt(String frase){
		String newLine = "";
		
		Random gerador = new Random();
		gerador.setSeed(4);
		char c = ((char)('a' + (Math.abs(gerador.nextInt()) % 26)));
		char t = ((char)('a' + (Math.abs(gerador.nextInt()) % 26)));
		if((c >= 'a' && c <= 'z') && (t >= 'a' && t <= 'z')){
			for(int i = 0; i < frase.length(); i++){
				if(frase.charAt(i) == c){
					newLine += t;
				} else {
					newLine += frase.charAt(i);
				}
			}
		}
		return newLine;
	}

	public static boolean isFim(String frase){
		return (frase.length() == 3 && frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M');
	}
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		String frase = entrada.nextLine();

		do{
			System.out.println(alteracaoAlt(frase));
			frase = entrada.nextLine();
		}while(!isFim(frase));	
	}

}
