package com.academy.three;

public class IntegerDemo {
    public static void main(String[] args) {
        byte byteBroj = 127;

        short shortNumber = 32767;

        int number = 23; //DEFAULT

        //32 -> 16 bitni
        //1. step : number je vrijednost 32 bitna
        //2. step: ne smijem kaže ubacit to u 16bitni prostor..dok neko ne preuzme odgovornost za onih 16 bita koje moram otkinut
        //3. step : ubaci vrijednsot
        short shortNumber1 = (short) number; //EKSPLICITNA KONVERZIJA

        int number2 = shortNumber;//AUTOMATSKA KONVERZIJA

        //1. VRIJEDNOST: 32bitni zapis u kojem se nalazi "32"
        //2. konvertovat u 64 bitni zapis -> 32 + 32bita(ove dodatne bite samo stavi nule)
        //3. ubaci vrijednost
        long longNumber = 23L;

    }
}