package model;

import java.util.Random;

public class Calcular {
	private int operacao;
	private int num1;
	private int num2;
	private int dificuldade;
	private int resultado;
	
	
	public Calcular(int dificuldade) {
		this.dificuldade = dificuldade;
		Random random = new Random();
		this.operacao = random.nextInt(3); //3 valores, sendo eles: 0-soma, 1-subtração e 2-multiplicação
		
		if(this.dificuldade == 1) {
			//Dificuldade fácil
			this.num1 = random.nextInt(10);
			this.num2 = random.nextInt(10);//Números de 0 a 9
		} else if(this.dificuldade == 2) {
			//Intermediário
			this.num1 = random.nextInt(100);
			this.num2 = random.nextInt(100);
		} else if(this.dificuldade == 3) {
			//Difícil
			this.num1 = random.nextInt(1000);
			this.num2 = random.nextInt(1000);
		} else {
			System.out.println("Opção Inválida");
		}
	}
	
	public int getResultado() {
		return resultado;
	}
	
	public int getOperacao() {
		return operacao;
	}
	
	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public int getDificuldade() {
		return dificuldade;
	}
	
	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}
	
	public boolean somar(int respostaUsuario) {
		this.resultado = this.getNum1() + this.getNum2();
		boolean acertou = false;
		
		if(respostaUsuario == this.getResultado()) {
			System.out.println("Resposta Correta!");
			acertou = true;
		} else {
			System.out.println("Resposta errada.");
			System.out.println(this.getNum1() + " + " + this.getNum2() + " = " + this.getResultado());
		}
		
		return acertou;
	}
	
	public boolean subtrair(int respostaUsuario) {
		this.resultado = this.getNum1() - this.getNum2();
		boolean acertou = false;
		
		if(respostaUsuario == this.getResultado()) {
			System.out.println("Resposta Correta!");
			acertou = true;
		} else {
			System.out.println("Resposta errada.");
			System.out.println(this.getNum1() + " - " + this.getNum2() + " = " + this.getResultado());
		}
		
		return acertou;
	}
	
	public boolean multiplicar(int respostaUsuario) {
		this.resultado = this.getNum1() * this.getNum2();
		boolean acertou = false;
		
		if(respostaUsuario == this.getResultado()) {
			System.out.println("Resposta Correta!");
			acertou = true;
		} else {
			System.out.println("Resposta errada.");
			System.out.println(this.getNum1() + " * " + this.getNum2() + " = " + this.getResultado());
		}
		
		return acertou;
	}
	
	public String toString() {
		String op;
		if(this.getOperacao() == 0) {
			op = "Somar";
		} else if (this.getOperacao() == 1) {
			op = "Subtrair";
		} else if (this.getOperacao() == 2) {
			op = "Multiplicar";
		} else {
			op = "Operação Inválida.";	
		}
		
		return "Número 1: " + this.getNum1() +
				"\nNúmero 2: " + this.getNum2() +
				"\nDificuldade: " + this.getDificuldade() +
				"\nOperação: " + op;
	}
	
	
}
