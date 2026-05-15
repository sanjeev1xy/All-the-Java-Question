	/*Valid Parentheses
	Given a string s containing just the characters '(', ')',
	 '{', '}', '[' and ']', determine if the input string is
	  valid.

	An input string is valid if:
	1. Open brackets must be closed by the same type of brackets.
	2. Open brackets must be closed in the correct order.
	 
	Example 1:
	Input: s = "()"
	Output: true
	Example 2:
	Input: s = "()[]{}"
	Output: true
	Example 3:
	Input: s = "(]"
	Output: false
	Example 4:
	Input: s = "([)]"
	Output: false
	Example 5:
	Input: s = "{[]}"
	Output: true
*/
	
package Danger0;

import java.util.Stack;

public class Bracket_Right_Wrong 
{
    // Method to check valid parentheses
    public static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            // Handle closing brackets
            else 
            {
                if (stack.isEmpty()) 
                {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) 
    {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([)]"));     // false
        System.out.println(isValid("{[]}"));     // true
    }
}


