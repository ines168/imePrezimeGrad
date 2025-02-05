import java.util.Scanner;

public class BrojeviSlovaZnakovi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upiši tekst za analizu:");
        String tekst = sc.nextLine().trim();
        Character[] charArray = new Character[tekst.length()];

        for(int i=0; i<tekst.length(); i++) {
            charArray[i] = tekst.charAt(i);
        }

        int slova = 0;
        int znakovi = 0;
        int brojevi = 0;
        for (Character c : charArray) {
            if(Character.isLetter(c)) {
                slova++;
            } else if(Character.isDigit(c)) {
                brojevi++;
            } else {
                znakovi++;
            }
        }

        System.out.println("Tekst " + tekst + " ima:");
        System.out.println("\tSlova: " + slova);
        System.out.println("\tZnakovi: " + znakovi);
        System.out.println("\tBrojevi: " + brojevi);

    }
}
//Napišite program koji učitava niz znakova sa standardnog ulaza i ispisuje koliko ima slova, koliko brojeva i koliko "ostalih znakova". Npr. ako je uneseni niz znakova "Danas je 27.02.2010.", program treba ispisati:
//
//Slova: 7
//Brojevi: 8
//Ostali znakovi: 5