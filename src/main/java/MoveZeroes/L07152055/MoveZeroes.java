
package com.zte;


import java.util.Scanner;
import java.util.Stack;

public class MoveZeroes {
    public static void movezeroes() {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.next();
        String[] num = nums.substring(1,nums.length()-1).split(",");
        StringBuffer result = new StringBuffer();
        result.append("[");
        for(int i = 0; i < num.length; i++) {
            if(!num[i].equals("0")) {
                result.append(num[i] + ",");
            } else {
                stack.push(num[i]);
            }
        }
        while(!stack.empty()) {
            result.append(stack.peek() + ",");
            stack.pop();
        }

        result.replace(result.length()-1, result.length(), "]");

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        movezeroes();
    }
}
