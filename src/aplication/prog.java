package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.enums.*;
import entities.*;

public class prog {
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Entre com o nome do departamento: ");
		String depName = sc.nextLine();
		System.out.print("Entre com os dados do trabalho:");
		System.out.print("Name: ");
		String wName = sc.nextLine();
		System.out.print("Nivel: ");
		String wLevel = sc.nextLine();
		System.out.print("Salario base: ");
		Double bSalary = sc.nextDouble();
		
		work work = new work(wName, workLevel.valueOf(wLevel), bSalary, new depart(depName));
		
		
		System.out.print("Qauntos contratos este trabalhador tem ?");
		int n = sc.nextInt();
				
		sc.close();
	}

}
