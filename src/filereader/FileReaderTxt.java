
package filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderTxt {
    public static ArrayList<TriviaSample> readTriviaSample(String path) throws FileNotFoundException{
        ArrayList<TriviaSample> triviaPart=new ArrayList<TriviaSample>();
        File file;
        Scanner inputFile;
        String triviaLine;
        String []trivia;
        
        try{
            file=new File (path);
            inputFile=new Scanner(file);
            while(inputFile.hasNext()){
                triviaLine=inputFile.nextLine();
                trivia=triviaLine.split("/n");
                triviaPart.add(new TriviaSample(trivia[0],trivia[1],trivia[2]));
            }    
            
        }
        catch (FileNotFoundException e){
            System.out.println("The file cannot be found");
        }
        return triviaPart;
    }
    
    public static void main(String[]args)throws FileNotFoundException{
        
        ArrayList<TriviaSample> triviaPart;
        
        triviaPart=readTrivia("/Users/USER/OneDrive/桌面/TriviaSample.txt");
        
        for (int i=0;i<triviaPart.size();i++){
            System.out.println(triviaPart.get(i).get);
        }
    }
    
}
