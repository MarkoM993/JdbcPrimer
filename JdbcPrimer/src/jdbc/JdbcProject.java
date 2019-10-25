package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import controller.MetodeJdbc;
import model.Kurs;
import model.User;

public class JdbcProject {

	public static void main(String[] args) {

		MetodeJdbc metode = new MetodeJdbc();
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite id usera:");
		int id = Integer.parseInt(scanner.nextLine());*/
		/*Kurs k = metode.vratiKursPoId(3);
		
		System.out.println("id: " + k.getIdKursa());
		System.out.println("ime: " + k.getImeKursa());
		System.out.println("cena: " + k.getCena());*/

		/*User user = metode.vratiUseraPoId(id);
		
		if(user.getIdUser() != 0) {
			System.out.println("ID:" + user.getIdUser());
			System.out.println("USERNAME:" + user.getUsername());
			System.out.println("PASSWORD:" + user.getPassword());
			System.out.println("MATBR:" + user.getMaticniBr());
		}else {
			System.out.println("Ne postoji taj user!");

		}*/

		List<User> listaUsera = metode.vratiSveUsere();
		
		for(User u : listaUsera) {
			System.out.println("ID:" + u.getIdUser());
			System.out.println("USERNAME:" + u.getUsername());
			System.out.println("PASSWORD:" + u.getPassword());
			System.out.println("MATBR:" + u.getMaticniBr());
		}

		}
		
	}

