package Pr01ListyIterator;


import java.util.ArrayList;
import java.util.List;

public class CommandDispatcherImpl<E> {
    private Core core;


    public void setCore(Core core){
        this.core=core;
    }

    public void dispatch(String command, List<?extends String> params) {

        switch (command){
            case "Create":
                this.executeCreate(params);
                break;
            case "Move":
                this.executeMove();
                break;
            case "HasNext":
                this.executeHasNext();
                break;
            case "Print":
                try {
                this.executePrint();
                }catch (IllegalStateException ex){
                    System.out.println(ex.getMessage());
                }
                break;
            case "PrintAll":
                this.executePrintAll();
                break;
            case "END":
                this.executeEnd();
                break;
        }
    }

    private void executePrintAll() {
        this.core.getIterator().printAll();
    }

    private void executeEnd() {
        this.core.endInput();
    }

    private void executePrint() {
        if (this.core.getIterator().getSize()==0){
            throw new IllegalStateException("Invalid Operation!");
        }
        this.core.getIterator().print();
    }

    private void executeHasNext() {
        System.out.println(this.core.getIterator().listyHasNext());;
    }

    private void executeMove() {
        System.out.println(this.core.getIterator().move());
    }

    private void executeCreate(List<? extends String> params) {
        List<String> elements = new ArrayList<>(params);
        this.core.setIterator(elements);
    }

}
