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
}