package br.edu.infnet;

import java.util.ArrayList;
import java.util.List;

public class Professor implements ProfessorInterface {
    private String nome;
    private Endereco endereco;
    private List<EnderecoObserver> enderecoObservers;

    public Professor(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.enderecoObservers = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
        notifyEnderecoObservers();
    }

    public void addEnderecoObserver(EnderecoObserver observer) {
        enderecoObservers.add(observer);
    }

    public void removeEnderecoObserver(EnderecoObserver observer) {
        enderecoObservers.remove(observer);
    }

    private void notifyEnderecoObservers() {
        for (EnderecoObserver observer : enderecoObservers) {
            observer.update(endereco);
        }
    }
}
