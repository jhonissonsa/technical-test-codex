package br.com.jhonissonsa.testcodex;

import br.com.jhonissonsa.testcodex.exercises.CNPJ;
import br.com.jhonissonsa.testcodex.exercises.TodoList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        exercise1();
        exercise4();
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
        CNPJ cnpj = new CNPJ();

        for (String c : cnpjList) {
            if (cnpj.validate(c)) {
                System.out.println("CNPJ VALIDO!");
            } else {
                System.out.println("CNPJ INVALIDO!");
            }
        }

        System.out.println("===========================================");

        for (String c : cnpjList) {
            cnpj = new CNPJ(c);
            if (cnpj.getValue() != null) {
                System.out.println("CNPJ VALIDO!");
            } else {
                System.out.println("CNPJ INVALIDO!");
            }
        }
    }


    private static void exercise4() {
        TodoList todo = new TodoList("Exercicio 4");

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
