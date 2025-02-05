import java.util.List;
import java.util.Scanner;

public class KlasaStringMetode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Upiši ime i prezime: ");
        String imePrezime = sc.nextLine();
        String[]imePrezimeSplit = imePrezime.trim().split(" ");
       String ime = imePrezimeSplit[0];
        String prezime = imePrezimeSplit[1];

        while(ime.length()>7) {
            System.out.println("Ime je duže od 7 znakova. ");
            System.out.println("Upiši ime i prezime: ");
            imePrezime=sc.nextLine();
            imePrezimeSplit = imePrezime.trim().split(" ");
            ime = imePrezimeSplit[0];
            prezime = imePrezimeSplit[1];
        }


        System.out.println("Upiši grad rođenja: ");
        String grad = sc.nextLine();
        String[] gradSplit = grad.trim().toLowerCase().split("");
        String[] samoglasnici = {"a", "e", "i", "o", "u"};


        System.out.printf("Upisali ste ime: %s\n", ime);
        System.out.printf("Upisali ste prezime: %s\n", prezime);
        for (String s : gradSplit) {
            for (String sam : samoglasnici) {
                if(s.equals(sam) ) {
                    System.out.printf("\nGrad ima samoglasnik: %s", sam);
                }
            }
        }

        sc.close();


    }
}
