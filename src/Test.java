import java.util.Scanner;public class Test {    public static void main(String[] args) {        float array[] = new float[3];        for (int i = 0; i < 3; i++) {            System.out.print("Введіть число: ");            Scanner num1 = new Scanner(System.in);            float n = num1.nextFloat();            if (n % 1 != 0) {                array[i] = n;            } else {                System.out.println("Це не дробове число");                i--;            }        }        if (array[0]>= array[1] && array[0] >= array[1]) {            System.out.println("Перше значення найбільше");        } else if (array[1] >= array[0] && array[1] >= array[2]) {            System.out.println("Друге значення найбільше");        } else {            System.out.println("Третє значення найбільше");        }    }}