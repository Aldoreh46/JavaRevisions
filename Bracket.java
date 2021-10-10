// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Bracket {
    public int solution(String S) {
        
        Deque<Character> stack = new ArrayDeque<Character>();

        for(int x=0; x < S.length(); x++){
            char c = S.charAt(x);

            switch(c){
                case  ')':
                if (stack.isEmpty() || stack.pop() != '(')
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
