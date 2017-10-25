package src.io_ThreadChallenge2;

//New Challenge
//create a csv file
//copy it from csv to five different threads and replace all a's with capital A's.
//use bufferreader to split it into an array and change the second column go from 1 to 100
//insert :) into every 5th sport




import java.io.*;

public class ChangeFile implements Runnable {

    Thread trd;
    String readFrom;
    String writeTo;
    String myLine;

    public ChangeFile(String name, String readFrom, String writeTo) {
        trd = new Thread(this, name);
        this.readFrom = readFrom;
        System.out.println(readFrom);
        this.writeTo = writeTo;
        System.out.println(writeTo);
        trd.start();
    }


    @Override
    public void run() {
        copyFile();

    }

    public void copyFile() {

        int i;
        char ch;

        try {
            BufferedReader br = new BufferedReader(new FileReader(readFrom));
            FileOutputStream fout = new FileOutputStream(writeTo);

                do {
                    i = br.read();
                    if (i == 'a') i = 'A';

                    if (i != -1) fout.write(i);
                } while (i != -1);


            } catch(IOException exc){
                System.out.println("I/O Error: " + exc);
            }

        }

    }

