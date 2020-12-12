import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class ReportRepair{

    public static void main(String[] args) throws Exception  {
        String fileName  = "input.txt";
        String filePath = "/Users/jaymil/Documents/java_practice/advent_coding/day_1/"+fileName;
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        ArrayList<Integer> years = new ArrayList<>();
        boolean found = false;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            int year = Integer.parseInt(line);
            years.add(year);                                   
            // System.out.println(difference);
        }
        //1 2 3 4 6
        //1 2 3, 1 2 4, 1 2 6
        // 2 3 4
        System.out.println("--------- Day 1: Report Repair ------------- ");
        System.out.println();
        System.out.println("----------------- Part 1 ------------------- ");
        for(int i=0; i<years.size(); i++){
            int entryOne = 2020 - years.get(i); //finding two entries
            
                if(years.contains(entryOne)){                    
                    int productResult = entryOne*years.get(i);                    
                    System.out.println("Sum of two entries to 2020: "+entryOne+" + "+years.get(i)+" == "+(entryOne+years.get(i)));
                    System.out.println("The product of the two entries are: "+productResult);
                    break;
                }
                // System.out.println("Entries "+threeEntries);                  
        }

        //A +  B + C = 2020, A+B = 2020 - C, 
         //1 5 3 4 6 Tar = 8
         //8 3 4 6
         //Targ = 10
         // 
         //8 - 1 = 7, 7 - 5 = 2;  2 + 2 + 1 = 5
         System.out.println("----------------- Part Two ------------------- ");
        for (int i = 0; i < years.size(); i++) {
            int entryOne = 2020 - years.get(i);            
            for (int entryTwo = i+1; entryTwo<years.size(); entryTwo++) {                
                int entryThree = Math.abs(years.get(entryTwo) - entryOne);
                int threeEntries = years.get(i)+years.get(entryTwo)+entryThree;               
                if((threeEntries == 2020) && years.contains(entryThree)){
                    found = true;
                    int productResult = years.get(i)*years.get(entryTwo)*entryThree;
                    System.out.println("Sum of three entries to 2020: "+years.get(i)+" + "+years.get(entryTwo)+" + "+entryThree+" == "+threeEntries);
                    System.out.println("The product of the three entries are: "+productResult);
                    break;
                }
            }
            if(found)
            break;   
        }

    }
}