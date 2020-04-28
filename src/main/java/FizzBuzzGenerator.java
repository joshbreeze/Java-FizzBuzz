public class FizzBuzzGenerator {

    public String getFizzBuzz(int num) {
            String output = "";
            if ((num % 3 == 0) && (num % 5 == 0)) output = "FizzBuzz";
            else if (num % 3 == 0) output = "Fizz";
            else if (num % 5 == 0) output = "Buzz";
            else if (output == "") output = String.valueOf(num);
            return output;
        }
    }
