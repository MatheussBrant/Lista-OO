 class Aluno {
    String nome;
    double nota;
}

public class exercicio19 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.nota = 8.5;

        Aluno aluno2 = copiarAluno(aluno1);
        aluno2.nota = 9.5;

        System.out.println("Aluno 1: " + aluno1.nome + ", Nota: " + aluno1.nota);
        System.out.println("Aluno 2: " + aluno2.nome + ", Nota: " + aluno2.nota);
    }

    public static Aluno copiarAluno(Aluno aluno) {
        Aluno novoAluno = new Aluno();
        novoAluno.nome = aluno.nome;
        novoAluno.nota = aluno.nota;
        return novoAluno;
    }
}
