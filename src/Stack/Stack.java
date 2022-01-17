package Stack;

public class Stack {
    private int []array;
    private int index;
  public   Stack(){
         array = new int[10];
        index  = -1;

    }
     Stack(int lenght){
        array = new int [lenght];
        index = -1;
    }
  public   void push(int item){
        if (index == array.length-1){
            System.err.println("Stack is full");
        }
        else{
            array[++index] = item;
        }
    }
 public    int pop(){
        if (index < 0){
            System.err.println("Stack is empty");
            return 0;
        }else{
            return array[index--];
        }
    }
    public  boolean isEmpty(){
      return index == -1;
    }
}
