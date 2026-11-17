package handson9;

import java.io.*;

class Employee implements Serializable {
    String name;
    int age;

    Employee(String n, int a) {
        this.name = n;
        this.age = a;
    }
}

public class SerializeDemo {
    // Method deserialize tambahan
    public static Employee deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Employee) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 30);

        // Menulis objek ke file biner
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"))) {
            oos.writeObject(e1);
            System.out.println("Serialized successfully.");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        // Uji membaca kembali dengan method deserialize
        Employee restored = deserialize("emp.ser");
        if (restored != null) {
            System.out.println("Deserialized: " + restored.name + ", " + restored.age);
        }
    }
}