package appGeometricCalculator;
import entities.Circulo;
import entities.Paralelograma;
import entities.Quadrado;
import entities.Trapezio;
import entities.Triangulos;
import java.util.Scanner;

public class EscolhendoTipoGeometrico {
	
	public static void textoDoEscolhendoTipoGeometrico () {
		boolean estadoLoop = true;
		Scanner sc = new Scanner (System.in);
		
		while (estadoLoop) {
			int interruptor;
			System.out.println("----------------------------------------------------------");
			System.out.println("Bem Vindo! Escolha o tipo geometrico para calcular a area:");
			System.out.println("1 - Ciruclo");
			System.out.println("2 - Triangulos");
			System.out.println("3 - Trapezio");
			System.out.println("4 - Quadrado");
			System.out.println("5 - Paralelograma");
			System.out.println("6 - Retangulo");
			System.out.println("0 - Para encerrar o programa");
			interruptor = sc.nextInt();
		
			switch (interruptor) {
				case 0:
					System.exit(interruptor);
					break;
				
				case 01:
					Circulo.painelDaAreaDoCirculo();
					break; 
					
				case 02:
					Triangulos.escolhendoTipoDeTriangulos();
					break;
					
				case 03:
					Trapezio.executandoTrapezio();
					break;
					
				case 04:
					Quadrado.executandoQuadrado();
					break;
					
				case 05:
					Paralelograma.executandoParalelograma();
					break;
					
				case 06:
					break;
			}
		}
	}

}
