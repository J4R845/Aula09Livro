
package prolivro;

public class ProLivro {

    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro ("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro ("Poo para Iniciantes", "Jps Delarue", 100, p[1]);
        l[2] = new Livro ("Java Avançado", "Gustavo Guanabara", 800, p[0]);
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}
