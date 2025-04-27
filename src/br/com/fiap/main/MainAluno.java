package br.com.fiap.main; // Define o pacote onde a classe principal MainAluno está localizada

import br.com.fiap.bean.Aluno; // Importa a classe Aluno
import javax.swing.JOptionPane; // Importa a classe JOptionPane para entrada/saída de dados via janelas
import java.time.LocalDate; // Importa a classe LocalDate para trabalhar com datas

// Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654

public class MainAluno {
    public static void main(String[] args) {

        // Obtém o ano atual para calcular a idade dos alunos
        int anoAtual = LocalDate.now().getYear();

        // Criação do aluno1 com dados fixos
        Aluno aluno1 = new Aluno(562310, "Arthur Silvera", 2005);
        // Formata os dados do aluno1 em uma String
        String dadosAluno1 = String.format(
                "RM: %d\nNome: %s\nIdade: %d anos\n",
                aluno1.getRegistroMatricula(),
                aluno1.getNomeCompleto(),
                aluno1.calcularIdade(anoAtual)
        );

        // Criação do aluno2 com dados fixos
        Aluno aluno2 = new Aluno(561829, "Arthur Cazes", 2007);
        // Formata os dados do aluno2 em uma String
        String dadosAluno2 = String.format(
                "RM: %d\nNome: %s\nIdade: %d anos\n",
                aluno2.getRegistroMatricula(),
                aluno2.getNomeCompleto(),
                aluno2.calcularIdade(anoAtual)
        );

        // Criação do aluno3 com dados que serão digitados pelo usuário
        Aluno aluno3 = new Aluno();
        try {
            // Entrada de dados do aluno3 via caixas de diálogo
            int rm3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do 3º aluno:"));
            aluno3.setRegistroMatricula(rm3);

            String nome3 = JOptionPane.showInputDialog("Digite o nome completo do 3º aluno:");
            aluno3.setNomeCompleto(nome3);

            int ano3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do 3º aluno:"));
            aluno3.setAnoDeNascimento(ano3);
        } catch (Exception e) {
            // Caso ocorra erro na entrada de dados, exibe mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao digitar os dados do 3º aluno.");
        }

        // Formata os dados do aluno3 em uma String
        String dadosAluno3 = String.format(
                "RM: %d\nNome: %s\nIdade: %d anos\n",
                aluno3.getRegistroMatricula(),
                aluno3.getNomeCompleto(),
                aluno3.calcularIdade(anoAtual)w
        );

        // Criação do aluno4 com dados que serão digitados pelo usuário
        Aluno aluno4 = new Aluno();
        try {
            // Entrada de dados do aluno4 via caixas de diálogo
            int rm4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do 4º aluno:"));
            aluno4.setRegistroMatricula(rm4);

            String nome4 = JOptionPane.showInputDialog("Digite o nome completo do 4º aluno:");
            aluno4.setNomeCompleto(nome4);

            int ano4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do 4º aluno:"));
            aluno4.setAnoDeNascimento(ano4);
        } catch (Exception e) {
            // Caso ocorra erro na entrada de dados, exibe mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao digitar os dados do 4º aluno.");
        }

        // Formata os dados do aluno4 em uma String
        String dadosAluno4 = String.format(
                "RM: %d\nNome: %s\nIdade: %d anos\n",
                aluno4.getRegistroMatricula(),
                aluno4.getNomeCompleto(),
                aluno4.calcularIdade(anoAtual)
        );

        // Junta todos os dados em uma única String
        String resultadoFinal = "DADOS DOS ALUNOS:\n\n" +
                dadosAluno1 + "\n" +
                dadosAluno2 + "\n" +
                dadosAluno3 + "\n" +
                dadosAluno4;

        // Exibe todos os dados dos alunos em uma janela de mensagem
        JOptionPane.showMessageDialog(null, resultadoFinal);
    }
}
