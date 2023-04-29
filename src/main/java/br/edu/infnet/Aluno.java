package br.edu.infnet;

public class Aluno {
    private String nome;
    private String telefone;

    private String identidade;
    private String cpf;
    private String nomePai;
    private String nomeMae;
    private Endereco endereco;
    private Turma turma;

    private Aluno(String nome, String telefone, String identidade, String cpf, String nomePai, String nomeMae,
                  Endereco endereco, Turma turma) {
        this.nome = nome;
        this.telefone = telefone;
        this.identidade = identidade;
        this.cpf = cpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.endereco = endereco;
        this.turma = turma;
    }

    public static class AlunoBuilder {
        private String nome;
        private String telefone;
        private String identidade;
        private String cpf;
        private String nomePai;
        private String nomeMae;
        private Endereco endereco;
        private Turma turma;

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

        public AlunoBuilder turma(Turma turma) {
            this.turma = turma;
            return this;
        }

        public Aluno build() {
            return new Aluno(nome, telefone, identidade, cpf, nomePai, nomeMae, endereco, turma);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
