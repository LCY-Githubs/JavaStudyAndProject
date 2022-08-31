package serial946;

import org.junit.Test;

import java.util.Stack;

public class Main {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        //先根据pushed入栈
        //每入一个检测是否和poped的当前指针的值相同，若相同，则
        Stack<Integer> stack = new Stack<>();
        int right = 0;
        //结束条件
        for (int i : pushed) {
            if (i!=popped[right]){
                //入栈
                stack.push(i);
            }else {
                //判断栈顶和pushed是否相同
                stack.push(i);
                while (!stack.isEmpty()&&stack.peek()==popped[right]){
                    stack.pop();
                    right++;
                }
            }
        }
        return stack.isEmpty();
    }

    @Test
    public void Test(){
        System.out.println(validateStackSequences(new int[]{2, 1, 0}, new int[]{1, 2, 0}));
    }
}
