package aplicação;

import java.util.Scanner;

import entidade.Student;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student a = new Student();
		a.nome = sc.nextLine();
		a.trimestre1 = sc.nextDouble();
		a.trimestre2 = sc.nextDouble();
		a.trimestre3 = sc.nextDouble();
		
		a.notaFinal();
		a.situacaoDoAluno();
		
		sc.close();
	}

}
