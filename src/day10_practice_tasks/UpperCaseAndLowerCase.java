package day10_practice_tasks;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";

        int upperCount = 0,
                lowerCount = 0;

        for (char letter : str.toCharArray()){

            if (Character.isLetter(letter)){
                if (Character.isUpperCase(letter)){
                    upperCount++;
                }else {
                    lowerCount++;
                }
            }

            System.out.println(upperCount==lowerCount);

        }


    }
}
