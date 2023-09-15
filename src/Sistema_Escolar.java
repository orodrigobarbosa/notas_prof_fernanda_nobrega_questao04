import java.util.Scanner;
public class Sistema_Escolar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        Aluno p = new Aluno();
        Professor op = new Professor();
        Coordenador operacao = new Coordenador();

        System.out.println("Digite o nome do alun@: ");
        p.setNome(teclado.nextLine());

        System.out.println("Digite a idade: ");
        p.setIdade(teclado.nextInt());

        System.out.println("Digite a primeira nota: ");
        p.setNota1(teclado.nextFloat());

        System.out.println("Digite a segunda nota: ");
        p.setNota2(teclado.nextFloat());

        p.setMedia((p.getNota1()+p.getNota2())/2);

        System.out.println("Alun@: " + p.getNome() + "\n" +"Idade: " + p.getIdade());
        System.out.println("A primeira nota foi: " + p.getNota1() + "\n"+ "A segunda nota foi: " + p.getNota2() + "\n"+ "A média do aluno é: " + p.getMedia() );



        System.out.println("============Professor================");

        System.out.println("Digite o nome do professor/professora: ");
        op.setNome(entrada.nextLine());

        System.out.println("Digite a idade do professor/professora");
        op.setIdade(entrada.nextInt());

        System.out.println("Digite a especialização: ");
        op.setEspecializacao(entrada.next());

        System.out.println("Professor/Professora: " + op.getNome());
        System.out.println("Idade: " + op.getIdade());
        System.out.println("Especialização: " + op.getEspecializacao());

        System.out.println("=============Coordenacao==============");

        System.out.println("Digite o nome do coordenador ou coordenadora: ");
        operacao.setNome(input.nextLine());

        System.out.println("Digite a idade: ");
        operacao.setIdade(input.nextInt());

        System.out.println("Digite a titulação: ");
        operacao.setTitulacao(input.next());

        System.out.println("Coordenação: " + operacao.getNome());
        System.out.println("Idade: " + operacao.getIdade());
        System.out.println("Titulação: " + operacao.getTitulacao());

    }
}
