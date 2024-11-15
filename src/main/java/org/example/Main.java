package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int kaprekarOp(int numkaprekar){

        int[] numsArray = new int[4];
        int i = numsArray.length - 1;
        while (numkaprekar > 0) {
            numsArray[i] = numkaprekar%10;
            numkaprekar = numkaprekar/10;
            i--;
        }
        for (int l = 0; l < numsArray.length-1; l++) {
            for (int j = l+1; j < numsArray.length ; j++) {
                if (numsArray[j]>numsArray[l]){
                    int aux = numsArray[j];
                    numsArray[j] = numsArray[l];
                    numsArray[l] = aux;
                }
            }
        }
        int numMayor = numsArray[0]*1000 + numsArray[1]*100 + numsArray[2]*10 + numsArray[3];
        int numMenor =  numsArray[3]*1000 + numsArray[2]*100 + numsArray[1]*10 + numsArray[0];

        return numMayor-numMenor;
    }
    public static int itKaprekar(int numero) {
        int i=0;
        while (numero!= 6174){
            numero = kaprekarOp(numero);
            i++;
        }
        return i;
    }
}