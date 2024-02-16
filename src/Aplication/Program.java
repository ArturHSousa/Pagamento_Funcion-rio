package Aplication;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;


import entts.Employee;
import entts.OutsourcedEmployee;

public class Program {

  
    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
try {
    System.out.print("Número de Funcionários(a): ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        System.out.println("Funcionário(a) #" + i + " data:");
        System.out.print("Terceirizado? (S/N)? ");
        char ch = sc.next().charAt(0);
        System.out.print("Nome: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Horas de trabalho: ");
        int hours = sc.nextInt();
        System.out.print("Cobrado por Hora: ");
        double valuePerHour = sc.nextDouble();
        if (ch == 'S') {
            System.out.print("Cobrança adicional: ");
            double additionalCharge = sc.nextDouble();
            list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
        }
        if (ch == 's') {
            System.out.print("Cobrança adicional: ");
            double additionalCharge = sc.nextDouble();
            list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
        } else {
            list.add(new Employee(name, hours, valuePerHour));
        }
    }
    System.out.println();
    System.out.println("Pagamento:");
    for (Employee emp : list) {
        System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
    }
    sc.close();
}
    catch (InputMismatchException e) {
        System.out.println("Digite apenas LETRAS e NÙMEROS, não use caracteres especiais");
        }
    }
}

