#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isPalindromo(char frase[100]){
	int x = strlen(frase) - 2;
	bool result = false;
	for(int i = 0; i < strlen(frase) - 1; i++){
		if(frase[i] == frase[x]){
			result = true;
		} else {
			result = false;
			break;
		}
		x--;
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
		if(isPalindromo(frase)){
			printf("SIM\n");
		} else {
			printf("NAO\n");
		}
		fgets(frase, 1000, stdin);
	}
		
	return 0;	
}
