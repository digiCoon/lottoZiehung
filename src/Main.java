import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();            // Zufallsgenerator
        Scanner scan = new Scanner(System.in);      // Scanner Usereingabe

        var lottoNums = new int[6];
        var userNums = new int[6];
        int hitCount = 0;

        System.out.println("Bitte gib 6 Lottozahlen ein (1–49):");

        // Eingabe Lottozahlen
        for(int i = 0; i <= 5; i++) {
            try {
                userNums[i] = scan.nextInt();
                // Prüfung nach doppelter Eingabe
                for(int j = 0; j < i; j++) {
                    if(userNums[i] == userNums[j]){
                        System.out.println("Diese Zahl hast du schon eingegeben!");
                        i--;
                    }
                }
                // Prüfung ob korrekter Bereich
                if(userNums[i] < 1 || userNums[i] > 49){
                    System.out.println("Ungültig! Die Zahl muss zwischen 1 und 49 liegen.");
                    i--;
                }
            } catch (InputMismatchException e) {
                System.out.println("Bitte nur gültige Zahlen eingeben (1–49). Versuche es erneut:");
                scan.nextLine();
                i--;
            }
        }
        System.out.println("Deine getippten Zahlen: " + Arrays.toString(userNums));

        // Ziehung Lottozahlen
        for(int i = 0; i <= 5; i++){
            lottoNums[i] = generator.nextInt(1, 50);

            // Abfrage ob Zahl schon vorhanden ist
            for(int j = 0; j < i; j++) {
                if(lottoNums[i] == lottoNums[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println("Gezogene Lottozahlen: " + Arrays.toString(lottoNums));

        // Vergleich Tipp & gezogene Zahlen
        for(int i = 0; i <= 5; i++){
            for(int j = 0; j <= 5; j++){
                if(lottoNums[i] == userNums[j]){
                    hitCount++;
                }
            }
        }
        System.out.println("Anzahl richtiger Treffer: " + hitCount);

        if(hitCount == 0 || hitCount == 1){
            System.out.println("Keine Übereinstimmung. Vielleicht klappt’s beim nächsten Mal!");
        } else if (hitCount == 2 || hitCount == 3) {
            System.out.println("Glückwunsch! Ein kleiner Gewinn ist drin!");
        } else if (hitCount == 4 || hitCount == 5) {
            System.out.println("Wow! Das ist ein richtig ordentlicher Gewinn!");
        } else {
            System.out.println("Unglaublich! 6 Richtige! Du bist Lotto-Millionär!");
        }
    }
}