public class Aluno {

    private static int sequence = 0;
    private int ID;
    private int nivelpoder;
    private String nome;
    private String poder;
    private String categoria;

    //Construtor
    public Aluno(String nome, String categoria, String poder, int nivelpoder){
        this.ID = sequence++;
        this.nivelpoder = nivelpoder;
        this.nome = nome;
        this.poder = poder;
        this.categoria = categoria;
    }

    //Gets
    public int getNivel(){
        return nivelpoder;
    }
    public String getNome(){
        return nome;
    }
    public String getPoder(){
        return poder;
    }
    public String getCategoria(){
        return categoria;
    }
    public int getID(){
        return ID;
    }
    public void getInfo(){
        System.out.println("ID: " + ID);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Poder: " + poder);
        System.out.println("Nível de poder: " + nivelpoder);
    }

    //Sets
    public void setNivel(int nivelpoder){
        this.nivelpoder = nivelpoder;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPoder(String poder){
        this.poder = poder;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
}