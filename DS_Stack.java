public class DS_Stack {
    int arr[];
    int top;
    int size;

    DS_Stack(){
        arr = new int[5];
        top = -1;
        size = arr.length;
    }

    public void push(int data){
        if (top<size) {   
            top++;
            arr[top] = data;
        } else{
            System.out.println("Stack overflow");
        }
    }

    public void printStack(){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public int pop(){
        if (top>0) {
            return arr[top--];
        } else{
            System.out.println("Stack underflow");
        }
        return 0;
    }

    public int peek(){
        return arr[top];
    }
    public static void main(String[] args) {

        DS_Stack s = new DS_Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(" Deleted Element: " +s.pop());
        s.push(40);
        System.out.println("Last Element: "+s.peek());
        s.printStack();
    
      }
}
