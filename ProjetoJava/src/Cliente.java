public class Cliente extends Pessoa implements IPessoa{

    private String email;
    private int telefone;
    private String cpf;

    public Cliente(String nome, int idade, String email, String cpf, int telefone){
        super(nome, idade);
        if(!email.contains("@")&&!email.contains(".com"))
            throw new EmailInvalidoException();
        else
            this.email=email;
        if(cpf.length()!=11)
            throw new CpfInvalidoException();
        else
            this.cpf=cpf;
        this.telefone=telefone;
    }

    public Cliente() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@")&&!email.contains(".com"))
            throw new EmailInvalidoException();
        else
            this.email=email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length()!=11)
            throw new CpfInvalidoException();
        else
            this.cpf=cpf;
    }

    @Override
    public String exibirDados(){
        return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nEmail: "+email+"\nCPF: "+cpf+"\nTelefone: "+telefone;
    }
}
