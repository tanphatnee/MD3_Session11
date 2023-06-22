package bt.bt2;

import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        System.out.println("Nhap chuoi:");
        String str = new Scanner(System.in).nextLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']'){
                System.out.println("khong co cap ngoac");
                return;
            }
            char openBacket = stack.pop();
            if(!isMatchingBacket(openBacket,c)){
                System.out.println("khong co cap ngoac");
                return;
            }

        }

        boolean check = stack.isEmpty();
        if(check){
            System.out.println("co cap ngoac hop le");
        }else {
            System.out.println(" khong co cap ngoac");
        }


    }

    private static boolean isMatchingBacket(char open,char close) {
        return (open == '(' && close == ')')||
                (open == '{' && close == '}')||
                (open == '[' && close == ']')
                ;
    }
}
