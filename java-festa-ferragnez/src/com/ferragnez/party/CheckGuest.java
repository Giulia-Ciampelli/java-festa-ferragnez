// Bonus
// se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creazione array
        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // prova ciclo for per stampare tutto
        for (int i = 0; i < invitati.length; i++) {
            System.out.println(invitati[i]);
        }

        // richiesta nome utente
        System.out.println("Scrivi il tuo nome qui: ");
        String nome = input.nextLine();

        // Ricerca nell'array con ciclo while
        boolean isOnList = false;
        int i = 0;

        while (!isOnList && i < invitati.length) {
            String invitato = invitati[i];

            if (nome.equals(invitato)) {
                isOnList = true;
            }
            else {
                i++;
            }
        }

        if (isOnList) {
            System.out.println("Sei nella lista. Entra pure");
        }
        else {
            System.out.println("Mi spiace, non sei nella lista.");
        }

        input.close();

        // PROBLEMI: come rendere l'input case insensitive? Fin quanto posso sbagliare una stringa?
        // Esiste una formattazione per rendere l'input case insensitive, o una regex?s
    }
}