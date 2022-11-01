package dio.myfirstwebapi.handler;

public class RequiredFieldException extends BusinessException{
    public RequiredFieldException(String field) {
        super("Field %s is Required", field);
    }
}
