package ar.com.miura.printer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintingJob implements Runnable {
    private PrinterQueue printerQueue;
    private static final Logger LOGGER = LoggerFactory.getLogger(PrinterQueue.class.getName());

    public PrintingJob(PrinterQueue printerQueue) {
        this.printerQueue = printerQueue;
    }

    @Override
    public void run() {
        LOGGER.info(" Print the document : {} ", Thread.currentThread().getName());
        printerQueue.printJob(new Object());
    }
}
