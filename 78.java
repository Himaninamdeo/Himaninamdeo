//importing FileReader class
import java.io.FileReader;
class Main{
    public static void main(String[]args){
        char[]array=new char[100];
        try{
            //create a reader using FileReader
            FileReader input=new FileReader("a.txt");
            //Reads Character
            input.read(array);
            System.out.println("Data in the file");
            System.out.println(array);
            //Classes the reader
            input.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
