package PacoteJava;
public class Pessoa {

    private String nome;
    private int idade;
    private String email;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa() {
        
    }
    public Pessoa(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
