import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {2.7, 3.6, -4.3, -7.8, 4.1, 5.9, -3.4, 7.4, -54.7, -12.8, 45.2, -34.4, 56.1, 9.7, -66.9, 76.6};
        double num = 0;
        int anotherNum = 0;
        boolean startSumming = false;

        for (double current : numbers) {
            if(startSumming){
                if (current>0){
                    num+=current;
                    anotherNum++;
                }
            } else if (current<0) {
                startSumming=true;
            }
        }
        System.out.println(Arrays.toString(numbers) +  " = " + num + " / " + anotherNum);

        for (int i = 0; i < numbers.length-1; i++) {
            int min = i;

            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]){
                    min=j;
                }
            }


            double index = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = index;

        }

        System.out.println(Arrays.toString(numbers));
    }
}