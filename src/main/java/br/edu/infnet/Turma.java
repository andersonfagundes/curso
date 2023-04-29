package br.edu.infnet;

public class Turma {
    private String codigo;
    private String nivelIngles;
    private Turno turno;
    private Professor professor;
    private Aluno aluno;

    public Turma(String codigo, String nivelIngles, Turno turno, Professor professor, Aluno aluno) {
        this.codigo = codigo;
        this.nivelIngles = nivelIngles;
        this.turno = turno;
        this.professor = professor;
        this.aluno = aluno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(String nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
