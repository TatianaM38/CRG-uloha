package com.company;

// Importovanie knižníc
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // Vyhlásenie premenných
        boolean[] miesta;
        miesta = new boolean[15];
        int limit = 0;
        int vyhernePokusy = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String vstup;
        String[] vybraneMiesta;
        vybraneMiesta = new String[15];
        int suradnica;

        // Generovanie výherných pozícií limitované na 5 súradníc
        while (limit < 5) {
            // Náhodná generácia súradnice
            int poziciaVytaznehoMiesta = random.nextInt(15);

            // Označenie súradnice ako výherná v prípade ak ešte nie je + Zvýšenie kontrolnej premennej
            if (miesta[poziciaVytaznehoMiesta] != true) ;
            {
                miesta[poziciaVytaznehoMiesta] = true;
                limit++;
            }
        }

        // Zaplnenie poľa
        for (int i = 0; i < 15; i++)
        {
            vybraneMiesta[i] = "X";
        }

        // Opakované zobrazenie žrebu a pokynov
        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("**************************************");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___________________");
            System.out.println("|                 |");
            System.out.println("|     Výherný     |");
            System.out.println("|    BILLA žreb   |");
            System.out.println("|                 |");
            System.out.println("|    X = Neznáme  |");
            System.out.println("|    + = Výhra    |");
            System.out.println("|    - = Prehra   |");
            System.out.println("|                 |");
            System.out.println("|  Z | 1 2 3 4 5  |");
            System.out.println("|  --+----------  |");
            System.out.println("|  A | "+vybraneMiesta[0]+" "+vybraneMiesta[1]+" "+vybraneMiesta[2]+" "+vybraneMiesta[3]+" "+vybraneMiesta[4]+"  |");
            System.out.println("|  B | "+vybraneMiesta[5]+" "+vybraneMiesta[6]+" "+vybraneMiesta[7]+" "+vybraneMiesta[8]+" "+vybraneMiesta[9]+"  |");
            System.out.println("|  C | "+vybraneMiesta[10]+" "+vybraneMiesta[11]+" "+vybraneMiesta[12]+" "+vybraneMiesta[13]+" "+vybraneMiesta[14]+"  |");
            System.out.println("|_________________|");
            System.out.println();
            System.out.println("Žreb má päť výherných symbolov,");
            System.out.println("skúste si tipnúť a vyhrať.");
            System.out.println("Počet vyhraných symbolov : " + vyhernePokusy);
            System.out.println("Počet pokusov : " + (5 - i));
            System.out.println("Napríklad: A1");
            System.out.println();

            // Ziskavanie vstupu od uživaťeľa
            System.out.print("Zadajte svoj tip (iba jednu súradnicu) : ");
            vstup = sc.next();

            // Zmenenie súradníc na decimálny tvar pre jednoduchšie vyhnodnotenie
            suradnica = 0;
            for (int y = 0; y < vstup.length(); y++)
            {
                if(vstup.charAt(y) == 'B')
                {
                    suradnica = suradnica + 4;
                }
                if(vstup.charAt(y) == 'C')
                {
                    suradnica = suradnica + 9;
                }
                if(vstup.charAt(y) == '2')
                {
                    suradnica = suradnica + 1;
                }
                if(vstup.charAt(y) == '3')
                {
                    suradnica = suradnica + 2;
                }
                if(vstup.charAt(y) == '4')
                {
                    suradnica = suradnica + 3;
                }
                if(vstup.charAt(y) == '5')
                {
                    suradnica = suradnica + 4;
                }
            }

            // Vyhodnotenie a nastavenie suradnice ako nevyhernej aby tá istá súradnica nedávala body viac krát
            if(miesta[suradnica] == false)
            {
                vybraneMiesta[suradnica] = "-";
            }
            if(miesta[suradnica] == true)
            {
                miesta[suradnica] = false;
                vybraneMiesta[suradnica] = "+";
                vyhernePokusy++;
            }
        }

        // Finálna správa uživateľovi
        System.out.println("**************************************");
        System.out.println();
        System.out.println("___________________");
        System.out.println("|                 |");
        System.out.println("|     Výherný     |");
        System.out.println("|    BILLA žreb   |");
        System.out.println("|                 |");
        System.out.println("|    X = Neznáme  |");
        System.out.println("|    + = Výhra    |");
        System.out.println("|    - = Prehra   |");
        System.out.println("|                 |");
        System.out.println("|  Z | 1 2 3 4 5  |");
        System.out.println("|  --+----------  |");
        System.out.println("|  A | "+vybraneMiesta[0]+" "+vybraneMiesta[1]+" "+vybraneMiesta[2]+" "+vybraneMiesta[3]+" "+vybraneMiesta[4]+"  |");
        System.out.println("|  B | "+vybraneMiesta[5]+" "+vybraneMiesta[6]+" "+vybraneMiesta[7]+" "+vybraneMiesta[8]+" "+vybraneMiesta[9]+"  |");
        System.out.println("|  C | "+vybraneMiesta[10]+" "+vybraneMiesta[11]+" "+vybraneMiesta[12]+" "+vybraneMiesta[13]+" "+vybraneMiesta[14]+"  |");
        System.out.println("|_________________|");
        System.out.println();
        System.out.println("Finálny počet výherných pokusov je : " + vyhernePokusy);
        System.out.println();
        System.out.println("**************************************");
    }
}
