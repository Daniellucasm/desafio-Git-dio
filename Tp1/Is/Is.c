#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <stdlib.h>
#include <ctype.h>

bool isVogais(char frase[1000]){
		bool result = false;
		
		for(int i = 0; i < strlen(frase) - 1; i++){
			if(frase[i] == 'a' || frase[i] == 'e' || frase[i] == 'i' || frase[i] == 'o' ||
			   frase[i] == 'u' || frase[i] == 'A' || frase[i] == 'E' || frase[i] == 'I' || 
			   frase[i] == 'O' || frase[i] == 'U'){
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
}

bool isConsoantes(char frase[1000]){
		bool result = false;
		char fraseLower[1000];
		int i = 0;
		while(frase[i] != '\0'){
			fraseLower[i] = tolower(frase[i]);
			i++;
		}
		for(i = 0; i < strlen(frase) - 1; i++){
			if(frase[i] == 'b' || frase[i] == 'c' || frase[i] == 'd' || frase[i] == 'f' ||
			   frase[i] == 'g' || frase[i] == 'j' || frase[i] == 'k' || frase[i] == 'l' ||
			   frase[i] == 'm' || frase[i] == 'n' || frase[i] == 'n' || frase[i] == 'p' ||
			   frase[i] == 'q' || frase[i] == 'r' || frase[i] == 's' || frase[i] == 't' ||
			   frase[i] == 'v' || frase[i] == 'w' || frase[i] == 'x' || frase[i] == 'z' ){
				   result = true;
			   } else {
				   result = false;
				   break;
			   }
		}
		return result;
}

bool isNum(char frase[1000]){
		bool result = false;
		int i = 0;
		for(int i = 0; i < strlen(frase) - 1; i++){
			if(frase[i] >= '1' && frase[i] <= '9'){
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
}

bool isReal(char frase[1000]){
		bool result = false;
		int cont, i = 0;
		for(i = 0; i < strlen(frase) - 1; i++){
			if(frase[i] >= '1' && frase[i] <= '9'){
				result = true;
			} else if((frase[i] == ',' || frase[i] == '.') && cont < 1){
				result = true;
				cont++;
			} else {
				result = false;
				break;
			}
		}
		return result;
}

bool isFim(char frase[100]){
	return (frase[0] == 'F' && frase[1] == 'I' && frase[2] == 'M');
}

int main(void){
	char frase[1000];
	fgets(frase, 1000, stdin);
	fflush(stdin);
	while(!isFim(frase)){
			//Chamada de metodo de teste de vogais
			if(isVogais(frase)){
				printf("SIM ");
			} else {
				printf("NAO ");
			}
			
			//Chamada de metodo de teste de consoantes
			if(isConsoantes(frase)){
				printf("SIM ");
			} else {
				printf("NAO ");
			}
			
			//Chamada de metodo de teste se e um numero
			if(isNum(frase)){
				printf("SIM ");
			} else {
				printf("NAO ");
			}
			//Chamada de metodo de teste numero Real
			if(isReal(frase)){
				printf("SIM\n");
			} else {
				printf("NAO\n");
			}
			fgets(frase, 1000, stdin);
			fflush(stdin);
	}
	return 0;
}
