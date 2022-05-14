// Name: Orlando Medina Rodríguez
// Student #: 801-17-7833
// CCOM4029-002
// Prof. Patricia Ordonez

// file name: MyStack.java

/*  The purpose of MyStack is to create a stack using primitive data types,
    in my case we are using arrays, to travel the deck of cards a player 
    has in order to make the game of Rummy to flow better. This file contains 
    methods for removing, adding and viewing elements in the players hand 
*/

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

        // This method will push elements on top of the stack
        public void stack_push(Card arr[], Card val, int pos){

            if (top + 1 == 52)
                System.out.print("Stack is full");

            else arr[pos] = val;
        }
        
        // This method will remove elements on top of the stack
        public void stack_pop(){

            if (top == -1)
                System.out.print("Stack is empty");

            else top--;
            
        }

        // This will show the all the elements in the stack
        public Card stack_peek(){

            if (top == -1) return null;
            else return stack[top];
        }

        public Card isEmpty(){
            if (top == -1) return null;
            else return stack[top];
        }

}
