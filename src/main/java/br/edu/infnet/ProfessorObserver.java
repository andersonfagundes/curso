package br.edu.infnet;

public class ProfessorObserver implements EnderecoObserver{
    private String nome;

    public ProfessorObserver(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Endereco endereco) {
        System.out.println("Endereço do professor " + nome + " foi atualizado: " + endereco.getRua() + ", " + endereco.getNumero());
    }
}
