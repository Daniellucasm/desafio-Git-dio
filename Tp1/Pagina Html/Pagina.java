import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pagina{
	public static void isVogais(String url){
		int cont[] = new int[23];
		try{
			URL ul = new URL(url);
			URI uri = ul.toURI();
			BufferedReader br = new BufferedReader(new InputStreamReader(ul.openStream()));
			String line;
			String codigo = " ";
			while((line = br.readLine()) != null){
				codigo = codigo + line;
			}
			for(int x = 0; x < codigo.length(); x++){
				if(codigo.charAt(x) == 'a'){
					cont[0] += 1;
				  } else if (codigo.charAt(x) == 'e'){
					cont[1] += 1;
				  } else if (codigo.charAt(x) == 'i'){
					cont[2] += 1;
				  } else if (codigo.charAt(x) == 'o'){
					cont[3] += 1;
				  } else if (codigo.charAt(x) == 'u'){
					cont[4] += 1;
				  } else if (codigo.charAt(x) == 225){
					cont[5] += 1;
				  } else if (codigo.charAt(x) == 233){
					cont[6] += 1;
				  } else if (codigo.charAt(x) == 237){
					cont[7] += 1;
				  } else if (codigo.charAt(x) == 243){
					cont[8] += 1;
				  } else if (codigo.charAt(x) == 250){
					cont[9] += 1;
				  } else if (codigo.charAt(x) == 224){
					cont[10] += 1;
				  } else if (codigo.charAt(x) == 232){
					cont[11] += 1;
				  } else if (codigo.charAt(x) == 236){
					cont[12] += 1;
				  } else if (codigo.charAt(x) == 242){
					cont[13] += 1;
				  } else if (codigo.charAt(x) == 249){
					cont[14] += 1;
				  } else if (codigo.charAt(x) == 227){
					cont[15] += 1;
				  } else if (codigo.charAt(x) == 245){
					cont[16] += 1;
				  } else if (codigo.charAt(x) == 226){
					cont[17] += 1;
				  } else if (codigo.charAt(x) == 234){
					cont[18] += 1;
				  } else if (codigo.charAt(x) == 238){
					cont[19] += 1;
				  } else if (codigo.charAt(x) == 244){
					cont[20] += 1;
				  } else if (codigo.charAt(x) == 251){
					cont[21] += 1;
				  }
			}

			System.out.print("a(" + cont[0] + ")");
			System.out.print(" e(" + cont[1] + ")");
			System.out.print(" i(" + cont[2] + ")");
			System.out.print(" o(" + cont[3] + ")");
			System.out.print(" u(" + cont[4] + ")");
           	System.out.print(" á(" + cont[5] + ")");
           	System.out.print(" é(" + cont[6] + ")");
           	System.out.print(" í(" + cont[7] + ")");
          	System.out.print(" ó(" + cont[8] + ")");
           	System.out.print(" ú(" + cont[9] + ")");
           	System.out.print(" à(" + cont[10] + ")");
           	System.out.print(" è(" + cont[11] + ")");
           	System.out.print(" ì(" + cont[12] + ")");
           	System.out.print(" ò(" + cont[13] + ")");
           	System.out.print(" ù(" + cont[14] + ")");
           	System.out.print(" ã(" + cont[15] + ")");
           	System.out.print(" õ(" + cont[16] + ")");
           	System.out.print(" â(" + cont[17] + ")");
           	System.out.print(" ê(" + cont[18] + ")");
           	System.out.print(" î(" + cont[19] + ")");
           	System.out.print(" ô(" + cont[20] + ")");
           	System.out.print(" û(" + cont[21] + ")");
			br.close();
		} catch (MalformedURLException excecao){
			excecao.printStackTrace();
		} catch (URISyntaxException excecao) {
            excecao.printStackTrace();
        } catch (IOException excecao) {
            excecao.printStackTrace();
        }
	}

	public static void isConsoantes(String url){
		int cont = 0;
		try{
			URL ul = new URL(url);
			URI uri = ul.toURI();
			BufferedReader br = new BufferedReader(new InputStreamReader(ul.openStream()));
			String line;
			String codigo = " ";
			while((line = br.readLine()) != null){
				codigo = codigo + line;
			}
			for(int x = 0; x < codigo.length(); x++){
				if ((codigo.charAt(x) == 'b' || codigo.charAt(x) == 'c' || 
                     codigo.charAt(x) == 'd' || codigo.charAt(x) == 'f' || 
                     codigo.charAt(x) == 'g' || codigo.charAt(x) == 'j' || 
                     codigo.charAt(x) == 'k' || codigo.charAt(x) == 'l' || 
                     codigo.charAt(x) == 'm' || codigo.charAt(x) == 'n' || 
                     codigo.charAt(x) == 'p' || codigo.charAt(x) == 'q' || 
                     codigo.charAt(x) == 'r' || codigo.charAt(x) == 's' || 
                     codigo.charAt(x) == 't' || codigo.charAt(x) == 'v' || 
                     codigo.charAt(x) == 'w' || codigo.charAt(x) == 'x' || 
                     codigo.charAt(x) == 'z') || codigo.charAt(x) == 'B'|| 
                     codigo.charAt(x) == 'C' || codigo.charAt(x) == 'D' || 
                     codigo.charAt(x) == 'F' || codigo.charAt(x) == 'G' || 
                     codigo.charAt(x) == 'J' || codigo.charAt(x) == 'K' || 
                     codigo.charAt(x) == 'L' || codigo.charAt(x) == 'M' || 
                     codigo.charAt(x) == 'N' || codigo.charAt(x) == 'P' || 
                     codigo.charAt(x) == 'Q' || codigo.charAt(x) == 'R' || 
                     codigo.charAt(x) == 'S' || codigo.charAt(x) == 'T' || 
                     codigo.charAt(x) == 'V' || codigo.charAt(x) == 'W' || 
                     codigo.charAt(x) == 'X' || codigo.charAt(x) == 'Z') {
                cont += 1;
              }
			}
			System.out.print(" consoante(" + cont + ")");
			br.close();
		} catch (MalformedURLException excecao){
			excecao.printStackTrace();
		} catch (URISyntaxException excecao) {
            excecao.printStackTrace();
        } catch (IOException excecao) {
            excecao.printStackTrace();
        }
	}

	public static void isTags(String name, String url){
		int cont[] = new int[3];
		try{
			URL ul = new URL(url);
			URI uri = ul.toURI();
			BufferedReader br = new BufferedReader(new InputStreamReader(ul.openStream()));
			String line;
			String codigo = " ";
			while((line = br.readLine()) != null){
				codigo = codigo + line;
			}
			if(codigo.contains("<br>")){
				cont[0] += 1;
			} else if(codigo.contains("<table>")){
				cont[1] += 1;
			} else if(codigo.contains(name)){
				cont[2] += 1;
			}
			System.out.print(" <br>(" + cont[0] + ")");
           	System.out.print(" <table>(" + cont[1] + ") ");
           	System.out.print(name + "\n");
			br.close();
		} catch (MalformedURLException excecao){
			excecao.printStackTrace();
		} catch (URISyntaxException excecao) {
            excecao.printStackTrace();
        } catch (IOException excecao) {
            excecao.printStackTrace();
        }
	}

	public static boolean isFim(String name){
		return (name.length() == 3 && name.charAt(0) == 'F' && name.charAt(1) == 'I' && name.charAt(2) == 'M');
	}

	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		String name = entrada.nextLine();
		do{
			String url = entrada.nextLine();
			isVogais(url);
			isConsoantes(url);
			isTags(name, url);
			name = entrada.nextLine();
		}while(!isFim(name));
	}
}
