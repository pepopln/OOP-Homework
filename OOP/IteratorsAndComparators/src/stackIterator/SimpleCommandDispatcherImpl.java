package stackIterator;

import stackIterator.interfaces.MyStack;
import stackIterator.models.LinkedStack;

import java.util.List;

public class SimpleCommandDispatcherImpl {

    private MyStack<Integer> linkedStack;
    public SimpleCommandDispatcherImpl(){
        this.linkedStack=new LinkedStack<>();
    }
    public void dispatch(String command, List<Integer> toPush){
        switch (command){
            case "Push":
                toPush.forEach(e-> this.linkedStack.push(e));
                break;
            case "Pop":
                try {
                this.linkedStack.pop();
                }catch (IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                }
                break;
            case "END":
                for (Integer integer : linkedStack) {
                    System.out.println(integer);
                }
                while (!this.linkedStack.isEmpty()){
                    System.out.println(this.linkedStack.peek());
                    this.linkedStack.pop();
                }
                break;
        }
    }
}
