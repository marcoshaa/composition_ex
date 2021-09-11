package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.enums.*;
import entities.*;

public class prog {
	
	public static void main (String []args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String depName = sc.nextLine();
		System.out.println("Entre com os dados do trabalho:");
		System.out.print("Name: ");
		String wName = sc.nextLine();
		System.out.print("Nivel: ");
		String wLevel = sc.nextLine();
		System.out.print("Salario base: ");
		Double bSalary = sc.nextDouble();
		
		work work = new work(wName, workLevel.valueOf(wLevel), bSalary, new depart(depName));
		
		
		System.out.print("Quantos contratos este trabalhador tem ?");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Enter com o contrato #" + i + " Dados:");
			System.out.print("Data: (DD/MM/YYYY): ");
			Date contracDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHo = sc.nextDouble();
			System.out.print("Duração do contrato em Horas: ");
			int h = sc.nextInt();
			
			hContrac contrato = new hContrac(contracDate, valorHo, h);
			work.addContrac(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com o mes e o ano (MM/YYYY): ");
		String monAyear = sc.next();
		int month = Integer.parseInt(monAyear.substring(0, 2));
		int year = Integer.parseInt(monAyear.substring(3));
		
		System.out.println("_____________________________________");
		System.out.println("Nome: " + work.getName());
		System.out.println("Departamento: " + work.getDepart().getName());
		System.out.println("O funcionario recebeu " + monAyear + ": " + work.income(year, month));
				
		sc.close();
	}

}
