package nl.example.volleybal.toilet;

public class Cleaner implements Runnable {


    @Override
    public void run() {

        for (; ; ) {
            try {
                Toilet.getInstance().clean();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
