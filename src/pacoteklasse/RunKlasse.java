package pacoteklasse;

import java.util.Scanner;

public class RunKlasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1 PARTE DO CÓDIGO

				// Objetos e Variáveis
		Scanner input = new Scanner(System.in);
		String resposta1, resposta2, resposta3;
		
		
		// Covid-19
		System.out.println("Você está tendo dificuldade de respirar? (s ou n) ");
		resposta1 = input.nextLine();

		if (resposta1.equals("s")) {

			System.out.println("Você sentiu perca de olfato? (s ou n) ");
			resposta2 = input.nextLine();

			System.out.println("Você está tendo tosse seca? (s ou n) ");
			resposta3 = input.nextLine();

			if (resposta2.equals("s") && resposta3.equals("s")) {
				System.out.println("\n\nO paciente possivelmente possui covid");
				System.exit(0);
			}
		}

		// Perguntar sintomas específicos da raiva

		System.out.println("O paciente teve convulção(ões)? (s ou n) ");
		resposta1 = input.nextLine();

		if (resposta1.equals("s")) {

			System.out.println("O paciente está tendo Inquetação, irritabilidade ou agressividade?");
			resposta2 = input.nextLine();
			System.out.println("O paciente está com sensibilidade excessiva à luz?");
			resposta3 = input.nextLine();

			if (resposta2.equals("s") && resposta3.equals("s")) {
				System.out.println("\n\nO paciente possivelmente possui raiva");
				System.exit(0);
			}

		}

		// Perguntar sintomas específicos da dengue

		System.out.println("Há manchas vermelhas no seu corpo?");
		resposta1 = input.nextLine();

		if (resposta1.equals("s")) {

			System.out.println("Você está com dor no corpo?");
			resposta2 = input.nextLine();
			System.out.println("Sentiu dor atrás dos olhos?");
			resposta3 = input.nextLine();

			if (resposta2.equals("s") && resposta3.equals("s")) {
				System.out.println("\n\nO paciente possivelmente possui dengue");
				System.exit(0);
			}

			// Peguntar sintomas específicos da herpes labial

			System.out.println("Há sensação de queimação nos lábios?");
			resposta1 = input.nextLine();

			if (resposta1.equals("s")) {
				System.out.println("Há erupções nos lábios do paciente?");
				resposta2 = input.nextLine();
				System.out.println("Houve lesão bucal? ");
				resposta3 = input.nextLine();

				if (resposta2.equals("s") && resposta3.equals("s")) {
					System.out.println("\n\nO paciente possivelmente possui herpes labial");
					System.exit(0);

				}

			}

		}

		// Perguntar sintomas específicos da febre amarela
		System.out.println("O paciente sentiu calafrios?");
		resposta1 = input.nextLine();
		System.out.println("O paciente está com os olhos amarelados? ");
		resposta2 = input.nextLine();

		if (resposta1.equals("s") && resposta2.equals("s")) {
			System.out.println("\n\nO paciente possivelmente possui febre amarela");
			System.exit(0);
		}

		// 2 PARTE DO CÓDIGO

		// contadores
		int covid = 0, dengue = 0, herpes = 0, raiva = 0;

		// Perguntas gerais covid
		System.out.println("Você sentiu perca de paladar? (s ou n ) ");
		resposta1 = input.nextLine();
		if (resposta1.equals("s"))
			covid++;
		System.out.println("Você sentiu perca de olfato? ");
		resposta2 = input.nextLine();
		if (resposta2.equals("s"))
			covid++;
		System.out.println("Você está tendo tosse seca?");
		resposta3 = input.nextLine();
		if (resposta3.equals("s"))
			covid++;

		// Perguntas gerais raiva
		System.out.println("O paciente está tendo aluninações delírio ou medo?");
		resposta1 = input.nextLine();
		if (resposta1.equals("s"))
			raiva++;
		System.out.println("O paciente está tendo Inquetação, irritabilidade ou agressividade?");
		resposta2 = input.nextLine();
		if (resposta2.equals("s"))
			raiva++;
		System.out.println("O paciente está com sensibilidade excessiva à luz?");
		resposta3 = input.nextLine();
		if (resposta3.equals("s"))
			raiva++;

		// Perguntas gerais dengue
		System.out.println("Você está com dor no corpo? ");
		resposta1 = input.nextLine();
		if (resposta1.equals("s"))
			dengue++;
		System.out.println("Sentiu dor atrás dos olhos? ");
		resposta2 = input.nextLine();
		if (resposta2.equals("s"))
			dengue++;
		System.out.println("Sua gengiva ou nariz está sangrando?");
		resposta3 = input.nextLine();
		if (resposta3.equals("s"))
			dengue++;

		// Perguntas gerais herpes labial
		System.out.println("Houve lesão bucal? ");
		resposta1 = input.nextLine();
		if (resposta1.equals("s"))
			herpes++;
		System.out.println("Os lábios do paciente doem? ");
		resposta2 = input.nextLine();
		if (resposta2.equals("s"))
			herpes++;
		System.out.println("Há erupções nos lábios do paciente? ");
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


