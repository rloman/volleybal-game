package nl.example.volleybal.toilet;

public class Customer implements Runnable {

    private static int counter = 0;

    private long id;

    public Customer() {
        this.id = ++counter;
    }


    @Override
    public void run() {

        try {
            Toilet.getInstance().visit(this.id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
