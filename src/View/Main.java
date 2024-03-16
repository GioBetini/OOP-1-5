package View;

import javax.swing.JOptionPane;

import Model.Pessoa;

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();

        p1.setNome(JOptionPane.showInputDialog("Qual seu nome? "));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Insira seu dia de nascimento"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Insira seu mês de nascimento"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Insira seu ano de nascimento"));
        p1.setDataNascimento(dia,mes,ano);
        p1.setProfissao(JOptionPane.showInputDialog("Qual é sua profissão? "));

        System.out.println(p1.getNome());
        System.out.println(p1.getProfissao());
        System.out.println(p1.getDataNascimento());
        System.out.println(p1.getIdade());
    }
}
