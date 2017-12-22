package br.edu.ifal;

public class Escola {
	private String nome_escola;
	
	private Cursos cursos;
	
	private Disciplinas disciplinas;
	
	private Professor professor;

	public String getNome_escola() {
		return nome_escola;
	}

	public void setNome_escola(String nome_escola) {
		this.nome_escola = nome_escola;
	}

	public Cursos getCursos() {
		return cursos;
	}

	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}

	public Disciplinas getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplinas disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
	
	
}
