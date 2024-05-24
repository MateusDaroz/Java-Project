import javax.management.InvalidAttributeValueException;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){}

    public Pessoa(String nome, int idade){
        this.nome=nome;
        if(idade<=0)
            throw new IllegalArgumentException("A idade inserida é menor ou igual a 0!");
        else
            this.idade=idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade<=0)
            throw new IllegalArgumentException("A idade inserida é menor ou igual a 0!");
        else
            this.idade=idade;
    }
}
