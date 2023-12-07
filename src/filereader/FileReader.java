
package filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File("/Users/USER/OneDrive/桌面/TriviaSample.txt");
        Scanner scan=new Scanner(file);
        
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        
     scan.close();
        
    }
    
}
