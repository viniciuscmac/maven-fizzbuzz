package br.inf.ufg.fizzbuzz;

import java.util.Scanner;

public class Fizzbuzz {
	
	
	
	static int num = 1;
	/*public static void main(String[] args) {
		boolean jogo = true;
		System.out.println("Apitou, começou!");
		while(jogo) {
			String flag = jogadorJoga(num);
			if(flag.equals("Errou")) {
				jogo=false;
			}
			else {
				num++;
			}
			String flag2 = computadorJoga(num);
			if(flag2.equals("Errou")) {
				jogo=false;
			}
			else {
				num++;
			}
		}
		
		System.out.println("Fim do jogo!");
	}
	*/
	
	public static String verificaJogada(String jogada, int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			if (jogada.equals("fizzbuzz")) {
				return jogada;
			}
			else {
				return "Errou";
			}
		} else if (num % 3 == 0) {
			if (jogada.equals("fizz")) {
				return jogada;
			}
			else {
				return "Errou";
			}
		} else if (num % 5 == 0) {
			if (jogada.equals("buzz")) {
				return jogada;
			}
			else {
				return "Errou";
			}
		} else {
			if (Integer.parseInt(jogada) == num) {
				return jogada;
			}
			else {
				return "Errou";
			}
		}

	}
	
	public static String jogadorJoga(int num) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a jogada do jogador: ");
		String jogada = scan.nextLine();
		if(verificaJogada(jogada,num)!="Errou") {
			return "Jogada correta!";
		}
		else {
			return "Errou";
		}
		
	}
	
	public static String computadorJoga(int num) {
		String jogada = "";
		if(num % 5 == 0 && num % 3 == 0) {
			jogada = "fizzbuzz";
		} else if(num % 3 == 0) {
			jogada = "fizz";
		} else if(num % 5 == 0) {
			jogada = "buzz";
		} else jogada = String.valueOf(num);
		System.out.println("Vez da CPU:\n");
		System.out.println(jogada);
		return jogada;
	}
}
