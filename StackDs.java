import java.util.EmptyStackException;
class Stack<T>{
    int maxsize;
    T[] stackArray;
    int top;
    @SuppressWarnings("unchecked")
    public Stack(int size)
    {
        this.maxsize=size;
        this.stackArray=(T[]) new Object[maxsize];
        this.top=-1;
    }
    void push(T value)
    {
        if(top==maxsize)
            System.out.println("Stack is full");
        else
           stackArray[++top]=value;
    }
    T pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        return stackArray[top--];
    }
    T peek()
    {
        if(top==-1)
            System.out.println("Stack is empty");
        
        return stackArray[top];
    }
    void print()
    {
        if(top==-1)
           System.out.println("Stack is empty");
        else{
            for(int i=0;i<=top;i++)
            {
                System.out.println(stackArray[i]);
            }
        }
    }


}
public class StackDs{
    public static void main(String[] args)
    {
        Stack<String> st=new Stack<>(5);
        st.push("Chimti");
        st.push("Chiku");
        st.push("Chitti");
        st.push("Kutti");
        st.print();
        System.out.println(st.peek());
        st.print();
        st.pop();
        st.print();
    }
}
