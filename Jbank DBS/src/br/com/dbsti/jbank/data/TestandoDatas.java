package br.com.dbsti.jbank.data;

import java.util.Calendar;
import java.util.Date;

import br.com.dbsti.jbank.modelo.Agencia;

public class TestandoDatas {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.DATE, 1);
//		System.out.println(cal);
//		System.out.println(cal.before(Calendar.getInstance()));
		
		
		cal.set(2016, Calendar.JANUARY, 1, 0, 0, 0);
//		System.out.println(cal);
//		System.out.println(cal.before(Calendar.getInstance()));

		
		cal.add(Calendar.DATE, 1);
		cal.add(Calendar.YEAR, -15);
//		System.out.println(cal);
//		System.out.println(cal.before(Calendar.getInstance()));
		
		
		Date hoje = new Date();
		System.out.println(hoje);
		
		Calendar calendarAux = Calendar.getInstance();
		calendarAux.set(2002, Calendar.JUNE, 15);
		
		Date dataFundacao = calendarAux.getTime();
		Agencia agencia = new Agencia();
		agencia.setDataFundacao(dataFundacao);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
