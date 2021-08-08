package co.za.emanana.incubayte;

public class StringCalculator {

//    public static void main(String[] args) {
//        Add("1\n2,3");
//    }


    public  int Add(String numbers){

        if (numbers.contains("\n")){
           numbers =  numbers.replaceAll("\n", ",,");
        }

        return numbers.length();
    }
}
