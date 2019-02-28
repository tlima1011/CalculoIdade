package br.com.pesquisamercado.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Idade {

	private int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int calcularIdade(Date dataNascimento) {
		System.out.println(dataNascimento);
		GregorianCalendar dataHoje = new GregorianCalendar();
		int diaAtual = 0, mesAtual = 0, anoAtual = 0; 
		diaAtual = dataHoje.get(Calendar.DAY_OF_MONTH);
		mesAtual = dataHoje.get(Calendar.MONTH) + 1;
		anoAtual = dataHoje.get(Calendar.YEAR);
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		String dtNasc = formatador.format(dataNascimento);
		System.out.println("Data de Aniversario: " + dtNasc);
		System.out.println("Data de Hoje: " + diaAtual + "/" + mesAtual + "/" + anoAtual);
		String diaNasc = dtNasc.substring(0, 2);
		String mesNasc = dtNasc.substring(3, 5);
		String anoNasc = dtNasc.substring(6, 10);
		System.out.println("Dia Nascimento: " + diaNasc);
		System.out.println("Mes Nascimento: " + mesNasc);
		System.out.println("Ano Nascimento: " + anoNasc);
		int diaNascimento = Integer.parseInt(diaNasc);
		int mesNascimento = Integer.parseInt(mesNasc);
		int anoNascimento = Integer.parseInt(anoNasc);
		idade = anoAtual - anoNascimento;
		if (mesAtual < mesNascimento) {
			idade--;
		} else if(diaAtual < diaNascimento){
			idade--;
		}
		return idade;
	}
}
