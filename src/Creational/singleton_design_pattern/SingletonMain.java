package Creational.singleton_design_pattern;

class SingletonMain {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.getMessage());

        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // true → same object
    }
}