package Model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa{
    private String nome;
    private LocalDate dataNascimento;
    private String profissao;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(int dia, int mes, int ano){
        if (ano < 1873 && mes < 3 && dia < 16){
            this.dataNascimento = LocalDate.of(1873, mes, dia);
        }
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    public String getProfissao(){
        return profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    



}