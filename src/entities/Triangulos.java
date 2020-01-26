package entities;
import java.util.Scanner;

import appGeometricCalculator.EscolhendoTipoGeometrico;

public class Triangulos {
	
	public static void escolhendoTipoDeTriangulos () {
		
		boolean estadoLoop = true;
		int interruptor;
		Scanner sc = new Scanner(System.in);
		
		while (estadoLoop) {
			
			System.out.println("----------------------------------------------------------");
			System.out.println("0 - Para encerrar o programa");
			System.out.println("1 - Triangulo retangulo");
			System.out.println("2 - Triangulo equilatero");
			System.out.println("3 - Triangulo isosceles");
			System.out.println("4 - Para retornar a escolha do tipo geometrico");
			interruptor = sc.nextInt();
			
			switch (interruptor) {
				case 0:
					System.exit(interruptor);
					break;
				
				case 01:
					System.out.println("Insira o valor da base:");
					double entradaUmRectangle = sc.nextDouble();
					System.out.println("Insira a altura:");
					double entradaDoisRectangle = sc.nextDouble();
					System.out.print("Área do triângulo retângulo:");
					System.out.println(trianguloRetangulo(entradaUmRectangle, entradaDoisRectangle));
					break;
					
				case 02:
					System.out.println("Insira o lado do triangulo:");
					double entradaUmEquilatero = sc.nextDouble();
					System.out.println("Area calculada");
					System.out.println(trianguloEquilatero(entradaUmEquilatero));
					break;
					
				case 03:
					System.out.println("Insira o valor de um dos lados:");
					double entradaUmIsosceles = sc.nextDouble();
					System.out.println("Insira o valor do outro lado:");
					double entradaDoisIsosceles = sc.nextDouble();
					System.out.println("Area calculada");
					System.out.println(trianguloIsosceles(entradaUmIsosceles, entradaDoisIsosceles));
					break;
				
				case 04:
					EscolhendoTipoGeometrico.textoDoEscolhendoTipoGeometrico();
					break;
			}	
		}
	}
	public static double trianguloRetangulo ( double base, double altura ) {
		return (base * altura) / 2;
	}
	public static double trianguloEquilatero ( double lado) {
		return ((Math.sqrt(3)) / 4 ) * Math.pow(lado, 2);
	}
	public static double trianguloIsosceles ( double a, double b) {
		return Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 2);
	}
}

