package edu.fatec.sjc.lp2.salario;

public class Teste {
	public static void main(String[] args) {
		Empresa testeEmpresa = new Empresa("TesteEmp");
		
		testeEmpresa.addFuncionario(0, "Mario", 1500.0);
		testeEmpresa.addFuncionario(1, "André", 2700.0);
		testeEmpresa.addFuncionario(2, "Felipe", 4304.0);
		testeEmpresa.addFuncionario(3, "Alessandro", 1780.0);
		testeEmpresa.addFuncionario(4, "Antonio", 1999.0);
		testeEmpresa.addFuncionario(5, "Lucas", 974.0);
		testeEmpresa.addFuncionario(6, "Pereira", 1300.0);
		testeEmpresa.addFuncionario(7, "Bruno", 10000.0);
		testeEmpresa.addFuncionario(8, "Tamyris", 4000.0);
		
		testeEmpresa.listFuncionario();
	}
}
