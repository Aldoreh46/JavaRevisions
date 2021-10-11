package JavaRevisions;
import java.util.*;
public class Brackets {
        
        public int solution(String S) {
            Deque<Character> stack = new ArrayDeque<Character>();
   
           for(int i = 0; i < S.length(); i++) {
               char c = S.charAt(i);
   
               switch (c) {
                   case ')':
                       if (stack.isEmpty() || stack.pop() != '(')
                           return 0;
                       break;
                   case ']':
                       if (stack.isEmpty() || stack.pop() != '[')
                           return 0;
                       break;
                   case '}':
                       if(stack.isEmpty() || stack.pop() != '{')
                           return 0;
                       break;
                   default:
                       stack.push(c);
                       break;
               }
           }
   
           return stack.isEmpty() ? 1 : 0;
       
    }
}
