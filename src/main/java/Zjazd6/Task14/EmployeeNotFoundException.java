package Zjazd6.Task14;

public class EmployeeNotFoundException extends RuntimeException {

    private int index;


    public EmployeeNotFoundException(Integer index) {
       this.index = index;

    }

    public int getIndex() {
        return index;
    }
}
