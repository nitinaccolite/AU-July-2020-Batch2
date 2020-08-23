import java.util.LinkedList;
import java.util.Queue;




public class ProducerConsumerTest {

    public static void main(String[] args) throws InterruptedException {


        final Queue sharedQ = new LinkedList < Integer >();

        Thread consumerThread = new Thread(new Consumer(sharedQ, 100), "CONSUMER");
        Thread producerThread = new Thread(new Producer(sharedQ, 100), "PRODUCER");

        producerThread.start();
        consumerThread.start();


    }

}