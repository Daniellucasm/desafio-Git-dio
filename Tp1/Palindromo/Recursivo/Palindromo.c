#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isPalindromo(char frase[100], int i, int f){
	bool result = false;
	if(frase[i] == frase[f] && strlen(frase) - 2 > i){
		i++;
		f--;
		if(i >= strlen(frase) - 2){
			result = true;
		} else {
			result = true && isPalindromo(frase, i, f);
		}
	} else {
		result = false;
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
		int tam = strlen(frase) - 2;
		if(isPalindromo(frase, 0, tam)){
			printf("SIM\n");
		} else {
			printf("NAO\n");
		}
		fgets(frase, 1000, stdin);
	}
		
	return 0;	
}
