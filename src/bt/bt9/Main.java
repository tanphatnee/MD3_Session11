package bt.bt9;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập số đi:");
        Integer number =new Scanner(System.in).nextInt();
        String str = number.toString();
        String strReverse = "";
        Stack<Character> listChar = new Stack<Character>();
        for (int i = 0; i < str.length(); i++){
            listChar.push(str.charAt(i));
        }
        while (!listChar.empty()){
            strReverse += listChar.pop();
        }
        int numberReverse = Integer.parseInt(strReverse);
        System.out.println(numberReverse);


    }
}
