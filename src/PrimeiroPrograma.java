package src;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Livro livro = new Livro("Jogador Nº 1 ", 351);
        System.out.println(livro);
    }
}

class Livro{
    private String nome;
    private Integer numPaginas;

    Livro (String nome, Integer numPaginas){
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
