package latihan1;

interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim Email: " + message);
    }
}

class SmsNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}

public class MainNotif {
    public static void main(String[] args) {
        Notifier notif = new EmailNotifier();
        notif.send("Halo, ini email test!");
    }
}