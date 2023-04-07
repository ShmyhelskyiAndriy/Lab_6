import java.util.Scanner;
public class Lab61 {
    public static void main(String[] args) {
        String sentence= " ";
        for (int i = 0; i < 5; i++) {
            System.out.print("Введіть слово: ");
            Scanner sent = new Scanner(System.in);
            String word = sent.next();

            sentence=sentence.concat(word);
        }System.out.print(sentence);

    }
}