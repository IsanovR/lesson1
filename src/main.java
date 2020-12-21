import java.util.Scanner;
     class MainClass {
                        public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Введите число: ");
                        int a = sc.nextInt();
                        a *= 2;
                        System.out.println("Введенное вами число, умноженное на 2, равно " + a);
                        sc.close();
    }
}