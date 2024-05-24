public class CpfInvalidoException extends RuntimeException{

    @Override
    public String getMessage(){
        return "O CPF inserido é inválido!";
    }
}
