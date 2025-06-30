public class Answer5 {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton.doSomethingStatic();

        obj.doSomethingElse();
    }
}

class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Constructor Called");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void doSomethingStatic() {
        System.out.println("Doing some static work");
    }

    public void doSomethingElse() {
        System.out.println("Doing something else");
    }
}


