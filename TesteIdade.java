package br.com.pesquisamercado.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import br.com.pesquisamercado.modelo.Idade;

public class TesteIdade {

	public static void main(String[] args) throws ParseException {

		Idade idade = new Idade();
		Scanner scanner = new Scanner(System.in);
		String dataNascimento;
		System.out.println("Digite a data de Nascimento: ");
		dataNascimento = scanner.next();
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
		int idade1 = idade.calcularIdade(date);
		System.out.println("Idade: " + idade1 + " anos");
	}
}
