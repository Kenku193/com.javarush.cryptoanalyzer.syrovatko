import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        System.out.println("Выберите режим работы:");
        System.out.println("1. Шифруем");
        System.out.println("2. Дешифруем");
        System.out.println("3");

        Scanner console = new Scanner(System.in);
        int i = console.nextInt();
        if (i == 1){
        Encryption.doEncrypt();
        }
        else if (i == 2) {

            Decryption.doDecrypt();
        }
        else if (i == 3) {
            BruteForce.doBruteForce();
        }
        else {

        }

    }
}
