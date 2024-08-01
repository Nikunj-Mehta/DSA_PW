package Stack;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(10);
        st.push(30);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st);
        st.push(10);
        st.push(30);
        // To access first inserted ele in stack
        while(st.size() > 1)
        {
            st.pop();
        }
        // size has become 1
        System.out.println(st.peek()); // This will print topmost ele that is first entered ele now

        System.out.println(st.isEmpty());

        st.push(2);
        st.push(10);
        st.push(30);
        System.out.println(st);

        // Reverse a stack
        Stack<Integer> st_reversed = new Stack<>();
        while(!st.isEmpty()) // Jb tk original stack empty nhi ho
        {
            st_reversed.push(st.pop()); // st.pop() ele pop krega aur value return krega to vo return kri huye value st_reversed m push ho jyeagi
        }
        System.out.println(st_reversed);

        st.push(1);
        st.push(5);
        st.push(10);
        st.push(54);
        System.out.println(st);

        // One more method to print stack in reverse order
        while(!st.isEmpty())
        {
            System.out.print(st.pop() + " ");
        }
        System.out.println();

        st.push(1);
        st.push(5);
        st.push(10);
        st.push(54);
        System.out.println(st);

        // how to copy elements in same order form original stack(not reversed)
        // first copy into temporary stack (in reverse)
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty())
        {
            temp.push(st.pop());
        }
        System.out.println(temp); // Ele printed in reverse order
        // now copy the elements in final stack again reverse so we will get same as original order in final stack
        Stack<Integer> final_stack = new Stack<>();
        while(!temp.isEmpty())
        {
            final_stack.push(temp.pop());
        }
        System.out.println(final_stack); // In this stack we will get elements in same order as that of original stack

        // to add element at first
        // First push all the elements of original stack in temp
        Stack<Integer> temp_stack = new Stack<>();
        while(final_stack.size() > 0) // We can use this also
        {
            temp_stack.push(final_stack.pop());
        }
        // Now our original stack i.e. final stack is empty
        final_stack.push(100);
        // Now again push elements of temp in original stack
        while(!temp_stack.isEmpty())
        {
            final_stack.push(temp_stack.pop());
        }
        System.out.println(final_stack);

        // Push element at any index;
        int index = 3;
        int new_ele = 70;
        while(final_stack.size() >= index) // Jb tk size us index se bdi hai ya uske equal hai tb tk ele pop kro
        {
            temp_stack.push(final_stack.pop());
        }
        final_stack.push(new_ele);
        // Now from temp again push elements back in original stack
        while(temp_stack.size() > 0)
        {
            final_stack.push(temp_stack.pop());
        }
        System.out.println(final_stack);
    }
}
