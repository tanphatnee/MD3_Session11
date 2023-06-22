package th.th1;

public class GennericStackClient {
    static void stackOfIsString(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack: " + stack.size());
        System.out.println("1.2 Pop elements from stack ");
        while (!stack.isEmpty()){
            System.out.printf("%s" , stack.pop());
        }
        System.out.println("\n 1.3 Size of stack: " + stack.size());
    }

    static void stackOfInteger(){
        MyGenericStack<Integer> stack =   new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1.1 Size of stack: " + stack.size());
        System.out.println("1.2 Pop elements from stack ");
        while (!stack.isEmpty()){
            System.out.printf("%s" , stack.pop());
        }
        System.out.println("\n 1.3 Size of stack: " + stack.size());

    }
}
