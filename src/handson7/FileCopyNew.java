package handson7;

import java.io.IOException;
import java.nio.file.*;
        import java.util.List;

public class FileCopyNew {
    public static void main(String[] args) {
        Path source = Paths.get("report.txt");
        Path backup = Paths.get("backup/report.txt");
        Path logFile = Paths.get("log.txt");

        try {
            // Buat file sumber jika belum ada
            if (Files.notExists(source)) {
                Files.write(source, List.of("Report Generated", "Status: OK"));
            }

            // Buat folder parent backup jika belum ada
            if (Files.notExists(backup.getParent())) {
                Files.createDirectories(backup.getParent());
            }

            // Pengecekan file sebelum menyalin
            if (Files.exists(source)) {
                Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Backup created successfully!");

                // Membuat log hasil operasi ke file log.txt
                String logMessage = "LOG: File berhasil disalin.\n";
                Files.write(logFile, logMessage.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } else {
                System.out.println("File sumber tidak ada.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}