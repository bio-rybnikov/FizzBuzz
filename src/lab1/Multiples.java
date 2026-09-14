package lab1;

public class Multiples {
    public static void main(String[] args) {
        countMultiples();
    }

    private static void countMultiples() {
        int threemult = 0;
        int fivemult = 0;
        int i = 1;
        while (i < 1000){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3){
                threemult++;
            } else if (divisibleBy5){
                fivemult++;
            }
            i++;
        }
        int total = threemult + fivemult;
        System.out.println(total);
    }
}
