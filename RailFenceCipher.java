import java.util.*;

public class RailFenceCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plaintext: ");
        String text = sc.nextLine().replaceAll("\\s", "").toUpperCase();
        System.out.print("Enter key (number of rails): ");
        int key = sc.nextInt();

        StringBuilder[] rail = new StringBuilder[key];
        for (int i = 0; i < key; i++) rail[i] = new StringBuilder();

        int row = 0, dir = 1;
        for (char c : text.toCharArray()) {
            rail[row].append(c);
            if (row == 0) dir = 1;
            else if (row == key - 1) dir = -1;
            row += dir;
        }

        StringBuilder cipher = new StringBuilder();
        for (StringBuilder sb : rail) cipher.append(sb);
        System.out.println("Encrypted text: " + cipher);
        sc.close();
    }
}
