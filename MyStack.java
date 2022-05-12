
public class MyStack {

    Card stack[];
    public static int top;
    public int length;

    //Constructor to initialize the stack
    public MyStack (int size){
        this.stack = new Card[52];
        top = -1;
        length = 0;
    }

        // Pushing element on the top of the stack
        public void stack_push(Card arr[], Card val, int pos){

            if (top + 1 == 52)
                System.out.print("Stack is full");

            else arr[pos] = val;
        }
        
        // Popping element from the top of the stack
        public void stack_pop(){

            if (top == -1)
                System.out.print("Stack is empty");

            else top--;
            
        }
        // Displaying element on the top of the stack
        public Card stack_peek(){

            if (top == -1) return null;
            else return stack[top];
        }

        public Card isEmpty(){
            if (top == -1) return null;
            else return stack[top];
        }

}
