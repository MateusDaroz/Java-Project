public class Funcionario extends Pessoa implements IPessoa{

    private String cpf;
    private static int increment=1;
    private int idFunc;
    private double salario;

    public Funcionario(){
        super();
    }

    public Funcionario(String nome, int idade, String cpf, double salario) {
        super(nome, idade);
        if(cpf.length()!=11)
            throw new CpfInvalidoException();
        else
            this.cpf=cpf;
        this.salario = salario;
        idFunc = increment;
        increment++;
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

    public static int getIncrement() {
        return increment;
    }

    public static void setIncrement(int increment) {
        Funcionario.increment = increment;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String exibirDados(){
        return "Nome: "+getNome()+"\nIdade: "+getIdade()+"\nCPF: "+cpf+"\nID Funcionário: "+idFunc+"\nSalário: "+salario;
    }
}
