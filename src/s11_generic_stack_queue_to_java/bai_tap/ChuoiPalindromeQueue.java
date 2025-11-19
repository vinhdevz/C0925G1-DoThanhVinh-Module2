package s11_generic_stack_queue_to_java.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ChuoiPalindromeQueue {
    public static void main(String[] args) {
        String input = "Able was I ere I saw Ebla";
        String str = input.replaceAll("[^a-zA-Z]", "");
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(input + " là chuỗi Palindrome.");
        } else {
            System.out.println(input + " không phải là chuỗi Palindrome.");
        }
    }
}
