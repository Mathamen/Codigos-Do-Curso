#include <stdio.h>
#include <string.h>

typedef struct _Endereco Endereco;

// registroCEP = struct.Struct("72s72s72s72s2s8s2s")

struct _Endereco
{
	char logradouro[72];
	char bairro[72];
	char cidade[72];
	char uf[72];
	char sigla[2];
	char cep[8];
	char lixo[2]; // Ao Espaço no final da linha + quebra de linha
};


void BuscaBinaria(FILE* f, char* procurado){
        int inicio=0;
        fseek(f, 0, SEEK_END);
        int tam=ftell(f);
        int qr= tam/sizeof(Endereco);
        inicio=0;
        int fim= qr-1;
        Endereco e;
    while(inicio<=fim){

        int meio=(inicio +fim)/2;
        fseek(f,meio *sizeof(Endereco),SEEK_SET);
        fread(&e,sizeof(Endereco),1,f);

        if (strncmp(e.cep, procurado,8) ==0 ){
            printf("Achei");
            break;
        }       
        else{
            if (strncmp(e.cep, procurado,8) < 0 ){
                inicio=meio+1;
                printf("Leitura extra");
            }
            else{
                fim=meio-1;
                printf("Leitura extra");
            }
            if (inicio==fim)
            break;

        }

    }
}




int main(int argc, char**argv)
{
	FILE *f;
	int qt;

	if(argc != 2)
	{
		fprintf(stderr, "USO: %s [CEP]", argv[0]);
		return 1;
	}

	printf("Tamanho da Estrutura: %ld\n\n", sizeof(Endereco));
	f = fopen("cep_ordenado.dat","r");
    BuscaBinaria( f, argv[1]);
	fclose(f);
}

