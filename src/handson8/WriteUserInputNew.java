package handson8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
        import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WriteUserInputNew {
    public static void main(String[] args) {
        Path path = Paths.get("user_input.txt");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try (Scanner sc = new Scanner(System.in);
             BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {

            System.out.println("Masukkan teks (ketik 'exit' untuk berhenti):");
            while (true) {
                System.out.print("Enter text: ");
                String text = sc.nextLine();

                if (text.equalsIgnoreCase("exit")) {
                    break;
                }

                // Tambahkan timestamp pada setiap baris input
                String timestamp = dtf.format(LocalDateTime.now());
                bw.write("[" + timestamp + "] " + text);
                bw.newLine();
            }
            System.out.println("Data berhasil disimpan!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}