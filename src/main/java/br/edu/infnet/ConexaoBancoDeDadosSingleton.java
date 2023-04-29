package br.edu.infnet;

public class ConexaoBancoDeDadosSingleton {

    private static ConexaoBancoDeDadosSingleton instance;
    public String mensagem;

    private ConexaoBancoDeDadosSingleton(String mensagem){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        this.mensagem = mensagem;
    }

    public static ConexaoBancoDeDadosSingleton getInstance(String mensagem){
        if(instance == null){
            instance = new ConexaoBancoDeDadosSingleton(mensagem);
        }
        return instance;
    }
}
