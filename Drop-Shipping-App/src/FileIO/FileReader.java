package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    private String[] stringsFromFiles;

    public String[] getDatasFromFile(String path){
        try {
            String line;
            int lengthOfFile;

            //Take the file from path
            BufferedReader reader = new BufferedReader(new java.io.FileReader(path));

            //Get the number of lines in the file and create the array with that size
            lengthOfFile = getLengthOfFile(path);
            stringsFromFiles = new String[lengthOfFile];

            //Put each line as one String element in products array
            for (int i = 0; i<lengthOfFile; i++) {
                stringsFromFiles[i] = reader.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occured (FileNotFoundException");
        } catch (IOException e) {
            System.out.println("An error occured (IOException");
        }

        return stringsFromFiles;
    }
/*
    public String[] getSalesFromFile(String path){
        try {
            String line;
            int lengthOfFile;

            //Take the file from path
            BufferedReader reader = new BufferedReader(new java.io.FileReader(path));

            //Get the number of lines in the file and create the array with that size
            lengthOfFile = getLengthOfFile(path);
            sales = new String[lengthOfFile];

            //Put each line as one String element in sales array
            for (int i = 0; i<lengthOfFile; i++) {
                sales[i] = reader.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occured (FileNotFoundException");
        } catch (IOException e) {
            System.out.println("An error occured (IOException");
        }

        return sales;
    }


*/
       /*

        public String[] getCustomersFromFile(){

            try {
                String line;
                int lengthOfFile;

                //Take the file from path
                BufferedReader reader = new BufferedReader(new java.io.FileReader("src/Customers.csv"));

                //Get the number of lines in the file and create the array with that size
                lengthOfFile = getLengthOfFile("src/Customers.csv");
                stringsFromFiles = new String[lengthOfFile];

                //Put each line as one String element in customers array
                for (int i = 0; i<lengthOfFile; i++) {
                    stringsFromFiles[i] = reader.readLine();
                }

            } catch (FileNotFoundException e) {
                System.out.println("An error occured (FileNotFoundException");
            } catch (IOException e) {
                System.out.println("An error occured (IOException");
            }


            return stringsFromFiles;
        }


    */

    public int getLengthOfFile(String path){
        int lenght = 0;

        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(path));

            //Pass the first element
            String lineCounter = reader.readLine();

            //If line is not empty add one to length
            while(lineCounter != null) {
                lenght++;
                lineCounter = reader.readLine(); }
            return lenght;
        } catch (FileNotFoundException e) {
            System.out.println("An error occured (FileNotFoundException");
        } catch (IOException e) {
            System.out.println("An error occured (IOException");
        }

        return 0;
    }
}
