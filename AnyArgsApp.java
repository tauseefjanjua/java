public class AnyArgsApp {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument:" + i + " value " + args[i]);
        }
    }
}

// command: javac AnyArgsApp.java
// command: java AnyArgsApp i can pass any number of arguments