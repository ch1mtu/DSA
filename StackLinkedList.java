class Node<T>
{
    T value;
    Node<T> next;
    Node(T data){
        this.value=data;
        this.next=null;

    }
}
class Stack<T>{
    Node<T> top;
    Stack()
    {
        this.top=null;
    }
    void push(T data)
    {
        Node<T> newNode=new Node<>(data);
        newNode.next=top;
        top=newNode;
    }
    T pop()
    {
        T value=top.value;
        top=top.next;
        return value;
    }
    T peek()
    {
        return top.value;
    }
    int size()
    {
        int size=0;
        Node<T> curr=top;
        while(curr!=null)
        {
            size++;
            curr=curr.next;
        }
        return size;
    }
    void print()
    {
        Node<T> curr=top;
        if(curr==null)
        {
            System.out.println("Stack is Empty;");
        }
        while(curr!=null)
        {
            System.out.println(curr.value);
            curr=curr.next;
        }
    }

}
public class StackLinkedList {
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Print the stack
        stack.print();  // Output: Stack: 30 20 10

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());  // Output: Top element: 30

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());  // Output: Popped element: 30
        System.out.println("Popped element: " + stack.pop());  // Output: Popped element: 20

        // Print the stack after popping
        stack.print();  // Output: Stack: 10

        // Print the size of the stack
        System.out.println("Stack size: " + stack.size()); 
    }
}
