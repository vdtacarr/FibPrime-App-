package com.company;

public class AsalMi {
    public Boolean asalmi(int sayi){
        int sayac=0;
        for(int i=2;i<sayi;i++){
            int kalan=sayi%i;
            if(kalan==0){
                sayac++;
            }
        }
        if(sayac==0){
            return true;
        }
        else{
            return false;
        }
    }

}
