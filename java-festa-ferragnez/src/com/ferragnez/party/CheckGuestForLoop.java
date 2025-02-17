// Bonus
// se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creazione array
        String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // richiesta nome utente
        System.out.println("Scrivi il tuo nome qui: ");
        String nome = input.nextLine();
        input.close();

        // ricerca nell'array con ciclo for
        boolean isOnList = false;

        for (int i = 0; i < invitati.length; i++) {
            String invitato = invitati[i];

            if (nome.equals(invitato)) { // si può anche usare AND
                isOnList = true;
                break;
            } else {
                i++;
            }
        }

        if (isOnList) {
            System.out.println("Sei nella lista. Entra pure");
        } else {
            System.out.println("Mi spiace, non sei nella lista.");
        }
    }
}
