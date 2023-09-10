package Listas.Lista4;

import java.util.ArrayList;

public class RandomMain {
    public static void inverteArray(int [] original){
        int [] clone= original;
        for(int i= 0; i<(original.length); i++){
            original[i]= clone[original.length-i];
        }
    }

    public static void flipArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }
    

    public static void main(String [] args){
        int [] a= {1, 2, 3, 4, 5, 6 ,7 ,8 ,9 ,10 ,11 ,12, 13, 14, 15 ,16, 17 , 18 ,19, 20};
        flipArray(a);
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        ArrayList b= new ArrayList();
        b.add(0);
            System.out.println(b.size());












        

    }
}
