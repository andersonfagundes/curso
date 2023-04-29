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

        Endereco enderecoAluno = new Endereco.EnderecoBuilder()
                .rua("Rua que sobe")
                .numero("25")
                .complemento("Ap 5")
                .bairro("Copacabana")
                .cidade("Rio de Janeiro")
                .estado("Rio de Janeiro")
                .build();

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

        Endereco enderecoProfessor = new Endereco.EnderecoBuilder()
                .rua("Rua que desce")
                .numero("17")
                .complemento("Ap 2")
                .bairro("Urca")
                .cidade("Rio de Janeiro")
                .estado("Rio de Janeiro")
                .build();

        Professor professor = new Professor("Fulano de tal");

        Turma turma = new Turma("B1-2023-M","B1",Turno.MANHA,professor,aluno);

        System.out.println("Aluno: "+aluno.toString());
        System.out.println("Endereco do aluno: "+enderecoAluno);
        System.out.println("Turma: "+turma.toString());
    }
}
