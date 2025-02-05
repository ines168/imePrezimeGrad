import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Niz znakova - string
        String fakultet = "Fakultet organizacije i informatike Varaždin";
        String[] rijecFakultet = fakultet.split(" ");
        for (String s : rijecFakultet) {
            System.out.println(s);
        }

        List<String> niz1= new ArrayList<>();
        niz1.add("niz");

        String recenica = "          Danas je bio hladan dan      ";
        System.out.println("Unos ima znakova: " + recenica.length());
        recenica = recenica.trim();
        System.out.println("Unos ima znakova: " + recenica.length());

    }
}