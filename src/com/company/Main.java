package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String jmenoAPrijmeni = "Jakub Skrizovsky";

        int pocetNakupu = 10;

        String mestoFirmy = "Ostrava";

        double spotrebaVLitrech = 12.5;

        double delkaUTP = 200.5;

        LocalDate datumNarozeniKlienta = LocalDate.of(1988,11,1);

        String SPZ = "1A3 1457";

        String IP = "192.168.24.0/19";

        //vypsani vsech promennych
        System.out.println(jmenoAPrijmeni);
        System.out.println(pocetNakupu);
        System.out.println(mestoFirmy);
        System.out.println(spotrebaVLitrech + " L/100 Km");
        System.out.println(delkaUTP + " m");
        System.out.println(delkaUTP);
        System.out.println(SPZ);
        System.out.println(IP);




    }
}
