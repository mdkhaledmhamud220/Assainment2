import java.util.Scanner;

public class RemoveComma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.next();
        int length = number.length();
        String str1 = number.substring(0, length - 4);
        String str2 = number.substring(length-3, length);
        System.out.println(str1 + str2);
    }
}
