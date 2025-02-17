package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creazione array
        String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // richiesta nome utente
        System.out.println("Scrivi il tuo nome qui: ");
        String nome = input.nextLine();
        input.close();

        // Ricerca nell'array con ciclo while
        boolean isOnList = false;
        int i = 0;

        while (!isOnList && i < invitati.length) {
            String invitato = invitati[i];

            if (nome.equals(invitato)) { // o anche invitati[i].equals(nome)
                isOnList = true;
            } else {
                i++;
            }
        }

        if (isOnList) {
            System.out.println("Sei nella lista. Entra pure");
        } else {
            System.out.println("Mi spiace, non sei nella lista.");
        }

        // PROBLEMI: come rendere l'input case insensitive? Fin quanto posso sbagliare
        // una stringa?
        // Esiste una formattazione per rendere l'input case insensitive, o una regex? Basta anche un .toLowerCase()
    }
}