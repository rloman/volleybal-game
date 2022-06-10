package nl.example.volleybal.toilet;

public class ToiletApplication {

    public static void main(String[] args) throws InterruptedException {
        Toilet toilet = Toilet.getInstance();

        new Thread(new Cleaner()).start();

        for (int i = 0; i < 100; i++) {
            new Thread(new Customer()).start();
        }

        Thread.sleep(10000);

        System.out.println(toilet.getVisits());
    }
}
