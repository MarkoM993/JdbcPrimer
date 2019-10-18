package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import controller.MetodeJdbc;

public class JdbcProject {

	public static void main(String[] args) {

		MetodeJdbc metode = new MetodeJdbc();
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Unesite ime kursa?");
		String imeKursa = scanner.nextLine();
		
		System.out.println("Unesite cenu?");
		String cenaUnos = scanner.nextLine();
		int cena = Integer.parseInt(cenaUnos);
		scanner.close();
		
		metode.izmeniCenuKursa(imeKursa, cena);

		
		}
		
	}

