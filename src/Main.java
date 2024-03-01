import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int sayi) {
        int temp = sayi, terssayi = 0, sonsayi;
        while (temp != 0) {
            sonsayi = (temp % 10);
            terssayi = (terssayi * 10) + sonsayi;
            temp /= 10;
        }
        return sayi == terssayi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Palindrom Testi için bir sayı giriniz");

        int sayi = input.nextInt();
        if (isPalindrome(sayi)) {
            System.out.println(sayi +"sayı bir palindromdur.");
        } else {
            System.out.println( sayi +" sayı bir palindrom değildir.");
        }
    }
}

