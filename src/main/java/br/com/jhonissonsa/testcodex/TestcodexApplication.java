package br.com.jhonissonsa.testcodex;

import br.com.jhonissonsa.testcodex.exercises.Exercise1;
import br.com.jhonissonsa.testcodex.exercises.Exercise2;
import br.com.jhonissonsa.testcodex.exercises.Exercise4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TestcodexApplication {

	public static void main(String[] args) {
		exercise1();
		exercise2();
		exercise4();

		SpringApplication.run(TestcodexApplication.class, args);
	}

	private static void exercise1() {
		String value = "00.000.000/0000-00";
		String value2 = "01196056000126";
		String value3 = "11156056000126";
		String value4 = "74.245.163/0001-70";
		String value5 = "55555555555555";
		String value6 = "0119605600";

		List<String> cnpjList = List.of(
				value, value2, value3,
				value4, value5, value6
		);
		Exercise1 cnpj = new Exercise1();

		for (String c : cnpjList) {
			if (cnpj.validate(c)) {
				System.out.println("CNPJ VALIDO!");
			} else {
				System.out.println("CNPJ INVALIDO!");
			}
		}

		System.out.println("===========================================");

		for (String c : cnpjList) {
			cnpj = new Exercise1(c);
			if (cnpj.getValue() != null) {
				System.out.println("CNPJ VALIDO!");
			} else {
				System.out.println("CNPJ INVALIDO!");
			}
		}
	}

	private static void exercise2() {
		Exercise2 tri = new Exercise2();
		Exercise2.Rectangle a = new Exercise2.Rectangle(3,5,11,11);
		Exercise2.Rectangle b = new Exercise2.Rectangle(7,2,13,7);
		Exercise2.Rectangle c = new Exercise2.Rectangle(11,11,15,13);


		System.out.println(tri.intersects(a,b));
		System.out.println(tri.intersects(a,c));
		System.out.println(tri.intersects(b,c));
	}

	private static void exercise4() {
		Exercise4 todo = new Exercise4("Exercicio 4");

		todo.createTask("1 task");
		todo.createTask("2 task");
		todo.createTask("3 task");
		todo.createTask("4 task");
		todo.createTask("5 task");
		todo.removeTask("3 task");
		todo.createTask("6 task");

		todo.removeTask("5 task");
	}

}
