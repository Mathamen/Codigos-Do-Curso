#include <stdio.h>
#include <string.h>
struct Registro {
int id_inscricao;
char curso[20];
char cpf[15];
char dataNacimento[11];
char sexo;
char email[40];
char opcaoQuadro;
};
int main (int argc, char** argv){
    struct Registro* r;
    FILE *F= fopen("candidatos.csv","r");// entao e leitura normal msm pq csv é texto, saca
    while (leRegistro(*r, F)==1){
        if (strcmp(r->cpf, argv[1])== 0)
            printf("%s",r->curso); 
    }

    return 0;
}