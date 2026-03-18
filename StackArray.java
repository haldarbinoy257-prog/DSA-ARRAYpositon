class Stack {
    int max = 5;
    int top = -1;
    int[] stack = new int[max];

    void push(int data) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = data;
            System.out.println(data + " pushed");
        }
    }
  
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped");
        }
    }
}
public class StackArray {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
    }
}