package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String JmenoAPrijmeni = "Jakub Skrizovsky";

        int PocetNakupu = 10;

        String MestoFirmy = "Ostrava";

        double SpotrebaVLitrech = 12.5;

        double DelkaUTP = 200.5;

        LocalDate DatumNarozeniKlienta = LocalDate.of(1988,11,1);

        String SPZ = "1A3 1457";

        String IP = "192.168.24.0/19";

        //vypsani vsech promennych
        System.out.println(JmenoAPrijmeni);
        System.out.println(PocetNakupu);
        System.out.println(MestoFirmy);
        System.out.println(SpotrebaVLitrech + "L" + " Na 100KM");
        System.out.println(DelkaUTP + " m");
        System.out.println(DatumNarozeniKlienta);
        System.out.println(SPZ);
        System.out.println(IP);




    }
}
