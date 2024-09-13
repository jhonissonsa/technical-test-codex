package br.com.jhonissonsa.testcodex.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * 4) Simple Todo_List
 * Este exercício remove e adiciona tarefas enquanto persiste os dados
 *
 */
public class Exercise4 {

    private File file;

    public Exercise4(String fileName) {
        this.file = createFile(fileName);
    }

    private File createFile(String fileName) {
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("Arquivo já existe!");
            }
            return file;
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo." + e.getMessage());
            return null;
        }
    }

    public void createTask(String task) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(task);
            fileWriter.append("\n");
            System.out.println("Task adicionada!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar task. " + e.getMessage());
        }
    }

    public void removeTask(String task) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            List<String> taskList = bufferedReader.lines().toList();
            clearFile();

            for (String t : taskList) {
                if (!t.equals(task)) {
                    createTask(t);
                }
            }
        } catch (Exception e) {
            System.out.println("ERRO");
        }
    }

    private void clearFile() {
        try (FileWriter fileWriter = new FileWriter(file)) {
            System.out.println("Arquivo limpo!");
        } catch (IOException e) {
            System.out.println("Não foi possivel limpar o  arquivo.");
        }
    }

    public void deleteFile() {
        if (file.delete()) {
            System.out.println("Arquivo deletado com sucesso");
        } else {
            System.out.println("Nao foi possivel deletar o arquivo.");
        }
    }
}
