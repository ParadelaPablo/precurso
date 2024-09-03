package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double charge = 0.25; // Tarifa por minuto de exceso
    static double taxRate = 0.15; // 15% de impuesto

    public static void main(String args[]) {

        // Datos que le pido al usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el precio del plan: ");
        double plan = scanner.nextDouble();

        System.out.println("Ingresar los minutos: ");
        double minutos = scanner.nextDouble();

        scanner.close();

        double overageCharge = overageFees(minutos);
        double overageChargeTax = calculateTax(overageCharge);
        double total = calculateTotal(plan, overageCharge, overageChargeTax);  // Aquí se usa overageChargeTax

        System.out.println("Tarifa por exceso: $" + overageCharge);
        System.out.println("Impuesto sobre la tarifa por exceso: $" + overageChargeTax);
        System.out.println("Costo total: $" + total);
    }

    // Método para calcular la tarifa por exceso
    public static double overageFees(double minutos) {
        double overage = charge * minutos;
        return overage;
    }

    // Método para calcular el impuesto sobre la tarifa por exceso
    public static double calculateTax(double overageCharge) {
        return overageCharge * taxRate;
    }

    // Método para calcular el total final
    public static double calculateTotal(double plan, double overageCharge, double overageChargeTax) {  // Aquí también overageChargeTax
        return plan + overageCharge + overageChargeTax;
    }
}
