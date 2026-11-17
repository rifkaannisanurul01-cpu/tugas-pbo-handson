package latihan2;

interface GradingStrategy {
    double calculate(double tugas, double uts, double uas);
}

class StandardGrading implements GradingStrategy {
    public double calculate(double tugas, double uts, double uas) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}

class ReportPrinter {
    public void cetakLaporan(String nama, double nilai) {
        System.out.println("Laporan Nilai: " + nama + " = " + nilai);
    }
}

public class MainStudent {
    public static void main(String[] args) {
        GradingStrategy grader = new StandardGrading();
        double nilai = grader.calculate(80, 85, 90);

        ReportPrinter printer = new ReportPrinter();
        printer.cetakLaporan("Andi", nilai);
    }
}