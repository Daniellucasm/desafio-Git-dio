import java.util.Scanner;

public class Is{
	//Metodo de teste de vogais
	public static boolean isVogais(String line){
		boolean result = false;
		for(int i = 0; i < line.length(); i++){
			if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' ||
			   line.charAt(i) == 'u' || line.charAt(i) == 'A' || line.charAt(i) == 'E' || line.charAt(i) == 'I' || 
			   line.charAt(i) == 'O' || line.charAt(i) == 'U'){
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}
	//Metodo de teste de consoantes
	public static boolean isConsoantes(String line){
		boolean result = false;
		String lineLower = line.toLowerCase();
		for(int i = 0; i < line.length(); i++){
			if(lineLower.charAt(i) == 'b' || lineLower.charAt(i) == 'c' || lineLower.charAt(i) == 'd' || lineLower.charAt(i) == 'f' ||
			   lineLower.charAt(i) == 'g' || lineLower.charAt(i) == 'j' || lineLower.charAt(i) == 'k' || lineLower.charAt(i) == 'l' ||
			   lineLower.charAt(i) == 'm' || lineLower.charAt(i) == 'n' || lineLower.charAt(i) == 'n' || lineLower.charAt(i) == 'p' ||
			   lineLower.charAt(i) == 'q' || lineLower.charAt(i) == 'r' || lineLower.charAt(i) == 's' || lineLower.charAt(i) == 't' ||
			   lineLower.charAt(i) == 'v' || lineLower.charAt(i) == 'w' || lineLower.charAt(i) == 'x' || lineLower.charAt(i) == 'z' ){
				   result = true;
			   } else {
				   result = false;
				   break;
			   }
		}
		return result;
	}
	//Metodo de teste sem e um numero
	public static boolean isNum(String line){
		boolean result = false;
		for(int i = 0; i < line.length(); i++){
			if(line.charAt(i) >= '1' && line.charAt(i) <= '9'){
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}
	//Metodo de teste se e um numero real
	public static boolean isReal(String line){
		boolean result = false;
		int cont = 0;
		for(int i = 0; i < line.length(); i++){
			if(line.charAt(i) >= '1' && line.charAt(i) <= '9'){
				result = true;
			} else if((line.charAt(i) == ',' || line.charAt(i) == '.') && cont < 1){
				result = true;
				cont++;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}

	public static boolean isFim(String frase){
		return (frase.length() == 3 && frase.charAt(0) == 'F' && frase.charAt(1) == 'I' && frase.charAt(2) == 'M');
	}

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		
		String line = entrada.nextLine();
		do{
			//Chamada de metodo de teste de vogais
			if(isVogais(line)){
				System.out.print("SIM ");
			} else {
				System.out.print("NAO ");
			}
			
			//Chamada de metodo de teste de consoantes
			if(isConsoantes(line)){
				System.out.print("SIM ");
			} else {
				System.out.print("NAO ");
			}
			
			//Chamada de metodo de teste se e um numero
			if(isNum(line)){
				System.out.print("SIM ");
			} else {
				System.out.print("NAO ");
			}
			//Chamada de metodo de teste numero Real
			if(isReal(line)){
				System.out.println("SIM ");
			} else {
				System.out.println("NAO ");
			}

			line = entrada.nextLine();
		}while(!isFim(line));	
	}
}
