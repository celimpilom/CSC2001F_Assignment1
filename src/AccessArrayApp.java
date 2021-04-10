import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.Scanner;  // Import the Scanner class


public class AccessArrayApp{
    static String[]   array;
    static int opCount;
    public static void main(String[] args ) throws FileNotFoundException{

        ReadFile obj = new ReadFile();
        obj.array();
        array =  (obj.getArray());
        opCount = 0;
        
        if (args.length == 1){
            String studentID = args[0];
            System.out.println(printStudent(studentID) );
            System.out.println(opCount);
        } else {
            printAll();
        }
          
           
    }
    static String printStudent(String studentID){
        for (String i: array){
            opCount ++;
               if (i.contains(studentID)){
                   String[] b = i.split(" ");
                   return b[1] + " " + b[2];
                   

               }
           }
        return "Access denied!";
        }
       
    static void printAll(){
        for (String i: array){
            String [] b = i.split(" ");
            System.out.println(b[0] +" " + b[1] + " " + b[2]);
        }
        
    }
     
}
