package Listas.Lista4;

public class Utilidades {
    public static void inverteArray(int [] original){
        int [] clone= original;
        int j= 19;
        for(int i= 0; i<20; i++){
            original[i]= clone[j];
            j--;
        }
    }
}
