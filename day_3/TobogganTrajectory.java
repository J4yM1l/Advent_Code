import java.util.*;
import java.io.*;
public class TobogganTrajectory {
    public static void main(String[] args) {
        String fileName = "input.txt";
        String path = "/Users/jaymil/Documents/java_practice/advent_coding/day_3/"+fileName;
        File file = new File(path);
        int printLines = 0;
        int jumps = 3;
        int countEx = 0, countZero = 0, numOfLines = 0;
        try {
            Scanner sc = new Scanner(file);
            int strLen = sc.nextLine().length();
            System.out.println("String length: "+strLen);
            while(sc.hasNextLine()){
                numOfLines++;
                String line = sc.nextLine();
                // System.out.println("Jumps: "+jumps);
                // System.out.println(line);
                // char position = line.charAt(jumps);                
                // if(position == '.' && jumps<strLen){
                //     countZero++;
                //     System.out.println(position);
                // }else{
                //     System.out.println(position);
                //     countEx++;
                // }
                // jumps+=3;
                // printLines++;
            }
            System.out.println("Number of lines: "+numOfLines);
            // System.out.println("Ex: "+countEx);
            // System.out.println("Zero: "+countZero);
            sc.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}
