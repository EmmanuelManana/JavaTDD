package co.za.emanana.incubayte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public static void main(String[] args) {
        String testInput = "-5, 8, 0";
        Add(testInput);
    }


    public static int Add(String numbers){

        if (numbers.contains("-")){
            String[] numbersArray = new String[numbers.split(",").length];
            numbersArray = numbers.split(",");
            List getNegatives = new ArrayList();
            for (String item : numbersArray){
                int currentNumber = Integer.parseInt(item.trim());

                if (currentNumber < 0){
                    getNegatives.add(currentNumber);
                }

            }
            throw new RuntimeException("negatives note allowed , negatives found :" +  getNegatives);
        }
        else if (numbers.contains(";")){
            return numbers.split(";").length;
        }
        else if (numbers.contains("\n")){
           numbers =  numbers.replaceAll("\n", ",,");
        }


        return numbers.length();
    }
}
