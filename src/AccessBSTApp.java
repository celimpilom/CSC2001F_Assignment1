import java.io.FileNotFoundException;

public class AccessBSTApp {
    static BinarySearchTree<String>   tree;
    public static void main(String[] args ) throws FileNotFoundException{

        ReadFile object = new ReadFile();
        object.tree();
        tree = object.getTree();
        
        if (args.length == 1){
            String studentID = args[0];
            System.out.println(printStudent(studentID) );
        } else {
            printAll();
        }
          
           
    }
    static String printStudent(String studentID){
        
               if (tree.find(studentID) != null){
                   String[] b = i.split(" ");
                   return b[1] + " " + b[2];
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