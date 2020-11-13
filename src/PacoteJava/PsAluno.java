package PacoteJava;

public class PsAluno extends Pessoa{
    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void definirCuso(String curso){
        this.curso=curso;
    }
    public String retornarCurso(){
        return curso;
    }
}
