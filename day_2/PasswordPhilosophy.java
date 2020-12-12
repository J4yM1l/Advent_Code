import java.io.*;
import java.util.*;

public class PasswordPhilosophy {

    public static void main(String[] args) {

        String fileName = "input.txt";
        String path = "/Users/jaymil/Documents/java_practice/advent_coding/day_2/" + fileName;
        File file = new File(path);
        int printLines = 0;
        int count = 0, check = 0;
        //StringBuilder policyPass = new StringBuilder();
        System.out.println("--------- Day 2: Password Philosophy ------------- ");
        System.out.println("----------------- Part One ------------------- ");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                // System.out.println(line);
                String [] words = line.split("[: -]+");
                int strt = Integer.parseInt(words[0]);
                int end = Integer.parseInt(words[1]);
                String c = words[2];
                String str = words[3];
                // System.out.println("strt-> "+strt+" end-> "+end+" char-> "+c+" pass-> "+str.length());
                String [] pass = str.split("[^"+c+"]");
                String policyPass = "";                
                for(String s: pass){
                    policyPass += s;                                                             
                }

                if(policyPass.length()>=strt && policyPass.length()<=end){
                    count++;                   
                }
                
                // System.out.println("String len: "+str.length());
                int strLen = str.length();
                if((end-1)<strLen){
                    if((str.charAt(strt-1) == c.charAt(0)) && (str.charAt(end-1) == c.charAt(0))){
                        // System.out.println("1-strt value "+ str.charAt(strt-1));
                        // System.out.println("1-end value "+ str.charAt(end-1));
                        // System.out.println("1-Char value "+ c.charAt(0));
                        continue;
                    }else if((str.charAt(strt-1) == c.charAt(0)) || (str.charAt(end-1) == c.charAt(0))){
                        check++;
                        // System.out.println("2-strt value "+ str.charAt(strt-1));
                        // System.out.println("2-end value "+ str.charAt(end-1));
                        // System.out.println("2-Char value "+ c.charAt(0));
                    }else{
                        // System.out.println("3-str value "+ str.charAt(strt-1));
                        // System.out.println("3-end value "+ str.charAt(end-1));
                        // System.out.println("3-Char value "+ c.charAt(0));
                        continue;
                    }                  
                }
                // printLines++;
            }

                System.out.println("Correct passwords found: "+count);
                System.out.println("----------------- Part Two ------------------- ");
                System.out.println("Correct passwords found: "+check);           
                sc.close();
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
                        
    }
}