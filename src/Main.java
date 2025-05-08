public class Main {
    public static void main(String[]args){

        Stack stack = new StackArray();

        stack.push("String");
        stack.push(12);
        stack.peek();
        System.out.println("Pop = "+stack.pop());
        stack.peek();
        System.out.println("Pop = "+stack.pop());
        stack.peek();
        System.out.println("Pop = "+stack.pop());
        System.out.println(stack.isEmpty());



        StackLinkedList stack2 = new StackLinkedList();

        stack2.peek();
        stack2.push(5);
        stack2.push("It is a string");
        stack2.peek();
        System.out.println(stack2.top.getItem());
        System.out.println(stack2.top.getNext());
    }
}
