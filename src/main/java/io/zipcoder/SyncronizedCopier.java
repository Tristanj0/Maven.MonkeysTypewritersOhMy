package io.zipcoder;

public class SyncronizedCopier extends Copier {
    public SyncronizedCopier(String toCopy) {
        super(toCopy);
    }

    synchronized public void run() {
        super.run();
    }
}

