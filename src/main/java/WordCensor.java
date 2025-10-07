import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String original = sc.nextLine();
        String dang = original.replace("dang", "***");
        String nuts = dang.replace("nuts", "***");
        String oops = nuts.replace("oops", "***");
        String yikes = oops.replace("yikes", "***");
        System.out.println("Censored: " + yikes);
    }
}
