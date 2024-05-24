public class EmailInvalidoException extends RuntimeException{

    @Override
    public String getMessage(){
        return "O Email inserido não é válido!";
    }
}
