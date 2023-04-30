package br.edu.infnet;

public abstract class ProfessorDecorator implements ProfessorInterface {
    protected ProfessorInterface professor;

    public ProfessorDecorator(ProfessorInterface professor) {
        this.professor = professor;
    }

    public static class ProfessorComTitulacao extends ProfessorDecorator {
        private Titulacao titulacao;

        public ProfessorComTitulacao(ProfessorInterface professor, Titulacao titulacao) {
            super(professor);
            this.titulacao = titulacao;
        }

        public String getNome() {
            return professor.getNome() + " (" + titulacao + ")";
        }
    }
}