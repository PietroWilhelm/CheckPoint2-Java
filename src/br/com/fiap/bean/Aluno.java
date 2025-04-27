package br.com.fiap.bean; // Define o pacote onde a classe Aluno está localizada

import java.time.LocalDate; // Importa a classe LocalDate para trabalhar com datas


//Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
public class Aluno {
    // Atributos da classe
    private int registroMatricula; // Número de registro do aluno
    private String nomeCompleto; // Nome completo do aluno
    private int anoDeNascimento; // Ano de nascimento do aluno

    //Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
    // Construtor completo que inicializa todos os atributos
    public Aluno(int registroMatricula, String nomeCompleto, int anoDeNascimento) {
        this.registroMatricula = registroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.anoDeNascimento = anoDeNascimento;
    }

    //Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
    // Construtor vazio (padrão) para permitir criar um aluno sem definir valores inicialmente
    public Aluno(){
    }

    // Métodos Getters e Setters para acessar e modificar os atributos

    //Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
    // Retorna o registro de matrícula do aluno
    public int getRegistroMatricula() {
        return registroMatricula;
    }


    //Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
    // Define o registro de matrícula, validando se está entre 80000 e 599999
    public void setRegistroMatricula(int registroMatricula) {
        try {
            if (registroMatricula >= 80000 && registroMatricula <= 599999) {
                this.registroMatricula = registroMatricula; // Se válido, atribui
            } else {
                throw new Exception("Valor inválido, o registro de matrícula deve ser entre 80000 e 599999."); // Se inválido, lança uma exceção
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Exibe a mensagem de erro
        }
    }

    //Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
    // Retorna o nome completo do aluno
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    //Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
    // Define o nome completo do aluno
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    //Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
    // Retorna o ano de nascimento do aluno
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    //Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
    // Define o ano de nascimento validando se está entre 1945 e o ano atual
    public void setAnoDeNascimento(int anoDeNascimento) {
        LocalDate dataAtual = LocalDate.now(); // Pega a data atual
        try {
            if (anoDeNascimento >= 1945 && anoDeNascimento <= dataAtual.getYear()) {
                this.anoDeNascimento = anoDeNascimento; // Se válido, atribui
            } else {
                throw new RuntimeException("Valor inválido"); // Se inválido, lança exceção
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Exibe a mensagem de erro
        }
    }

    //Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:563654
    //Método que calcula a idade do aluno baseado no ano atual passado como argumento
    public int calcularIdade(int anoAtual) {
        return anoAtual - anoDeNascimento; // Subtrai o ano de nascimento do ano atual
    }
}
