package Library;

import java.util.InputMismatchException;

public class Validator {

    public void inputValidateByYear(int number) {
        if (number < 1445 || number > 2019) {
            throw new InputMismatchException();
        }
    }
}
