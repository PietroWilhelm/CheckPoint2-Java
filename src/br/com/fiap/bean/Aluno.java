package br.com.fiap.bean;

import java.time.LocalDate;
// Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:
public class Aluno {
    //Atributos
    private int registroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;

    // Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:
    //Construtores
    public Aluno(int registroMatricula, String nomeCompleto, int anoDeNascimento) {
        this.registroMatricula = registroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.anoDeNascimento = anoDeNascimento;
    }

    // Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:
    public Aluno(){
    }

    // Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:
    //Getters/Setters
    public int getRegistroMatricula() {
        return registroMatricula;
    }
    // Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:
    public void setRegistroMatricula(int registroMatricula) {
        try {
              if (registroMatricula >= 80000 && registroMatricula <= 599999){
                    this.registroMatricula = registroMatricula;
              } else {
                   throw new Exception("valor inválido, o registro de matricula no pode ser menor que 599999 e maior que 800000");
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    // Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    // Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    // Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:
    public void setAnoDeNascimento(int anoDeNascimento) {
        LocalDate dataAtual = LocalDate.now();
        try {
            if (anoDeNascimento >= 1945 && anoDeNascimento <= dataAtual.getYear()) {
                 this.anoDeNascimento = anoDeNascimento;
            } else {
                throw new RuntimeException("Valor invalido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Pietro Paranhos Wilhelm RM:561378, Arthur Cazes RM:561829, Arthur Silvera RM: 562310, Diogo Olivera RM:
    //Metodos da classe
    public int calcularIdade(int anoAtual){
        return anoAtual - anoDeNascimento;
    }
}
