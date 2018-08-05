package src.iO_ThreadChallenge;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileThread implements Runnable {

    Thread thrd;
    String  readFrom;
    String  writeTo;

    CopyFileThread(String name, String readFrom, String writeTo){
        thrd = new Thread(this, name);
        this.readFrom = readFrom;
        this.writeTo = writeTo;
        thrd.start();
    }

    public void copyFile(){

        int i;

        try (FileInputStream fin = new FileInputStream(readFrom);
             FileOutputStream fout = new FileOutputStream(writeTo))
        {

            do {
                 i = fin.read();
                if( i != -1) fout.write(i);
            } while( i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }

    }


    @Override
    public void run() {
        copyFile();

    }
}
