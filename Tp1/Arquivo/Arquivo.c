#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main(){
    int n;
    double val;
    double aux;

    FILE * rd = fopen("saida.txt", "wb");
    
    scanf("%d", &n);

    for(int i=0; i<n; i++){
        scanf("%lf", &val);
        fwrite(&val, sizeof(double), 1, rd);
    }
    fclose(rd);

    FILE * rdNovo = fopen("saida.txt", "r");

    for(int i=1; i<=n; i++){
        fseek(rdNovo,-i*(sizeof(double)),SEEK_END);
        fread(&aux, sizeof(double), 1, rdNovo);
        printf("%g\n", aux);
    }
    
    fclose(rdNovo);
    return 0;
}
