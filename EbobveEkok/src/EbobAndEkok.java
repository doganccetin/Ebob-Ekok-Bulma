import java.util.Scanner;
public class EbobAndEkok {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int say1, say2, gcd = 1;

        System.out.print("Birinci sayıyı girin: ");
        say1 = sc.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        say2 = sc.nextInt();

        while (say2 != 0) {
            int temp = say2;
            say2 = say1 % say2;
            say1 = temp;
        }
        int ebob = say1;
        int ekok = (say1 * say2) / ebob;
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}