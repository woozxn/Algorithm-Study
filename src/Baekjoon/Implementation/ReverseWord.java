//17413 단어 뒤집기2
package Baekjoon.Implementation;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean tag = false;

        Stack<Character> stk = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(c == '<') {
                tag = true;
                while(!stk.empty()) {
                    System.out.print(stk.pop());
                }
                System.out.print('<');
            } else if(c == '>') {
                tag = false;
                System.out.print('>');
            } else if(tag == true) {
                System.out.print(c);
            } else if(c == ' ') {
                while(!stk.empty()) {
                    System.out.print(stk.pop());
                }
                System.out.print(' ');
            } else {
                stk.push(c);
            }
        }
        while(!stk.empty()) {
            System.out.print(stk.pop());
        }
    }

}
