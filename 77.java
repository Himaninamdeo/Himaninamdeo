//importing FileWriter class
import java.io.FileWriter;
class Main{
    public static void main(String[]args){
        String data="This is the data in the output file";
        try{
            //create a Writer using FileWriter
            FileWriter output=new FileWriter("a.txt");
            //Writes string to the file
            output.write(data);
            System.out.println("Data is written to the file");
            //Classes the Writes
            output.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
