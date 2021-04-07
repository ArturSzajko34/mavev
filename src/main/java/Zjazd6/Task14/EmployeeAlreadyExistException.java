package Zjazd6.Task14;

public class EmployeeAlreadyExistException extends  RuntimeException{

    private int index;


    public EmployeeAlreadyExistException (int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}

