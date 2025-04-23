package br.com.fiap.bean;

import java.time.LocalDate;

public class Aluno {
    //Atributos
    private int registroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;

    //Construtores
    public Aluno(int registroMatricula, String nomeCompleto, int anoDeNascimento) {
        this.registroMatricula = registroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.anoDeNascimento = anoDeNascimento;
    }

    public Aluno(){
    }

    //Getters/Setters
    public int getRegistroMatricula() {
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula) {
        try {
              if (registroMatricula >= 599999 && registroMatricula <= 800000){
                    this.registroMatricula = registroMatricula;
              } else {
                   throw new Exception("valor inválido, o registro de matricula no pode ser menor que 599999 e maior que 800000");
              }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

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
    //Metodos da classe

    public int calcularIdade(int anoAtual){
        return anoAtual - anoDeNascimento;
    }
}
