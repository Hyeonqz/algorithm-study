package bj_2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_24265 {

   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      long cnt = 0;
      
      long n = Integer.parseInt(br.readLine());
      
      for(int i=1;i<=n-1;i++) {
         cnt+=i;
      }
      System.out.println(cnt);
      System.out.println(2);
   }

}