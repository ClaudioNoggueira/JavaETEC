package PacoteJava;

public class Usuario {

    private String Nome;
    private String email;
    private String login;
    private String senha;

    public Usuario() {
        this("", "", "", "");
    }

    public Usuario(String Nome, String email, String login, String senha) {
        this.Nome = Nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
