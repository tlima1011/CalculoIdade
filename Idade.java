package br.com.testethiago.modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Thiago
 */
public class Idade {

    public String anoNascimento;
    public Date dataNascimento;
    public int anoAtual;
    public int idade;

    public static int calcularIdade(String dataNasc) {

        Calendar calendario = GregorianCalendar.getInstance();

        int diaAtual = calendario.get(Calendar.DAY_OF_MONTH);
        int mesAtual = calendario.get(Calendar.MONTH) + 1;
        int anoAtual = calendario.get(Calendar.YEAR);
        int idade = 0;

        String dia = dataNasc.substring(0, 2);
        String mes = dataNasc.substring(3, 5);
        String ano = dataNasc.substring(6, 10);

        int diaNascimento = Integer.parseInt(dia);
        int mesNascimento = Integer.parseInt(mes);
        int anoNascimento = Integer.parseInt(ano);
        
        idade = anoAtual - anoNascimento;
        if (mesAtual > mesNascimento) {
            idade = anoAtual - anoNascimento;
        } else if(diaAtual >= diaNascimento){
            idade = anoAtual - anoNascimento;
        }else{
            idade--;
        }
        return idade;
    }
}
