package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.MetodeJdbc;
import model.Kurs;
import model.User;

public class JdbcProject {

	public static void main(String[] args) {

		MetodeJdbc metode = new MetodeJdbc();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesite username: ");
		
		String userName = scanner.nextLine();
		
		int id = metode.vratiIdPoUsername(userName);
		
		List<String> listaBrojevaTelefona = new ArrayList<String>();
		if(id != 0) {
			listaBrojevaTelefona = metode.vratiBrojTelefona(id);
			
			for (String s : listaBrojevaTelefona) {
				System.out.println(s);
			}
		}else {
			System.out.println("Nepostojeci user!");
		}
		
		
		
			
		}

		}

		
		
	

