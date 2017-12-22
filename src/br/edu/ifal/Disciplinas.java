package br.edu.ifal;

import java.util.List;

public class Disciplinas {
	
	private String nome_disciplina;
	private Professor professor;
	private  List<Aluno> alunos;
	
	
	public String getNome_disciplina() {
		return nome_disciplina;
	}
	
	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Disciplinas() {
		super();
	}
	 
	
	

}
