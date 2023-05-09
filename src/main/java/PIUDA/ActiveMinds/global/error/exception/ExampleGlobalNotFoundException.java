package PIUDA.ActiveMinds.global.error.exception;


import PIUDA.ActiveMinds.global.error.BaseErrorException;
import PIUDA.ActiveMinds.global.error.GlobalErrorCode;

public class ExampleGlobalNotFoundException extends BaseErrorException {

    public static final BaseErrorException EXCEPTION = new ExampleGlobalNotFoundException();

    private ExampleGlobalNotFoundException() {
        super(GlobalErrorCode.EXAMPLE_GLOBAL_NOT_FOUND);
    }
}
