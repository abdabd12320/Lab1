import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        //Ex1:
        System.out.print("Please enter first number: ");
        int f_number = in.nextInt();
        System.out.print("Please enter second number: ");
        int s_number = in.nextInt();

        System.out.println(f_number + " + " + s_number + " = " + (f_number+s_number));
        System.out.println(f_number + " - " + s_number + " = " + (f_number-s_number));
        System.out.println(f_number + " * " + s_number + " = " + (f_number*s_number));
        System.out.println(f_number + " / " + s_number + " = " + (f_number/s_number));
        System.out.println(f_number + " mod " + s_number + " = " + (f_number%s_number));
        System.out.println("-------------------");
        //Ex2:
        System.out.print("Please enter your number: ");
        int number = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number*i));
        }
        System.out.println("-------------------");
        //Ex3:
        System.out.print("Enter the radius: ");
        double radius = in.nextDouble();
        System.out.println("Perimeter is = " + (2*3.14*radius));
        System.out.println("Area is = " + (3.14*radius*radius));
        System.out.println("-------------------");
        //Ex4:
        System.out.print("Enter the count of numbers: ");
        int count = in.nextInt();
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            sum += in.nextInt();
        }
        sum = sum / count;
        System.out.println("The average is: " + sum);
        System.out.println("-------------------");
        //Ex5:
        System.out.print("Please enter first number: ");
        int first_number = in.nextInt();
        System.out.print("Please enter second number: ");
        int second_number = in.nextInt();
        System.out.print("Please enter third number: ");
        int third_number = in.nextInt();
        if(first_number + second_number == third_number)
        {
            System.out.println("The result is: " + true);
        }
        else System.out.println("The result is: " + false);
        System.out.println("-------------------");
        //Ex6:

        System.out.print("input a word: ");
        in.nextLine();
        String word = in.nextLine();
        String reverse = "";
        for(int i=word.length()-1;i>=0;i--)
        {
            reverse += word.charAt(i);
        }
        System.out.println("Reversed word : " + reverse);
        System.out.println("-------------------");
        //Ex7:
        System.out.print("Enter a number: ");
        int number2 = in.nextInt();
        System.out.println((number2 % 2 == 0)?"The number is Even":"The number is Odd");
        System.out.println("-------------------");
        //Ex8:
        System.out.print("Enter the temperature in Centigrade: ");
        double temp_centigrade = in.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + ((temp_centigrade * 1.8) + 32));
        System.out.println("-------------------");
        //Ex9:
        System.out.print("input a string: ");
        in.nextLine();
        String sentence = in.nextLine();
        System.out.print("input a number: ");
        int number3 = in.nextInt();
        System.out.println(sentence.charAt(number3));
        System.out.println("-------------------");
        //Ex10:
        System.out.print("Enter Width: ");
        double width = in.nextDouble();
        System.out.print("Enter Height: ");
        double height = in.nextDouble();
        System.out.println("Area is " + width + " * " + height +" = " + (width*height));
        System.out.println("Perimeter is 2 * (" + width + " + " + height +") = " + (2*(width+height)));
        System.out.println("-------------------");
        //Ex11:
        System.out.print("input first number: ");
        int fir_num = in.nextInt();
        System.out.print("input second number: ");
        int seco_num = in.nextInt();
        if(fir_num == seco_num)
        {
            System.out.println(fir_num + " == " + seco_num);
        }
        else
        {
            System.out.println(fir_num + " != " + seco_num);
            if(fir_num > seco_num)
            {
                System.out.println(fir_num + " > " + seco_num);
                System.out.println(fir_num + " >= " + seco_num);
            }
            else
            {
                System.out.println(fir_num + " < " + seco_num);
                System.out.println(fir_num + " <= " + seco_num);
            }
        }
        System.out.println("-------------------");
        //Ex12

        System.out.print("input seconds: ");
        int seconds = in.nextInt();
        System.out.printf("%d:%d:%d%n",((seconds/60)/60),((seconds/60)%60),(seconds%60));

        System.out.println("-------------------");
        //Ex13
        System.out.print("input first number: ");
        int f_n = in.nextInt();
        System.out.print("input second number: ");
        int s_n = in.nextInt();
        System.out.print("input third number: ");
        int th_n = in.nextInt();
        System.out.print("input fourth number: ");
        int four_n = in.nextInt();

        if(f_n == s_n && f_n == th_n && f_n == four_n)
        {
            System.out.println("Numbers are equal");
        }
        else System.out.println("Numbers are not equal");

        System.out.println("-------------------");
        //Ex14
        System.out.print("Enter a number: ");
        int a_number = in.nextInt();
        if(a_number > 0) System.out.println("Number is positive");
        else if(a_number < 0) System.out.println("Number is negative");
        else System.out.println("Number equal zero");

        System.out.println("-------------------");
        //Ex15
        int test,positive = 0,negative = 0,zero = 0;
        do {
            System.out.print("Enter the numbers: ");
            test = in.nextInt();
            if(test == -1) break;
            else if(test > 0) positive++;
            else if (test < 0) negative++;
            else zero++;
        }while(true);
        System.out.println(positive + " Positives");
        System.out.println(negative + " Negatives");
        System.out.println(zero + " Zero");

        System.out.println("-------------------");
        //Ex16

        System.out.print("Enter a number: ");
        int i_number = in.nextInt();
        int rev_num = 0;
        int hint = 0;
        while (i_number != 0)
        {
            hint = i_number % 10;
            rev_num = rev_num * 10 + hint;
            i_number /= 10;
        }
        System.out.println(rev_num);

        System.out.println("-------------------");
        //Ex17
        int the_num;
        System.out.print("Enter count: ");
        int coun = in.nextInt();
        System.out.print("Enter the number: ");
        the_num = in.nextInt();
        int large = the_num,small = the_num;
        for (int i = 1; i <= coun; i++) {
            if(the_num > large)
            {
                large = the_num;
            }
            else if(the_num < small)
            {
                small = the_num;
            }

            if(coun != i) {
                System.out.print("Enter the number: ");
                the_num = in.nextInt();
            }
        }
        System.out.println("The large number = " + large);
        System.out.println("The small number = " + small);

        System.out.println("-------------------");
        //Ex18
        int count_a = 0;
        System.out.print("Enter string: ");
        in.nextLine();
        String sentence2 = in.nextLine();
        for(int i = 0;i <= sentence2.length()-1;i++)
        {
            if(sentence2.charAt(i) == 'a')
            {
                count_a++;
            }
        }
        System.out.println("Number of a's: " + count_a);
    }
}