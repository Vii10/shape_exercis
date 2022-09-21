package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("Qual figura você escolhe? (C/R)");
			char shapeType = sc.next().charAt(0);
			
			//Se círculo
			if(shapeType == 'C') {
				System.out.print("Digite o raio do círculo: ");
				double radius = sc.nextDouble();
				System.out.print("Possui cor? (S/N)");
				char hasAColor = sc.next().charAt(0);
				if(hasAColor == 'S') {
					System.out.print("Digite a cor: (B/W)");
					char color = sc.next().charAt(0);
					if(color == 'B') {
						Circle circle = new Circle(Color.BLACK, radius);
						System.out.println("--------------------------------------");
						System.out.println("Este círculo tem: ");
						System.out.println(circle);
					}else {
						Circle circle = new Circle(Color.WHITE, radius);
						System.out.println("--------------------------------------");
						System.out.println("Este círculo tem: ");
						System.out.println(circle);
					}
				}
				else {
					Circle circle = new Circle(null, radius);
					System.out.println("--------------------------------------");
					System.out.println("Este círculo tem: ");
					System.out.println(circle);
				}
			}
			//Se retangulo
			else if(shapeType == 'R') {
				System.out.print("Qual a base do seu retangulo? ");
				double base = sc.nextDouble();
				System.out.print("Qual a altura do seu retangulo? ");
				double height = sc.nextDouble();
				System.out.print("Possui cor? (S/N)");
				char hasAColor = sc.next().charAt(0);
				if(hasAColor == 'S') {
					System.out.print("Digite a cor: (B/W)");
					char color = sc.next().charAt(0);
					if(color == 'B') {
						Rectangle rectangle = new Rectangle(Color.BLACK, base, height);
						System.out.println("--------------------------------------");
						System.out.println("Este retangulo tem: ");
						System.out.println(rectangle);
					}
					else {
						Rectangle rectangle = new Rectangle(Color.WHITE, base, height);
						System.out.println("--------------------------------------");
						System.out.println("Este retangulo tem: ");
						System.out.println(rectangle);
					}
				}
				else {
					Rectangle rectangle = new Rectangle(null, base, height);
					System.out.println("--------------------------------------");
					System.out.println("Este retangulo tem: ");
					System.out.println(rectangle);
				}
			}
		}
		finally{
		sc.close();
		}
	}

}
