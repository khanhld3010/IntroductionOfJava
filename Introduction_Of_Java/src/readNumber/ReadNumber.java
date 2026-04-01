package readNumber;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to convert");
        int number = scanner.nextInt();
        String result = "";
        if (number < 10 && number >= 0) {
            result = getSingleDigit(number);
        } else if (number < 20 && number >= 10) {
            result = getTeens(number);
        } else if (number >= 20 && number < 100) {
            result = convertTwoNumber(number);
        } else if (number>= 100 && number <1000) {
            int numberHundred = number/100;
            int twoLastNumber = number % 100;
            if (twoLastNumber == 0){
                result  = getHundred(numberHundred);
            } else if (twoLastNumber < 10) {
                result = getHundred(numberHundred) + " and " + getSingleDigit(twoLastNumber);
            }else if (twoLastNumber <20){
                result = getHundred(numberHundred) + "-"+getTeens(twoLastNumber);
            } else if (twoLastNumber >= 20) {
                result = getHundred(numberHundred) +"-"+  convertTwoNumber(twoLastNumber);
            }
        }
        System.out.println(result);
    }

    //!! Xử lý các số từ 0 đến 9
    static String getSingleDigit(int number) {
        switch (number) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    //! Xử lý riêng khối 10-19 để tránh lỗi "eleventeen"
    static String getTeens(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    //! Xử lý các đầu số hàng chục để tránh lỗi "twelvety" hay "fourty"
    static String getTensPrefix(int number) {
        switch (number) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty"; // Chú ý: forty, không phải fourty
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
    static String getHundred(int number){
        return getSingleDigit(number) + "-hundred";
    }

    static String convertTwoNumber(int number){
        int numberTens = number / 10;
        int numberOnes = number % 10;
        if (numberOnes == 0){
            return getTensPrefix(numberTens);
        }else{
            return getTensPrefix(numberTens) +"-"+ getSingleDigit(numberOnes);
        }
    }
}





