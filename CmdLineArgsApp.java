public class CmdLineArgsApp {
    public static void main(String[] args) {
        System.out.println("First argument " + args[0]);
        System.out.println("Second argument " + args[1]);
    }
}

// command: javac AnyArgsApp.java
// command: java AnyArgsApp i can pass any number of arguments