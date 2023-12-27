import ex.Funcionario;
import ex.OutSourcedFuncionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Work {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced? (y/n)");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Funcionario fun = new OutSourcedFuncionario(name, hours, valuePerHour, additionalCharge);
                list.add(fun);
            }else {
                Funcionario fun = new Funcionario(name, hours, valuePerHour);
                list.add(fun);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");

        for(Funcionario fun : list) {
            System.out.println(fun.getName() + " - $" + String.format("%.2f", fun.payment()));
        }

        sc.close();

    }
}
