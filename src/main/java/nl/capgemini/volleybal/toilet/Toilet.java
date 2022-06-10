package nl.example.volleybal.toilet;


// Singleton Pattern
public class Toilet {

    private static Toilet instance;
    private static final int MAXVISITS = 30;


    private int visits = 0;

    public synchronized static Toilet getInstance() {

        if (instance == null) {
            instance = new Toilet();
        }

        return instance;
    }

    public synchronized void visit(long id) throws InterruptedException {

        while (isDirty()) {
            notifyAll();
            wait();

        }

        System.out.println("The toilet has now been used by: " + id);
        this.visits++;
    }

    public boolean isDirty() {

        if (this.visits >= MAXVISITS) {
            System.err.println("Gadverdamme, dat is een vies toilet");

            return true;
        }
        else {
            return false;
        }
    }

    public synchronized void clean() throws InterruptedException {
        while (isDirty()) {
            System.out.println("Cleaning the toilet ... ");
            this.visits = 0;
            notifyAll();
            wait();
        }

    }

    private Toilet() {

    }

    public int getVisits() {
        return visits;
    }
}
