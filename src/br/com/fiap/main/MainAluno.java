package br.com.fiap.main;

import br.com.fiap.bean.Aluno;
import javax.swing.JOptionPane;
import  java.time.LocalDate;
// Pietro Parang
public class MainAluno {
    public static void main(String[] args) {
        // criação do objeto Aluno
        Aluno aluno = new Aluno();
        try {
            // Interação com o user
            int registro = Integer.parseInt(JOptionPane.showInputDialog("Digite o registro da matrícula: "));
            aluno.setRegistroMatricula(registro);

            String nome = JOptionPane.showInputDialog("Digite o nome completo do aluno: ");
            aluno.setNomeCompleto(nome);

            int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
            aluno.setAnoDeNascimento(anoNascimento);

            // dados do alunos
            int anoAtual = LocalDate.now().getYear();
            int idade = aluno.calcularIdade(anoAtual);

            System.out.printf("Nome do aluno: %s\nidade:  %d\nRM: %d ", aluno.getNomeCompleto(), idade, aluno.getRegistroMatricula());
        } catch (Exception e) {
            System.out.println("Valores invalidos");
        }

    }
}
