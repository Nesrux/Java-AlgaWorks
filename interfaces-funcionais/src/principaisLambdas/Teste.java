package principaisLambdas;

public class Teste {
    private String nome;
    private String email;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return getNome() + " tem o Email " + getEmail() + " e tem " + getIdade() + " anos de vida";
    }
}
