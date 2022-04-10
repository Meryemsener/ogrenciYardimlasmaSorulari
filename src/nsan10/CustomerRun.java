package nsan10;

import java.util.Scanner;

public class CustomerRun {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Otelimize Hos Geldiniz. \n\t=============\n Kac kisilik oda istiyorsunuz");
        Scanner scan=new Scanner(System.in);
        Customer cus=new Customer();
        cus.saveRoom(scan.nextInt());
        String name=scan.next();
        String lName=scan.next();
        int age=scan.nextInt();
        Customer cus1=new Customer(name,lName,age);


    }
}
