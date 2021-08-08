package co.za.emanana.incubayte;

public class StringCalculator {

    public int Add(String numbers){
        if (numbers.contains(";")){
            return numbers.split(";").length;
        }
        else if (numbers.contains("\n")){
           numbers =  numbers.replaceAll("\n", ",,");
        }

        return numbers.length();
    }
}
