import java.util.Scanner;


public class TarefaMedia {

    public static void main(String args[]){

        notaAluno1();

    }
    public static void notaAluno1() {
        System.out.println("***** notaAluno1 *****");

        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        int nota1 = s.nextInt();
        System.out.println("Digite a segunda nota");
        int nota2 = s.nextInt();
        System.out.println("Digite a terceira nota");
        int nota3 = s.nextInt();
        System.out.println("Digite a segunda nota");
        int nota4 = s.nextInt();


        int somaNotas = nota1 + nota2 + nota3 + nota4;
        System.out.println("Soma das Notas Aluno1: " + somaNotas);

        int media = somaNotas / 4;
        System.out.println("Media Aluno1: " + media);
        if(media >= 7) {
            System.out.println("Aprovado");
        }else if (media >= 5) {
            System.out.println("Recuperação");
        }else if (media < 5) {
            System.out.println("Reprovado");
        }
    }

}