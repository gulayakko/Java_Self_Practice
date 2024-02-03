package day10_practice_tasks;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        String digits = "",
                letters = "",
                speacialChars = "";

        for (char each : str.toCharArray()){

            if (Character.isDigit(each)){
                digits += each;
            } else if (Character.isLetter(each)) {
                letters+= each;
            }else {
                speacialChars +=each;
            }

            System.out.println("Letters = "+ letters);
            System.out.println("Digits= " + digits);
            System.out.println("specialChars = " + speacialChars);


        }


    }

}
