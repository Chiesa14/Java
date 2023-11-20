package ser;


public class exec {
    public void start() {
        try {
            System.out.println("starting");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("p");
            System.exit(0);
        } finally {
            System.out.println("s");
        }
    }

    public static void main(String[] args) {
        new exec().start();
    }
}


