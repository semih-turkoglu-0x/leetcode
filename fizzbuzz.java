import java.util.ArrayList;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        List<String> toReturn = new ArrayList<>();

        for (int i=1; i <= n ; i++) {

            boolean divisible3 = i % 3 == 0;
            boolean divisible5 = i % 5 == 0;

            if (divisible3 && divisible5) {
                toReturn.add("FizzBuzz");
            } else if (divisible3) {
                toReturn.add("Fizz");
            } else if (divisible5) {
                toReturn.add("Buzz");
            } else {
                toReturn.add(Integer.toString(i));
            }
        }
        return toReturn;
    }
}
