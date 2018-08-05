package src.main.java.iO_ThreadChallenge;


public class CopyFileContorller {

    public static void main(String[] args) {

        String readFrom = "/Users/kevinneag/Downloads/National_Marine_Fisheries_Service_Regions.csv";
        String writeTo = "/Users/kevinneag/Downloads/";

        CopyFileThread copy = new CopyFileThread("First_Copy",readFrom, writeTo+"1.csv" );
        CopyFileThread copy2 = new CopyFileThread("Second_Copy", readFrom, writeTo+"2.csv");
        CopyFileThread copy3 = new CopyFileThread("Thrid_Copy",readFrom, writeTo+"3.csv" );
        System.out.println("Copying Complete");

    }


}
