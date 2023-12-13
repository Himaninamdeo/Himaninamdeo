import java.io.File;
class Main{
    public static void main(String[]args){
        //create a file object for a correction 
        File file=new File("newFile.txt");
        try{
            //typing to create a file based on the object
            boolean value=file.createNewFile();
            if(value){
                System.out.println("The new file is created");
            }
            else{
                System.out.println("the file already exist");
            }
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
