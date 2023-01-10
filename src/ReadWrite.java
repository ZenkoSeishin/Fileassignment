import java.io.*;

public class ReadWrite {


    String WriteLine;
    String CreateLine;

    public ReadWrite(){

    }
    public void ReadFile(){
        try {
            BufferedReader Read = new BufferedReader(new FileReader("C:\\temp\\Hej\\Lmao.txt"));
           String line;
            while ((line = Read.readLine()) != null) {
                System.out.println(line);
            }
            Read.close();
        } catch (Exception ex) {
            return;
        }
    }

    public void WriteFile(){
        try {
            FileWriter myWriter = new  FileWriter("myFile.txt");
            myWriter.write("This text  should be in my file");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Could not write to file");
                    e.printStackTrace();
        }
    }
    }



