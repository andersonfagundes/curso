package br.edu.infnet;

public class Aluno {
    private String nome;
    private String telefone;

    private String identidade;
    private String cpf;
    private String nomePai;
    private String nomeMae;
    private Endereco endereco;

    private Aluno(String nome, String telefone, String identidade, String cpf, String nomePai, String nomeMae, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.identidade = identidade;
        this.cpf = cpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.endereco = endereco;
    }

    public static class AlunoBuilder {
        private String nome;
        private String telefone;
        private String identidade;
        private String cpf;
        private String nomePai;
        private String nomeMae;
        private Endereco endereco;

        public AlunoBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public AlunoBuilder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public AlunoBuilder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public AlunoBuilder identidade(String identidade) {
            this.identidade = identidade;
            return this;
        }

        public AlunoBuilder nomePai(String nomePai) {
            this.nomePai = nomePai;
            return this;
        }

        public AlunoBuilder nomeMae(String nomeMae) {
            this.nomeMae = nomeMae;
            return this;
        }

        public AlunoBuilder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public Aluno build() {
            return new Aluno(nome, telefone, identidade, cpf, nomePai, nomeMae, endereco);
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", identidade='" + identidade + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
