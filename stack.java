import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.push("bottom");
        printStack(st);
        st.push("second");
        printStack(st);
        st.push("third");
        printStack(st);

        st.pop();
        printStack(st);
        st.pop();
        printStack(st);
        st.pop();
        printStack(st);
    }

    private static void printStack(Stack<String> g) {
        if (g.isEmpty()) {
            System.out.println("The Stack is empty in this and you have to insert some numbers to display");
        }
        else
        {
            System.out.printf("%s TOP",  g);
        }
        System.out.println();
    }
}
