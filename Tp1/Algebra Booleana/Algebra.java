import java.util.Scanner;

class Interpreter {
	String str;
	int pos;
	int operands[] = new int[3];
}

public class Algebra{
	public static int readExpression(Interpreter interpreter){
		int result = 0;
		int aux = 0;
		char charecter = interpreter.str.charAt(interpreter.pos++);
		if(charecter == 'A') 
			result = interpreter.operands[0];
		else if (charecter == 'B') 
			result = interpreter.operands[1];
		else if (charecter == 'C') 
			result = interpreter.operands[2];
		else if(charecter == 'n'){
			interpreter.pos += 3;
			if(readExpression(interpreter) == 1){
				result = 0;
			} else {
				result = 1;
			}
			interpreter.pos++;
		} else if(charecter == 'a'){
			interpreter.pos += 3;
			result = readExpression(interpreter);
			while(interpreter.str.charAt(interpreter.pos) == ','){
				interpreter.pos++;
				aux = readExpression(interpreter);
				if(result == 1 && aux == 1){
					result = 1;
				} else {
					result = 0;
				}
			}
			interpreter.pos++;
		} else if(charecter == 'o'){
			interpreter.pos += 2;
			result = readExpression(interpreter);
			while(interpreter.str.charAt(interpreter.pos) == ','){
				interpreter.pos++;
				aux = readExpression(interpreter);
				if(result == 1 || aux == 1){
					result = 1;
				} else {
					result = 0;
				}
			}
			interpreter.pos++;
		}

		return result;
	}

	public static boolean isFim(int num){
		return (num == 0);
	}

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		String line, lineWithoutSpaces = "";
		int numOperands = 0;
		Interpreter interpreter = new Interpreter();
		numOperands = entrada.nextInt();

		do{
			for(int i = 0; i < numOperands; i++){
				interpreter.operands[i] = entrada.nextInt();
			}
	
			line = entrada.nextLine();
			lineWithoutSpaces = line.replaceAll(" ", "");
			
			interpreter.str = lineWithoutSpaces;
			interpreter.pos = 0;
	
			int result = readExpression(interpreter);
			System.out.println(result);

			numOperands = entrada.nextInt();
		}while(!isFim(numOperands));
	}
}
