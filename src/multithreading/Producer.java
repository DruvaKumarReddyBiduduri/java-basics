package multithreading;

public class Producer extends Thread{

    Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce();
        }
    }
}
