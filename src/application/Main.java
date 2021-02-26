package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import func.Funcionarios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Quantos funcionários você quer registrar?: ");
		int nfunc = in.nextInt();

		List<Funcionarios> lista = new ArrayList<>();

		for (int i = 0; i < nfunc; i++) {

			System.out.print("Id: ");
			int id = in.nextInt();
			System.out.print("Nome: ");
			String n = in.next();
			System.out.print("Salario: ");
			double s = in.nextDouble();

			Funcionarios fun = new Funcionarios(id, n, s);

			lista.add(fun);

		}

		System.out.print("Informe o ID do funcionario para aumento: ");
		int id = in.nextInt();

		Funcionarios fun = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (fun  != null) {
			System.out.print("Informe a porcetagem: ");
			double p = in.nextDouble();
			fun.aumento(p);

		} else {
			System.out.println("ID não encontrado");
		}

		
		for (Funcionarios x : lista) {

			System.out.println("");
			System.out.println("Id: " + x.getId());
			System.out.println("Nome: " + x.getNome());
			System.out.println("Salario: " + x.getSalario());
			System.out.println("");

		}

	}

}
