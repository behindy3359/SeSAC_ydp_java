package javatutorial.day08.practice05;

import java.util.ArrayList;

public class Ex05 {
  public static void main(String[] args) {
    String str1 = "ABABC";
    String str2 = "BABCAC";

    System.out.println(longestCommonSubstring(str1, str2));
  }

  public static String longestCommonSubstring(String str1,String str2){

    String shortString;
    String LongString;
    if( str1.length() > str2.length() ){
      LongString = str1;
      shortString = str2;
    }else{
      LongString = str2;
      shortString = str1;
    }

    ArrayList<String> shortStringTokens = new ArrayList<>();
    ArrayList<String> LongStringTokens = new ArrayList<>();

    for(int i = 0 ; i < shortString.length()-1; i++){
      shortStringTokens.add(shortString.substring(i,i+1));
    }
    for(int i = 0 ; i < LongString.length()-1; i++){
      LongStringTokens.add(LongString.substring(i,i+1));
    }


    for( int i = 0 ; i < shortStringTokens.size() ; i ++){
      for( int j = 0 ; j < LongStringTokens.size() ; j ++){

      }
    }


    return
  }
}
