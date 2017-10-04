package br.inf.ufg.fizzbuzz;


import org.junit.Assert;
import org.junit.Test;


public class TestFizzBuzz

{
	
	@Test
	public void checkCPU() {
		int num1 = 5;
		int num2 = 20;
		int num3 = 3;
		int num4 = 6;
		int num5 = 30;
		int num6 = 60;
		int num7 = 26;
		int num8 = 4;
		Assert.assertEquals("fizz", Fizzbuzz.computadorJoga(num3));
		Assert.assertEquals("fizz", Fizzbuzz.computadorJoga(num4));
		Assert.assertEquals("buzz", Fizzbuzz.computadorJoga(num1));
		Assert.assertEquals("buzz", Fizzbuzz.computadorJoga(num2));
		Assert.assertEquals("fizzbuzz",Fizzbuzz.computadorJoga(num5));
		Assert.assertEquals("fizzbuzz",Fizzbuzz.computadorJoga(num6));
		Assert.assertEquals("" + num7, Fizzbuzz.computadorJoga(num7));
		Assert.assertEquals("" + num8, Fizzbuzz.computadorJoga(num8));
		
	}

	
	@Test
	public void deveChecarJogada() {
		String jogada1 = "fizz";
		String jogada2 = "buzz";
		String jogada3 = "fizzbuzz";
		String jogada4 = "1";
		int num1 = 3;
		int num2 = 5;
		int num3 = 15;
		int num4 = 1;
		Assert.assertEquals("fizz",Fizzbuzz.verificaJogada(jogada1, num1));
		Assert.assertEquals("buzz",Fizzbuzz.verificaJogada(jogada2, num2));
		Assert.assertEquals("fizzbuzz",Fizzbuzz.verificaJogada(jogada3, num3));
		Assert.assertEquals("1",Fizzbuzz.verificaJogada(jogada4, num4));

	}

	@Test
	public void checkErrou() {
		String jogada1 = "6";
		String jogada2 = "10";
		String jogada3 = "30";
		String jogada4 = "5";
		int num1 = 6;
		int num2 = 10;
		int num3 = 30;
		int num4 = 4;	
		Assert.assertEquals("Errou",Fizzbuzz.verificaJogada(jogada1, num1));
		Assert.assertEquals("Errou",Fizzbuzz.verificaJogada(jogada2, num2));
		Assert.assertEquals("Errou",Fizzbuzz.verificaJogada(jogada3, num3));
		Assert.assertEquals("Errou",Fizzbuzz.verificaJogada(jogada4, num4));

	}
	
}
