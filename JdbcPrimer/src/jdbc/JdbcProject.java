package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import controller.MetodeJdbc;
import model.Kurs;

public class JdbcProject {

	public static void main(String[] args) {

		MetodeJdbc metode = new MetodeJdbc();
		
		Kurs k = metode.vratiKursPoId(3);
		
		System.out.println("id: " + k.getIdKursa());
		System.out.println("ime: " + k.getImeKursa());
		System.out.println("cena: " + k.getCena());
		
		

		
		}
		
	}

