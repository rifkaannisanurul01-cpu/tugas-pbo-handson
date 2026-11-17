package handson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
        import java.util.ArrayList;
import java.util.List;

public class ReadingText {
    public static void main(String[] args) {
        Path path = Paths.get("employees.txt");
        List<String> employeeList = new ArrayList<>();

        // Deteksi jika file tidak ditemukan
        if (Files.notExists(path)) {
            System.out.println("Error: File 'employees.txt' tidak ditemukan!");
            return;
        }

        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                employeeList.add(line); // Simpan ke ArrayList
            }

            // Tuliskan ke file baru copy_employees.txt
            Path outputPath = Paths.get("copy_employees.txt");
            Files.write(outputPath, employeeList, StandardCharsets.UTF_8);
            System.out.println("Berhasil menyalin ke file 'copy_employees.txt'");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}