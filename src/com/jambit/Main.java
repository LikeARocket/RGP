package com.jambit;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Raum Sumatra = new Raum();
        Sumatra.cherryStatus = false;
        Raum Lombok = new Raum();
        Lombok.cherryStatus = true;
        Sumatra.gruss();
        Sumatra.raumAuswahl();
    }
}
