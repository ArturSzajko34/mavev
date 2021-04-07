package Zjazd6.Task14;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ControllerErrorHandler {

    @ExceptionHandler
    public String employeeNotFoundError (EmployeeNotFoundException exception , Model model) {
        model.addAttribute("id",exception.getIndex());
        return "EmployeeError";

    }

    @ExceptionHandler
    public String employeeAlreadyExistError (EmployeeAlreadyExistException exception , Model model) {
        model.addAttribute("id",exception.getIndex());
        return "EmployeeErrorExist";

    }


}
