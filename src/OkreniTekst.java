import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OkreniTekst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Upiši tekst za analizu:");
        String tekst = sc.nextLine().trim();
        String[] splitaniTekst = tekst.split(" ");
        List<String> reversedTekst = new ArrayList<>();
        for(int i=splitaniTekst.length-1; i>=0; i--) {
            reversedTekst.add(splitaniTekst[i]);
        }
        for (String s : reversedTekst) {
            System.out.print(s + " ");
        }
    }

}
//Napišite program u Javi koji će učitati niz znakova (string) sa standardnog ulaza i okrenuti redoslijed riječi u unesenom stringu. Prikazati transformirani string s obrnutim redoslijedom riječi.
//Primjer ulaza: Dobar dan svima
//Primjer izlaza: svima dan Dobar