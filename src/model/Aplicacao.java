package model;

import java.util.Scanner;

public class Aplicacao {
	
	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;

	public static void main(String[] args) {
		Aplicacao.jogar();
	}
	
	public static void jogar() {
		System.out.println("Informe o nível de dificuldade: [1, 2 ou 3]:");
		int dificuldade = Aplicacao.teclado.nextInt();
		calc = new Calcular(dificuldade);
		
		if(Aplicacao.calc.getOperacao() == 0) {
			System.out.println(calc.getNum1() + " + " + calc.getNum2());
			System.out.println("Informe a resposta:");
			int resposta = Aplicacao.teclado.nextInt();
			
			if(calc.somar(resposta)) {
				Aplicacao.pontos++;
				System.out.println("Você tem " + Aplicacao.pontos + " ponto(s).");
			}
		}
		
		if(Aplicacao.calc.getOperacao() == 1) {
			System.out.println(calc.getNum1() + " - " + calc.getNum2());
			System.out.println("Informe a resposta");
			int resposta = Aplicacao.teclado.nextInt();
			
			if(calc.subtrair(resposta)) {
				Aplicacao.pontos++;
				System.out.println("Você tem " + Aplicacao.pontos + " ponto(s).");
			}
		}
		
		if(Aplicacao.calc.getOperacao() == 2) {
			System.out.println(calc.getNum1() + " * " + calc.getNum2());
			System.out.println("Informe a resposta");
			int resposta = Aplicacao.teclado.nextInt();
			
			if(calc.multiplicar(resposta)) {
				Aplicacao.pontos++;
				System.out.println("Você tem " + Aplicacao.pontos + " ponto(s).");
			}
		}
		
		System.out.println("Deseja continuar jogando? [1- Sim, 2- Não]");
		int continuar = Aplicacao.teclado.nextInt();
		
		if(continuar == 1) {
			Aplicacao.jogar();
		} else if (continuar == 2) {
			System.out.println("Você fez " + Aplicacao.pontos + " ponto(s)!");
			System.out.println("Até a próxima.");
			System.exit(2);
		}
	}

}
