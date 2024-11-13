import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    //lista de alunos
    private static List<Aluno> catalogo = new ArrayList<Aluno>();
    private static Aluno raiz = null;

    //menu
    public static void menu(){
        try (Scanner input = new Scanner(System.in)) {
            int opção = 0;
            
            while(opção!= 7){
                
                System.out.println("_MENU_____________________________________");
                System.out.println("|1.Infos                                 |");
                System.out.println("|2.Matricular alunos                     |");
                System.out.println("|3.Matricular alunos manualmente         |");
                System.out.println("|4.Remover alunos do sistema             |");
                System.out.println("|5.Mostrar catálogo de alunos            |");
                System.out.println("|6.Buscar aluno                          |");
                System.out.println("|7.Sair                                  |");
                System.out.println("|________________________________________|");
                System.out.print("Escolha uma opção: ");
                opção = input.nextInt();
                System.out.println("");
                
                switch(opção){
                    case 1: // Informações do sistema
                        System.out.println("INFORMAÇÕES DO SISTEMA");
                        System.out.println("");
                        System.out.println("Sumário");
                        System.out.println("-------");
                        System.out.println("Poderes e Personagens...................1");
                        System.out.println("Tabela de personagens iniciais..........2");
                        System.out.println("");
                        
                        System.out.println("1.....................................................................................................");
                        System.out.println("");
                        System.out.println("Categorias de poder: ar, fogo, agua, terra, potencia.");
                        System.out.println("A categoria \"Potência\" refere-se a habilidades que envolvem o potencial físico e a força do corpo humano, sem uma relação direta com elementos da natureza como fogo, água, terra ou ar.");
                        System.out.println("");
                        System.out.println("ID: os números de identificação são sequenciais e gerados automaticamente pelo sistema. Não há alteração do ID caso o catálogo seja alterado.");
                        System.out.println("");
                        System.out.println("Nível do poder: varia de 1 a 100");
                        System.out.println("");
                        System.out.println("Personagens: Os personagens são baseados nos atletas das Paralimpíadas de 2024. Em forma de homenagem fica aqui registrado a primeira lista de alunos do sistema.");
                        System.out.println("");
                        System.out.println("");
                        
                        System.out.println("2.....................................................................................................");
                        System.out.println("");
                        // Imprimindo os dados dos atletas paralímpicos em forma de tabela
                        System.out.printf("%-30s %-30s %-25s %-15s%n", "Nome", "Poder", "Categoria", "Nível do Poder");
                        System.out.println("------------------------------ ------------------------------ ------------------------- --------------");
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Ana Silva", "Controle de Temperatura", "Fogo", 90);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Pedro Santos", "Visão Aguçada", "Potência", 85);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Maria Oliveira", "Levitação", "Ar", 88);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "João Gomes", "Controle Mental", "Potência", 92);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Camila Pereira", "Fusão com a Água", "Água", 87);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Rafael Costa", "Propulsão de Fogo", "Fogo", 95);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Bruna Santos", "Controle de Armas", "Terra", 89);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Gustavo Almeida", "Ecolocalização Aprimorada", "Potência", 90);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Letícia Fernandes", "Audição Ampliada", "Potência", 86);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Felipe Rodrigues", "Super força", "Potência", 94);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Amanda Silva", "Comunicação Animal", "Terra", 85);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Ricardo Pereira", "Controle de Terremotos", "Terra", 88);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Carolina Souza", "Respiração Subaquática", "Água", 90);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Marcelo Gomes", "Controle da Correnteza", "Água", 87);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Beatriz Oliveira", "Proteção Energética", "Potência", 92);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "André Almeida", "Controle da Gravidade", "Ar", 91);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Fernanda Santos", "Controle de Ventos", "Ar", 85);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Gustavo Costa", "Agilidade Extrema", "Potência", 89);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Ana Carolina Fernandes", "Super Pontaria", "Ar", 90);
                        System.out.printf("%-30s %-30s %-25s %-15d%n", "Lucas Almeida", "Controle de Metais", "Terra", 88);
                        System.out.println("");
                        break;
                        
                    case 2: // Inserindo alunos no catálogo
                        inserirAluno("Ana Silva", "Fogo", "Controle de Temperatura", 90);
                        inserirAluno("Pedro Santos", "Potência", "Visão Aguçada", 85);
                        inserirAluno("Maria Oliveira", "Ar", "Levitação", 88);
                        inserirAluno("João Gomes", "Potência", "Controle Mental", 92);
                        inserirAluno("Camila Pereira", "Água", "Fusão com a Água", 87);
                        inserirAluno("Rafael Costa", "Fogo", "Propulsão de Fogo", 95);
                        inserirAluno("Bruna Santos", "Terra", "Controle de Armas", 89);
                        inserirAluno("Gustavo Almeida", "Potência", "Ecolocalização Aprimorada", 90);
                        inserirAluno("Letícia Fernandes", "Potência", "Audição Ampliada", 86);
                        inserirAluno("Felipe Rodrigues", "Potência", "Super força", 94);
                        inserirAluno("Amanda Silva", "Terra", "Comunicação Animal", 85);
                        inserirAluno("Ricardo Pereira", "Terra", "Controle de Terremotos", 88);
                        inserirAluno("Carolina Souza", "Água", "Respiração Subaquática", 90);
                        inserirAluno("Marcelo Gomes", "Água", "Controle da Correnteza", 87);
                        inserirAluno("Beatriz Oliveira", "Potência", "Proteção Energética", 92);
                        inserirAluno("André Almeida", "Ar", "Controle da Gravidade", 91);
                        inserirAluno("Fernanda Santos", "Ar", "Controle de Ventos", 85);
                        inserirAluno("Gustavo Costa", "Potência", "Agilidade Extrema", 89);
                        inserirAluno("Ana Carolina Fernandes", "Ar", "Super Pontaria", 90);
                        inserirAluno("Lucas Almeida", "Terra", "Controle de Metais", 88);
                        break;
                        
                    case 3: // Inserir aluno manualmente
                        inserirAluno(input);
                        break;

                    case 4: // Removendo alunos do catálogo
                        removerAluno(input);
                        break;
                    
                    case 5: // Listar alunos
                    System.out.println("LISTA DE ALUNOS");
                    System.out.println("---------------");
                        exibirEmOrdem(raiz);
                        break;
                    
                    case 6: // Buscar alunos
                        busca(input);
                        break;
                    case 7: // Sair do sistema
                        System.out.println("SAINDO...");
                        break;
                }
            }
        }
    }
    
    //Verificar se a categoria do poder existe
    public static boolean categoriaValida(String categoria){
        if (categoria.equals("ar") || categoria.equals("terra") || categoria.equals("agua") || categoria.equals("potencia") || categoria.equals("fogo")) {
            return false;
        }
        return true;
    }

    //Algoritimo de organização da lista de alunos
    public static Aluno inserirArvore(Aluno no, Aluno aluno) {
        if (no == null) {
            return aluno;
        }
        if (aluno.getNivel() < no.getNivel()) {
            no.setEsquerda(inserirArvore(no.getEsquerda(), aluno));
        } else {
            no.setDireita(inserirArvore(no.getDireita(), aluno));
        }
        return no;
    }

    //Inserção e remoção de alunos
    public static void inserirAluno(Scanner input){

        System.out.println("MATRICULAR ALUNO:");
        System.out.println("-----------------");
        input.nextLine();
        System.out.println("");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        boolean fazer = true;
        String categoria = "";
        while(fazer){
            System.out.println("Categorias validas: ar, terra, fogo, agua, potencia.");
            System.out.print("Categoria do poder: ");
            categoria = input.nextLine();
            fazer = categoriaValida(categoria);
        }
        System.out.print("Poder: ");
        String poder = input.nextLine();
        System.out.print("Nível de poder: ");
        int nivelPoder = input.nextInt();
        System.out.println("");

        Aluno aluno = new Aluno(nome, categoria, poder, nivelPoder);
        catalogo.add(aluno);
        raiz = inserirArvore(raiz, aluno);
        aluno.showInfo();

        System.out.println("Aluno matriculado com sucesso!");
        System.out.println("");
    }

    public static void inserirAluno(String nome, String categoria, String poder, int nivelPoder){
        Aluno aluno = new Aluno(nome, categoria, poder, nivelPoder);
        catalogo.add(aluno);
        raiz = inserirArvore(raiz, aluno);
        aluno.showInfo();
        System.out.println("Aluno matriculado com sucesso!");
        System.out.println("");
    }

    public static void removerAluno(Scanner input){

        System.out.println("REMOVER ALUNO");
        System.out.print("ID do aluno: ");
        int id = input.nextInt();
        System.out.println("");

        boolean encontrado = false;
        for (int i =0; i< catalogo.size(); i++){
            Aluno x = catalogo.get(i);
            if(x.getID() == id){
                encontrado = true;
                catalogo.remove(i);
                System.out.println("Aluno foi removido do sistema.");
                System.out.println("");
            }
        }
        if (encontrado == false) {
            System.out.println("Aluno não encontrado!");
            System.out.println("");
        }
    }

    //Listar alunos
    public static void exibirEmOrdem(Aluno no) {
        if (no != null) {
            exibirEmOrdem(no.getEsquerda());
            no.showInfo();
            System.out.println();
            exibirEmOrdem(no.getDireita());
            
        }
    }

    //Sistema para busca de aluno
    private static void busca(Scanner input){

        System.out.println("BUSCAR ALUNO");
        input.nextLine();
        System.out.print("Poder do aluno: ");
        String poder = input.nextLine();
        System.out.println("");
        boolean encontrado = false;
        for (int i =0; i< catalogo.size(); i++){
            Aluno x = catalogo.get(i);
            if((x.getPoder()).equals(poder)){
                encontrado = true;
                x.showInfo();
                System.out.println("");
            }
        }
        if (encontrado == false) {
            System.out.println("Aluno não encontrado!");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
