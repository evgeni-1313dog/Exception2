import java.util.Scanner;

public class first {
    public first() {
        boolean work = true;
        Scanner sc = new Scanner(System.in);

        while(work){
            System.out.print("Введите дробное число: ");
            try{
                float fNumber = Float.parseFloat(sc.next());
                System.out.printf("Введенное число равно %f\n", fNumber);
                work = false;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }

        }
    }
}
