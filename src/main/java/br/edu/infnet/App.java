package br.edu.infnet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("---SISTEMA ESCOLA DE INGLÊS---");

        Endereco enderecoAluno = new Endereco("Rua que sobe", "25", "Ap 5", "Copacabana",
                "Rio de Janeiro", "Rio de Janeiro");

        Aluno aluno = new Aluno.AlunoBuilder()
                .nome("Anderson")
                .telefone("21999999999")
                .cpf("0000000000")
                .identidade("210000000")
                .cpf("11111111111")
                .nomeMae("Minha mae")
                .nomePai("Meu pai")
                .endereco(enderecoAluno)
                .build();

        Endereco enderecoProfessor = new Endereco("Rua aqui perto", "17","Ap 2",
                "Teresopolis","Teresopolis","Rio de Janeiro");
        Professor professor = new Professor("Fulano de tal");

        Turma turma = new Turma("B1-2023-M","B1",Turno.MANHA,professor,aluno);

        System.out.println("Aluno: "+aluno.toString());
        System.out.println("Endereco do aluno: "+enderecoAluno.getBairro());
        System.out.println("Turma: "+turma.toString());
    }
}
