public class FizzBuzzGenerator {

    public String getFizzBuzz(int num) {
            String output = "";
            if ((num % 3 == 0) && (num % 5 == 0)) output = "FizzBuzz";
            if (num % 3 == 0) output = "Fizz";
            if (num % 5 == 0) output = "Buzz";
            return output;
        }
    }
