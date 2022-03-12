package pacoteklasse;

import java.util.Scanner;

public class RunKlasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1 PARTE DO C�DIGO

				// Objetos e Vari�veis
		Scanner input = new Scanner(System.in);
		String resposta1, resposta2, resposta3;
		
		
		// Covid-19
		System.out.println("Voc� est� tendo dificuldade de respirar? (s ou n) ");
		resposta1 = input.nextLine();

		if (resposta1.equals("s")) {

			System.out.println("Voc� sentiu perca de olfato? (s ou n) ");
			resposta2 = input.nextLine();

			System.out.println("Voc� est� tendo tosse seca? (s ou n) ");
			resposta3 = input.nextLine();

			if (resposta2.equals("s") && resposta3.equals("s")) {
				System.out.println("\n\nO paciente possivelmente possui covid");
				System.exit(0);
			}
		}

		// Perguntar sintomas espec�ficos da raiva

		System.out.println("O paciente teve convul��o(�es)? (s ou n) ");
		resposta1 = input.nextLine();

		if (resposta1.equals("s")) {

			System.out.println("O paciente est� tendo Inqueta��o, irritabilidade ou agressividade?");
			resposta2 = input.nextLine();
			System.out.println("O paciente est� com sensibilidade excessiva � luz?");
			resposta3 = input.nextLine();

			if (resposta2.equals("s") && resposta3.equals("s")) {
				System.out.println("\n\nO paciente possivelmente possui raiva");
				System.exit(0);
			}

		}

		// Perguntar sintomas espec�ficos da dengue

		System.out.println("H� manchas vermelhas no seu corpo?");
		resposta1 = input.nextLine();

		if (resposta1.equals("s")) {

			System.out.println("Voc� est� com dor no corpo?");
			resposta2 = input.nextLine();
			System.out.println("Sentiu dor atr�s dos olhos?");
			resposta3 = input.nextLine();

			if (resposta2.equals("s") && resposta3.equals("s")) {
				System.out.println("\n\nO paciente possivelmente possui dengue");
				System.exit(0);
			}

			// Peguntar sintomas espec�ficos da herpes labial

			System.out.println("H� sensa��o de queima��o nos l�bios?");
			resposta1 = input.nextLine();

			if (resposta1.equals("s")) {
				System.out.println("H� erup��es nos l�bios do paciente?");
				resposta2 = input.nextLine();
				System.out.println("Houve les�o bucal? ");
				resposta3 = input.nextLine();

				if (resposta2.equals("s") && resposta3.equals("s")) {
					System.out.println("\n\nO paciente possivelmente possui herpes labial");
					System.exit(0);

				}

			}

		}

		// Perguntar sintomas espec�ficos da febre amarela
		System.out.println("O paciente sentiu calafrios?");
		resposta1 = input.nextLine();
		System.out.println("O paciente est� com os olhos amarelados? ");
		resposta2 = input.nextLine();

		if (resposta1.equals("s") && resposta2.equals("s")) {
			System.out.println("\n\nO paciente possivelmente possui febre amarela");
			System.exit(0);
		}

		// 2 PARTE DO C�DIGO

		// contadores
		int covid = 0, dengue = 0, herpes = 0, raiva = 0;

		// Perguntas gerais covid
		System.out.println("Voc� sentiu perca de paladar? (s ou n ) ");
		resposta1 = input.nextLine();
		if (resposta1.equals("s"))
			covid++;
		System.out.println("Voc� sentiu perca de olfato? ");
		resposta2 = input.nextLine();
		if (resposta2.equals("s"))
			covid++;
		System.out.println("Voc� est� tendo tosse seca?");
		resposta3 = input.nextLine();
		if (resposta3.equals("s"))
			covid++;

		// Perguntas gerais raiva
		System.out.println("O paciente est� tendo alunina��es del�rio ou medo?");
		resposta1 = input.nextLine();
		if (resposta1.equals("s"))
			raiva++;
		System.out.println("O paciente est� tendo Inqueta��o, irritabilidade ou agressividade?");
		resposta2 = input.nextLine();
		if (resposta2.equals("s"))
			raiva++;
		System.out.println("O paciente est� com sensibilidade excessiva � luz?");
		resposta3 = input.nextLine();
		if (resposta3.equals("s"))
			raiva++;

		// Perguntas gerais dengue
		System.out.println("Voc� est� com dor no corpo? ");
		resposta1 = input.nextLine();
		if (resposta1.equals("s"))
			dengue++;
		System.out.println("Sentiu dor atr�s dos olhos? ");
		resposta2 = input.nextLine();
		if (resposta2.equals("s"))
			dengue++;
		System.out.println("Sua gengiva ou nariz est� sangrando?");
		resposta3 = input.nextLine();
		if (resposta3.equals("s"))
			dengue++;

		// Perguntas gerais herpes labial
		System.out.println("Houve les�o bucal? ");
		resposta1 = input.nextLine();
		if (resposta1.equals("s"))
			herpes++;
		System.out.println("Os l�bios do paciente doem? ");
		resposta2 = input.nextLine();
		if (resposta2.equals("s"))
			herpes++;
		System.out.println("H� erup��es nos l�bios do paciente? ");
		resposta3 = input.nextLine();
		if (resposta3.equals("s"))
			herpes++;

		int maior = Math.max(Math.max(dengue, herpes), Math.max(covid, raiva));

		if (maior == dengue)
			System.out.println("O paciente possui dengue");
		if (maior == herpes)
			System.out.println("o paciente possui herpes");
		if (maior == covid)
			System.out.println("o paciente possui covid");
		if (maior == raiva)
			System.out.println("O paciente possui raiva");

	}
		
	}


