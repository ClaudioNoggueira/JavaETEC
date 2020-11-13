//SILVIO MEIRA
/*SCRUM, XP metodologia de desenvolvimento agil

*/

package PacoteJava;

public class VPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa("Claudio");
        Pessoa pessoa2 = new Pessoa(19);
        Pessoa pessoa3 = new Pessoa('M');
        
        
        System.out.println("Seu nome é: "+pessoa1.getNome() +" \nSua idade eh: "+ pessoa2.getIdade());
    
    }
}
