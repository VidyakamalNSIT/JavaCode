package iplmatches;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




public class IplMatches{
    
    public static void main(String[] args) {
        HashMap<Integer,String> data1 = new HashMap<>();
        List<List<String>> list = new ArrayList<List<String>>();
        String file = "C:\\Users\\micro computer\\Desktop\\deliveries.csv";
        String line = "";
        String splitBy = ",";
        int n=10;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            line = br.readLine();
            String[] headers = line.split(splitBy);
            for(String header: headers) {
                List<String> subList = new ArrayList<String>();
                subList.add(header);
                list.add(subList);
            }//String Header = (line = br.readLine());
            while ((line = br.readLine()) != null) {
                String[] elems = line.split(splitBy);
                for(int i = 0; i < elems.length; i++) {
                    list.get(i).add(elems[i]);
                }
            } 
            int rows = list.size();
            int cols = list.get(0).size();
            String[][] array2D = new String[rows][cols];
            for(int row = 0; row < rows; row++) {
                for(int col = 0; col < cols; col++) {
                    array2D[row][col] = list.get(row).get(col);
                }
            }
            for(int row = 0; row < rows; row++) {
                for(int col = 0; col < cols; col++) {
                    System.out.print(" "+array2D[row][col]);
                }
                System.out.println();
            }
            
//            for(int i=1; i<10;i++){
//                for(int j=0;j<4;j++)
//                System.out.print(data[i][3]);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
