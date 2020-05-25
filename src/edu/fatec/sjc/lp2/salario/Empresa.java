package edu.fatec.sjc.lp2.salario;

import java.util.ArrayList;
import java.util.Collections;
import lombok.Getter;
import lombok.Setter;

public class Empresa {
	private String nomeEmpresa;
	private ArrayList<Funcionario> funcionarios = new ArrayList();
	
	public Empresa(String nome) {
		this.nomeEmpresa = nome;
	}
	
	private Double correctSal(Double val) {
		if(val<=1500) {
			Double newSal = val - val * 0.06;
			return newSal;
		}
		else {
			Double newSal = val - val * 0.095;
			return newSal;
		}
			
	}
	
	public void addFuncionario(int matricula,String nome,Double salario) {
		Funcionario newFuncionario = new Funcionario(matricula,nome,correctSal(salario));
		this.funcionarios.add(newFuncionario);		
	}
	
	public void listFuncionario() {
		for(Funcionario funcionario: this.funcionarios) {
			System.out.println("Nome:"+funcionario.getNome()+"|Matricula:" + funcionario.getMatricula() + "|Salario:"+funcionario.getSalario());
		}
	}
	
}
