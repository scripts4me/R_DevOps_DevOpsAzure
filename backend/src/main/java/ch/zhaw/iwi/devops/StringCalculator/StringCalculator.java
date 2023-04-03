package ch.zhaw.iwi.devops.StringCalculator;


// StringCalculator.java aus https://github.com/scripts4me/R_DevOps_TDD

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == "") {
            return 0;
        } else {

            String numbersWithoutSpace = numbers.replaceAll(" ", "");
            Boolean OnlyAllowedDelimeter = numbersWithoutSpace.matches("^[0-9,-]*$");

            if (!OnlyAllowedDelimeter) {
                throw new IllegalArgumentException(String.format("Nur Kommas sind als Trennzeichen erlaubt."));
            }
            String CleanedNumbersWithoutSpace = numbersWithoutSpace.replaceAll(",,", ",");

            String[] submittedNumbers = CleanedNumbersWithoutSpace.split(",");

            Integer MaxAmountOfNumbers = submittedNumbers.length;
            if (MaxAmountOfNumbers > 5) {
                throw new IllegalArgumentException(String.format("Es sind nur maximal 5 Nummern erlaubt."));
            }

            int finalResult = calculateSum(submittedNumbers);
            return finalResult;
        }
    }

    private int calculateSum(String[] inputSplittedByDelimiter) {
        int result = 0;
        for (String token : inputSplittedByDelimiter) {
            result += addSingleToken(token);
        }
        return result;
    }

    private int addSingleToken(String token) {
        Integer valueAsInteger = Integer.parseInt(token);

        if (valueAsInteger > 1000) {
            valueAsInteger = 0;
        }

        if (valueAsInteger < -1000) {
            valueAsInteger = 0;
        }

        return valueAsInteger;

    }

}
