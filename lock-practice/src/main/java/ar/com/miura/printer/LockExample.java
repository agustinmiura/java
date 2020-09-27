package ar.com.miura.printer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class LockExample {

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        lockExample.run();
    }

    public void run() {

        PrinterQueue printerQueue = new PrinterQueue();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        IntStream intstream = IntStream.range(1,10);
        intstream.forEach( i -> {
            executor.submit(new PrintingJob(printerQueue));
        });

    }
}
