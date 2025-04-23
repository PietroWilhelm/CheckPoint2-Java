package br.com.fiap.main;
import br.com.fiap.bean.Aluno;
import javax.swing.JOptionPane;
import java.time.LocalDate;

// Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
public class MainAluno {
    public static void main(String[] args) {

        // Data atual para o cálculo da idade
        int anoAtual = LocalDate.now().getYear();

        // Aluno 1 (dados fixos)
        Aluno aluno1 = new Aluno(562310, "Arthur Silvera", 2005);
        String dadosAluno1 = String.format(
                "RM: %d\nNome: %s\nIdade: %d anos\n",
                aluno1.getRegistroMatricula(),
                aluno1.getNomeCompleto(),
                aluno1.calcularIdade(anoAtual)
        );

        // Aluno 2 (dados fixos)
        Aluno aluno2 = new Aluno(561829, "Arthur Cazes", 2007);
        String dadosAluno2 = String.format(
                "RM: %d\nNome: %s\nIdade: %d anos\n",
                aluno2.getRegistroMatricula(),
                aluno2.getNomeCompleto(),
                aluno2.calcularIdade(anoAtual)
        );

        // Aluno 3 (entrada do usuário)
        Aluno aluno3 = new Aluno();
        try {
            int rm3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do 3º aluno:"));
            aluno3.setRegistroMatricula(rm3);
            String nome3 = JOptionPane.showInputDialog("Digite o nome completo do 3º aluno:");
            aluno3.setNomeCompleto(nome3);
            int ano3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do 3º aluno:"));
            aluno3.setAnoDeNascimento(ano3);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao digitar os dados do 3º aluno.");
        }

        String dadosAluno3 = String.format(
                "RM: %d\nNome: %s\nIdade: %d anos\n",
                aluno3.getRegistroMatricula(),
                aluno3.getNomeCompleto(),
                aluno3.calcularIdade(anoAtual)
        );

        // Aluno 4 (entrada do usuário)
        Aluno aluno4 = new Aluno();
        try {
            int rm4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do 4º aluno:"));
            aluno4.setRegistroMatricula(rm4);
            String nome4 = JOptionPane.showInputDialog("Digite o nome completo do 4º aluno:");
            aluno4.setNomeCompleto(nome4);
            int ano4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do 4º aluno:"));
            aluno4.setAnoDeNascimento(ano4);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao digitar os dados do 4º aluno.");
        }

        String dadosAluno4 = String.format(
                "RM: %d\nNome: %s\nIdade: %d anos\n",
                aluno4.getRegistroMatricula(),
                aluno4.getNomeCompleto(),
                aluno4.calcularIdade(anoAtual)
        );

        // Mostrar todos os dados juntos
        String resultadoFinal = "DADOS DOS ALUNOS:\n\n" +
                dadosAluno1 + "\n" +
                dadosAluno2 + "\n" +
                dadosAluno3 + "\n" +
                dadosAluno4;

        JOptionPane.showMessageDialog(null, resultadoFinal);
    }
}
