package br.edu.infnet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConexaoBancoDeDadosSingleton conexao = ConexaoBancoDeDadosSingleton.getInstance("Conectou no Banco de Dados");

        if(conexao instanceof  ConexaoBancoDeDadosSingleton) {
//            throw new RuntimeException("Erro no banco de dados");

            System.out.println("---SISTEMA ESCOLA DE INGLÊS---");

            Endereco enderecoAluno = new Endereco.EnderecoBuilder()
                    .rua("Rua que sobe")
                    .numero("25")
                    .complemento("Ap 5")
                    .bairro("Copacabana")
                    .cidade("Rio de Janeiro")
                    .estado("Rio de Janeiro")
                    .build();

            Endereco enderecoProfessor = new Endereco.EnderecoBuilder()
                    .rua("Rua que desce")
                    .numero("17")
                    .complemento("Ap 2")
                    .bairro("Urca")
                    .cidade("Rio de Janeiro")
                    .estado("Rio de Janeiro")
                    .build();

            Professor professor = new Professor("Fulano de tal", enderecoProfessor);
            ProfessorDecorator.ProfessorComTitulacao professorTitulado = new ProfessorDecorator.ProfessorComTitulacao(
                    professor, Titulacao.DOUTOR);

            ProfessorObserver observer = new ProfessorObserver(professor.getNome());
            professor.addEnderecoObserver(observer);

            professor.setEndereco(new Endereco.EnderecoBuilder()
                    .rua("Rua bla bla bla")
                    .numero("123")
                    .bairro("Barra da Tijuca")
                    .cidade("Rio de Janeiro")
                    .estado("RJ")
                    .build());

            Turma turma = new Turma("B1-2023-M", "B1", Turno.MANHA, professor);

            Aluno aluno = new Aluno.AlunoBuilder()
                    .nome("Anderson")
                    .telefone("21999999999")
                    .cpf("0000000000")
                    .identidade("210000000")
                    .cpf("11111111111")
                    .nomeMae("Minha mae")
                    .nomePai("Meu pai")
                    .endereco(enderecoAluno)
                    .turma(turma)
                    .build();

            System.out.println("\n-----DETALHES PESSOAIS DO ALUNO-----");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Identidade: " + aluno.getIdentidade());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Mãe: " + aluno.getNomeMae());
            System.out.println("Pai: " + aluno.getNomePai());
            System.out.println("Telefone: " + aluno.getTelefone());
            System.out.println("Rua: " + enderecoAluno.getRua());
            System.out.println("Número: " + enderecoAluno.getNumero());
            System.out.println("Complemento: " + enderecoAluno.getComplemento());
            System.out.println("Bairro: " + enderecoAluno.getBairro());
            System.out.println("Cidade: " + enderecoAluno.getCidade());
            System.out.println("Estado: " + enderecoAluno.getEstado());

            System.out.println("\n-----DETALHES DA TURMA DO ALUNO-----");
            System.out.println("Código: " + turma.getCodigo());
            System.out.println("Nível de Inglês: " + turma.getNivelIngles());
            System.out.println("Turno: " + turma.getTurno());
            System.out.println(professorTitulado.getNome());

        }
    }
}
