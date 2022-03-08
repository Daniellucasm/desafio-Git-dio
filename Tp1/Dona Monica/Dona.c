#include <stdio.h>
#include <stdbool.h>

int maisVelho(int n1, int n2, int n3){
	int n4 = n1 - (n2 + n3);
	if(n3 > n2 && n3 > n4){
		return n3;
	} else if(n2 > n3 && n2 > n4){
		return n2;
	} else {
		return n4;
	}
}

bool isFim(int n){
	return (n==0);
}

int main(void){
	int n1,n2,n3 = 0;
	
	scanf("%d", &n1);
	do{
		scanf("%d", &n2);
		scanf("%d", &n3);
		if(n3 + n2 < n1){
			printf("%d", maisVelho(n1, n2, n3));
		} else {
			break;
		}
		scanf("%d", &n1);
	}while(!isFim(n1));

	return 0;
}
