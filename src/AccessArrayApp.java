import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Scanner;  // Import the Scanner class


public class AccessArrayApp{
    static String[]   array;
    public static void main(String[] args ) throws FileNotFoundException{

        ReadFile obj = new ReadFile();
        obj.array();
        array =  (obj.getArray());
        
        if (args.length == 1){
            String studentID = args[0];
            System.out.println(printStudent(studentID) );
        } else {
            printAll();
        }
          
           
    }
    static String printStudent(String studentID){
        for (String i: array){
               if (i.contains(studentID)){
                   String[] b = i.split(" ");
                   return b[1] + " " + b[2];
               }
           }
        return "Not found!";
        }
       
    static void printAll(){
        for (String i: array){
            String [] b = i.split(" ");
            System.out.println(b[0] +" " + b[1] + " " + b[2]);
        }
        
    }
     
}
