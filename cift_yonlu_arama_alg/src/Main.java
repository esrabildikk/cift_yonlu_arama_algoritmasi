import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Dosya yolu
        String filePath = System.getProperty("user.home") + "/Desktop/alice_in_wonderland.txt";

        // Dosya nesnesi oluşturma
        File file = new File(filePath);

        // Dosyanın okunabilir olduğundan emin olma
        if (!file.canRead()) {
            System.out.println("Dosya okunamıyor.");
            return;
        }

        // Aranacak kelimeler
        String[] words = {"upon", "sigh", "Dormouse", "jury-box", "swim"};

        try {
            // Scanner nesnesi oluşturma
            Scanner scanner = new Scanner(file);

            // Her kelimenin sayısını tutacak dizi
            int[] counts = new int[words.length];

            // Dosyanın sonuna kadar okuma
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Satırın başlangıcından ve sonundan boşlukları kaldırma
                line = line.trim();

                // Her kelimeyi ayırmak için boşlukları kullanarak satırı bölme
                String[] lineWords = line.split(" ");

                // Satırdaki her kelime için çift yönlü arama algoritması kullanarak sayısını bulma
                for (String word : lineWords) {
                    for (int i = 0; i < words.length; i++) {
                        if (word.equalsIgnoreCase(words[i])) {
                            counts[i]++;
                        }
                    }
                }
            }

            // Sonuçları yazdırma
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i] + ": " + counts[i]);
            }

            // Scanner nesnesini kapatma
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
