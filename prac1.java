// Singleton Class
class Singleton {
    static Singleton instance = new Singleton(); 
    
    private Singleton() {
        System.out.println("Singleton Created.");
    }

    void helloWorld() {
        System.out.println("Hello World!");
    }
}

// Main Class
public class prac1 {
    public static void main(String[] args) {
        Singleton.instance.helloWorld();
    }
}