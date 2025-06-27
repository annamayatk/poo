package aulas;

public class SituacaoAluno {

    public static void main(String[] args) {
        
        double nota1 = 6.5;
        double nota2 = 7;
        
        // Chama o método para verificar a situação do aluno e imprime o resultado
        String resultado = verificarSituacaoAluno(nota1, nota2);
        System.out.println(resultado);
    }

    // Método que retorna a situação do aluno como uma String
    public static String verificarSituacaoAluno(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            return "Aprovado Parabéns"; // Retorna a mensagem se a média for 10
        } else if (media >= 7) {
            return "Aprovado"; // Retorna a mensagem se a média for 7 ou mais
        } else {
            return "Reprovado"; // Retorna a mensagem se a média for menor que 7
        }
    }
}