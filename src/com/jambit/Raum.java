package com.jambit;

import java.util.Scanner;


public class Raum {
    public String name;
    public boolean cherryStatus;

    public void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");

        }

    }

    public void gruss() {
        System.out.println("Willkomen zu jambit");
        System.out.println("Ihr Ziel ist es, Cherry zu finden.");
        System.out.println("");
        System.out.println("                                             _________________________________________________________________\n" +
                "                                                                  |                                                                |\n" +
                "                                                                  |                                                                |\n" +
                "                                                                  |                                                                |\n" +
                "               ___________________________________________________|                     ___________________________________________|\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                       Toko (11)                                       |                                           |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                                                  |                    |                   Kalimant (k)            |\n" +
                "               |__________________________________________________|                    |                                           |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                                                  |                    |___________________________________________|\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                        Deli (9)                                       |                                           |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                                                  |                    |                    Java (j)               |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |__________________________________________________|                                                                |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                                                  |                    |___________________________________________|\n" +
                "               |                        Biang (7)                                      |                                           |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |                                                  |                                    HerrenToilette (ht)         |\n" +
                "               |                                                  |                    |                                           |\n" +
                "               |__________________________________________________|                    |                                           |\n" +
                "               |    |____|                          |____|        |                    |-------------------------------------------|\n" +
                "               |      O                                O          |                    |                                           |\n" +
                "               |          O  |  O                                 |                                                                |\n" +
                "               |        _____|______       TA-Office (5)       ___.                    |                DammenToilette (dt)        |\n" +
                "               |             |                                    |                    |                                           |\n" +
                "               |          O  |  O                                 |                    |___________________________________________|\n" +
                "               |__________________________________________________|                    |                                           |\n" +
                "               |     **                __                                              |         ________Treppenhaus_(th)_____     |\n" +
                "               |    ****        ___   |__|   ___               **                      |        | ||||||||||||||||||||||||||  |    |\n" +
                "               |   ******       \\__\\   ___  /__/              ****                     |        | ||||||||||||||||||||||||||  |    |\n" +
                "               |    ****              |___|                  ******                    |        | ==========================  |    |\n" +
                "               |     **                        __             ****                     |        | ||||||||||||||||||||||||||  |    |\n" +
                "               |                               \\ \\             **                      |________|_|___________________________|    |\n" +
                "               |                                \\ \\                                    |   |            |              |           |\n" +
                "               |                                 \\ \\                                   |   |            |              |           |\n" +
                "               |                Rezeption (i)     \\ \\                                  |   |            |              |           |\n" +
                "               |                                  / /                                  |___|____________|______________|____   ____|\n" +
                "               |                                 / /                                   |                                           |\n" +
                "               |                                / /                                                                                |\n" +
                "               |_______________________________/_/______________   _________   ________|___________________________________________|\n" +
                "               |                                                       |                                                           |\n" +
                "               |                                                       |                                                           |\n" +
                "               |                                                       |                                                           |\n" +
                "               |                      Lombok (l)                       |                        Sumatra (s)                        |\n" +
                "               |                                                       |                                                           |\n" +
                "               |                                                       |                                                           |\n" +
                "               |_______________________________________________________|___________________________________________________________|");
    }

    public boolean checkCherry() {
        if (this.quickmaths() == 0) {
            System.out.println("Yeah cherry is here");
            System.out.println("Epic Victory Royal");
            System.exit(0);
            return true;
        } else {
            System.out.println("Cherry is not here");
            System.out.println("Try again");
            raumAuswahl();
            return false;
        }
    }

    public int quickmaths() {
        int abc = (int) (Math.random() * 2);
        return abc;
    }

    public void raumAuswahl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("                                                    Bitte wähle einen Raum aus");
        System.out.println("|-------|------|---------|---------|-----------|-------------|--------------|-----|----|----|----|----------|");
        System.out.println("|Sumatra|Lombok|Rezeption|TA-Office|Treppenhaus|DamenToilette|HerrenToilette|Biang|Deli|Java|Toko|Kalimantan|");
        System.out.println("|-------|------|---------|---------|-----------|-------------|--------------|-----|----|----|----|----------|");
        System.out.println("|   s   |  l   |    i    |    5    |    th     |      dt     |      ht      |  7  |  9 | j  | 11 |     k    |");
        System.out.println("|-------|------|---------|---------|-----------|-------------|--------------|-----|----|----|----|----------|");

        while (true) {
            String welcome = sc.nextLine();
            String auswahl;
            switch (welcome) {
                case "Sumatra":
                case "s":
                    auswahl = "Sumatra";
                    clear();
                    System.out.println("Sumatra ist gerade von den erstjahr Azubis belegt, welchen ein Text based RPG programieren.");
                    raumAuswahl();
                    break;
                case "Lombok":
                case "l":
                    auswahl = "Lombok";
                    clear();
                    System.out.println("Sie sind jetzt im Lombok.");
                    if (checkCherry())
                        raumAuswahl();
                    break;
                case "Rezeption":
                case "i":
                    auswahl = "Rezeption";
                    clear();
                    System.out.println("Sie seind jetzt bei der Reception");
                    System.out.println("Alma: Hey! was kann ich für euch tun?");
                    System.out.println("");
                    new Scanner(System.in);
                    System.out.println("Was wollen sie Fragen:");
                    System.out.println("1. Hey, weißt du wo Cherry ist?");
                    System.out.println("2. Was machst du Alma?");
                    int what = sc.nextInt();
                    int i;
                    if (what == 1) {
                        clear();
                        System.out.println("Hey weißt du wo Cherry ist?");
                        System.out.println("Alma: ja, Cherry müsste im x sein");
                        raumAuswahl();
                    } else if (what == 2) {
                        clear();
                        System.out.println("Was machst du Alma?");
                        System.out.println("Alma: >:( ?#@*&%!");
                        raumAuswahl();
                    }
                    break;
                case "TA-Office":
                case "5":
                    auswahl = "TA-Office";
                    clear();
                    System.out.println("Sie sind jetzt bei den TAs.");
                    if (!checkCherry())
                        raumAuswahl();
                    break;
                case "Treppenhaus":
                case "th":
                    auswahl = "Treppenhaus";
                    clear();
                    System.out.println("Adal: RAUS HIER! Ich bin gerade am rauchen!");
                    raumAuswahl();
                    break;
                case "DamenToilette":
                case "dt":
                    auswahl = "DamenToilette";
                    clear();
                    System.out.println("Würde Cherry hier sein, hätte er ein ernstes Problem.");
                    raumAuswahl();
                    break;
                case "HerrenToilette":
                case "ht":
                    auswahl = "HerrenToilette";
                    clear();
                    System.out.println("Sofern Cherry hier wäre, würden wir ihn nun wirklich nicht stören wollen. Probiere einen anderen Raum.");
                    raumAuswahl();
                    break;
                case "Biang":
                case "7":
                    auswahl = "Biang";
                    clear();
                    System.out.println("Sie sind jetzt im Biang.");
                    if (!this.checkCherry())
                        raumAuswahl();
                    break;
                case "Deli":
                case "9":
                    auswahl = "Deli";
                    clear();
                    System.out.println("Sie sind jetzt im Deli.");
                    if (!this.checkCherry())
                        raumAuswahl();
                    break;
                case "Java":
                case "j":
                    auswahl = "Java";
                    clear();
                    System.out.println("Cherry ist nicht hier. Hohl dir einen Kaffee und such weiter");
                    raumAuswahl();
                    break;
                case "Toko":
                case "11":
                    auswahl = "Toko";
                    clear();
                    System.out.println("Sie sind jettz im Toko.");
                    if (!this.checkCherry())
                        break;
                case "Kalimantan":
                case "k":
                    auswahl = "Kalimantan";
                    clear();
                    System.out.println("Obwohl hier niemand gerne sein will, sind Sie dennoch jetzt im Kalimantan.");
                    if (!this.checkCherry()) ;
                    break;

            }


        }
    }
}