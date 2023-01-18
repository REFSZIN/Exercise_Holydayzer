package application;

import application.entities.Holyday;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Holyday holydays = new Holyday();

        System.out.print("Informe uma data: ");
        String date = sc.nextLine();

        System.out.println(holydays.isHolyday(date));
    }
}
