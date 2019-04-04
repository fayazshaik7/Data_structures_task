
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Queue_using_two_stacks {

    public static Stack<Integer> oldValues = new Stack<Integer>();
    public static Stack<Integer> newValues = new Stack<Integer>();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numQueries = in.nextInt();
        
        for (int i = 0; i < numQueries; i++) {
            switch(in.nextInt()) {
                case 1:
                    enqueue(in.nextInt());
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    print();
                    break;
            }
        }
    }
    
    public static void enqueue(int value) {
        newValues.push(value);
    }
    
    public static void dequeue() {
        if (oldValues.isEmpty())
            swapElements();
        oldValues.pop();
    }
    
    public static void swapElements() {
        while (!newValues.isEmpty()) {
            oldValues.push(newValues.pop());
        }
    }
    
    public static void print() {
        if (oldValues.isEmpty())
            swapElements();
        System.out.println(oldValues.peek());
    }
}