package javatutorial.day03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ALTutorial();
    }

    public static void ALTutorial(){
        ArrayList<String> textList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("텍스트를 입력해주세요 : ");
            String tempText = sc.nextLine();
            if(tempText.equals("exit")){
                break;
            }
            textList.add(tempText);
        }

        for(String i: textList){
            System.out.println(i);
        }

        sc.close();
    }
}
