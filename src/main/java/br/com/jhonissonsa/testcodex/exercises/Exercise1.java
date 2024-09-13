package br.com.jhonissonsa.testcodex.exercises;

import java.util.regex.Pattern;

/**
 * 1) Validate CNPJ format and check digits
 * Faz a validação do cnpj
 *
 * */
public class Exercise1 {

    private String value;

    public Exercise1() {
    }

    public Exercise1(String value) {
        this.value = validate(value) ? value : null;
    }

    public String getValue() {
        return value;
    }

    public boolean validate(String cnpj) {
        if (formatted(cnpj) || numbersOnly(cnpj)) {

            String cnpjCleaned = cnpj.replaceAll("\\D", "");

            if (invalidCNPJ(cnpjCleaned)) {
                return false;
            }
            return digitVerify(cnpjCleaned);
        }
        return false;
    }

    private boolean invalidCNPJ(String cnpj) {
        return cnpj.matches("^(\\d)\\1*$");
    }

    private boolean formatted(String cnpj) {
        String regex = "\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(cnpj).matches();
    }

    private boolean numbersOnly(String cnpj) {
        String regex = "\\d{14}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(cnpj).matches();
    }

    private boolean digitVerify(String cnpj) {
        if (firstDigit(cnpj)) {
            return secondDigit(cnpj);
        }
        return false;
    }

    private boolean firstDigit(String cnpj) {
        int[] firstVerify = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = Character.getNumericValue(cnpj.charAt(i));
            sum += digit * firstVerify[i];
        }
        int firstDigit = (sum % 11 < 2) ? 0 : 11 - (sum % 11);

        return firstDigit == Character.getNumericValue(cnpj.charAt(12));
    }

    private boolean secondDigit(String cnpj) {
        int[] secondVerify = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        int sum = 0;
        for (int i = 0; i < 13; i++) {
            int digit = Character.getNumericValue(cnpj.charAt(i));
            sum += digit * secondVerify[i];
        }
        int secondDigit = (sum % 11 < 2) ? 0 : 11 - (sum % 11);

        return secondDigit == Character.getNumericValue(cnpj.charAt(13));
    }
}
