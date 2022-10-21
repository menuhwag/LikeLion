package week5._221021.study.algorithm.programmers.parentheses;

import java.util.EmptyStackException;
import java.util.Stack;

public class VariousBrackets {
    public boolean solution1(String str) { // Stack를 괄호 종류별로 각각 선언... 썩 맘에들지 않음
        Stack<Character> squareBrackets = new Stack<>(); //[]
        Stack<Character> curlyBrackets = new Stack<>(); //{}
        Stack<Character> angleBrackets = new Stack<>(); //<>
        Stack<Character> parentheses = new Stack<>(); //()

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            try {
                switch (ch) {
                    case '[':
                        squareBrackets.push(ch);
                        break;
                    case ']':
                        squareBrackets.pop();
                        break;
                    case '{':
                        curlyBrackets.push(ch);
                        break;
                    case '}':
                        curlyBrackets.pop();
                        break;
                    case '<':
                        angleBrackets.push(ch);
                        break;
                    case '>':
                        angleBrackets.pop();
                        break;
                    case '(':
                        parentheses.push(ch);
                        break;
                    case ')':
                        parentheses.pop();
                        break;
                    default:
                        break;
                }
            } catch (EmptyStackException e) {
                return false;
            }
        }
        return squareBrackets.isEmpty() && curlyBrackets.isEmpty() && angleBrackets.isEmpty() && parentheses.isEmpty();
    }
}
