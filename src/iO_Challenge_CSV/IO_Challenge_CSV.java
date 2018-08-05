package src.iO_Challenge_CSV;

/* Find a .csv data file of your choosing. I highly recommend Data.World (https://data.world/)
Download that file to your computer. I'd suggest putting it in a subdirectory of your
CodingNomads directory. Write an application that will use a BufferedReader to read this file
line by line. With each line that the BufferedReader reads, instantiate a corresponding POJO.
Add each POJO into an arraylist (code below). Once the whole .csv file is read and all objects are
created and residing in an arraylist, please loop through the arraylist and perform a function of your
choosing. You can print out the values of the objects, or iterate through them and perform some arithmetic to find averages or totals of values, etc. The end goal is to get each row of the csv file
into a corresponding Java object. Once we have that data as objects the sky is the limit on what we can do! :)

    Example: if your CSV file looks like this: (for now, let's delete the first line of the file if
    it includes the column headers, as seen below)
    first_name,last_name,birthplace,age
    ryan,desmond,medford,35
    kim,desmond,toronto,32
    ...
    Your corresponding POJO would look like: (please find your own .csv data file online)
    class YourPojo{
        String firstName;
        String lastName;
        String birthPlace;
        String age;
        // all getters and setters
    }
    Use the following code to instantiate your BufferedReader:
        // create an arraylist to store your POJO results
        ArrayList<YourPojo> resultList = new ArrayList();
        // Create and use a FileReader wrapped in a BufferedReader - file argument is for a path to a file
        // the line below is using "try-with-resources to automatically open and close the file"
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            while((nextLine = br.readLine()) != null) {
                YourPojo data = new YourPojo();
                String[] vals = nextLine.split(",");
                data.setFirstName(vals[0]);
                data.setLastName(vals[1]);
                data.setBirthPlace(vals[2]);
                data.setAge(Integer.parseInt(vals[3]);

                resultList.add(data);

            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }

  */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IO_Challenge_CSV {

    public static void main(String[] args) {



        ArrayList<Pojo> list = new ArrayList();

        //String[] arr = new String[];
        //for (String s : arr){


        String x = "/Users/kevinneag/CodingNomads/java/Challenges/csv/National_Marine_Fisheries_Service_Regions.csv";
        String myLine;


        try (BufferedReader br = new BufferedReader(new FileReader(x)))

        {
            while ((myLine = br.readLine()) != null) {
                Pojo data = new Pojo();

                String[] vals = myLine.split(",");


                data.setiD(vals[0]);
                data.setAgency(vals[1]);
                data.setAddress(vals[2]);
                data.setRegion(vals[3]);
                data.setRegion(vals[4]);
                data.setRegion(vals[5]);
                data.setRegion(vals[6]);
                data.sethTML(vals[7]);


                list.add(data);

            }
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }

        for(Pojo vals : list) {

            System.out.println(vals.getiD());
            System.out.println(vals.getAgency());
            System.out.println(vals.getRegion());
            System.out.println(vals.getAddress());
            System.out.println(vals.gethTML());
        }

    }


}

class Pojo {

    String iD;
    String agency;
    String region;
    String address;
    String hTML;



    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String gethTML() {
        return hTML;
    }

    public void sethTML(String hTML) {
        this.hTML = hTML;
    }

}


