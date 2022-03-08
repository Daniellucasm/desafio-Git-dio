#include <stdio.h>

int cometaAno(int ano){
	int inicio = 1986;
	for(inicio = 1986; inicio <= ano; inicio += 76){}

	return inicio;
}

int main(void){
	int ano = 0;
	scanf("%d", &ano);
	do{
		printf("%d\n", cometaAno(ano));
		scanf("%d", &ano);
	}while(ano != 0);	

	return 0;
}
