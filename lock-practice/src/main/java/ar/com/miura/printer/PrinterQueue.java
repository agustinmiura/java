package ar.com.miura.printer;

import java.time.LocalDateTime;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrinterQueue {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrinterQueue.class.getName());

    private final Lock queueLock = new ReentrantLock();

    public void printJob(Object document) {

        try {
            //Start critical section
            queueLock.tryLock();
            Long duration = getLength();
            LOGGER.info(" PrintQueue : Printing a Job during : {} , seconds , at : Time : {} ", duration/1000, LocalDateTime.now());
            Thread.sleep(duration);
        } catch (Exception e) {
            LOGGER.error(" Error with locks ",e);
        } finally {
            //End critical section
            queueLock.unlock();
        }
    }

    private long getLength() {
        return (long) (Math.random()*10000);
    }
}
