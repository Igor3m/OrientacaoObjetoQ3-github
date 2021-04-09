package entidade;

public class Student {
	
	public String nome;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	
	public void notaFinal() {
		double notaFinal = trimestre1 + trimestre2 + trimestre3;
		System.out.println("FINAL GRADE = " + " " + "=" + " " + notaFinal); 
	}
	
	public void situacaoDoAluno() {
		double notaFinal = trimestre1 + trimestre2 + trimestre3;
		double notaParaAprovacao = (30 + 35 + 35) * 0.60;
		
		if (notaFinal >= notaParaAprovacao) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			double pontosParaAprovacao = notaParaAprovacao - notaFinal;
			System.out.println("MISSING" + " " + pontosParaAprovacao + " " + "POINTS");
			
		}
	}
}
