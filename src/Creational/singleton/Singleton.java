package Creational.singleton;

import java.io.Serializable;


public class Singleton implements Serializable, Cloneable {

    // 1️⃣ volatile → ensures visibility across threads
    // Without volatile, another thread may see partially constructed object
    private static volatile Singleton instance;

    // ✔ Simple meaningful data instead of String
    private String message;

    // 2️⃣ private constructor prevents direct object creation
    private Singleton() {

        // 🛡️ Reflection protection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method");
        }

        // ✔ Simple initialization
        message = "Hello, I am the only instance!";
    }

    // 3️⃣ Thread-safe lazy initialization (Double-Checked Locking)
    public static Singleton getInstance() {

        if (instance == null) { // First check (no locking)
            synchronized (Singleton.class) {

                if (instance == null) { // Second check (with locking)
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    // Getter method
    public String getMessage() {
        return message;
    }

    // 🛡️ Cloning protection
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not allowed");
    }

    // 🛡️ Serialization protection
    protected Object readResolve() {
        return getInstance();
    }
}

class SingletonMain {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.getMessage());

        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // true → same object
    }
}
