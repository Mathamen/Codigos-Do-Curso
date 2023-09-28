#include <stdio.h>

int main(int argc, char** argv){
    if (argc !=3){
        return -1;
    }


    FILE* F1= fopen(argv[1], "rb");
    FILE* F2= fopen(argv[2],"rb");
    if (F1 == NULL || F2==NULL){
        return -1;
    }
    fseek(F1,0,SEEK_END);
    fseek(F2,0,SEEK_END);
    if (ftell(F1) != ftell(F2)){
        return -1;
    }
    rewind(F1);
    rewind(F2);
    int c1, c2;
    c1= fgetc(F1);
    c2=fgetc(F2);
    while(c1 != EOF){
        if (c1 !=c2)
            return -1;
        c1= fgetc(F1);
        c2=fgetc(F2);
    }
    printf("parabens sao iguais");
    fclose(F1);
    fclose(F2);

    return 0;
}