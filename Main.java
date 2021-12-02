package com.Torryharris.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<product> plist = new ArrayList<>();
    public static void main(String[] args) {
        product p1 = new product(1, "soap", 1, 50);
        product p2 = new product(2, "Shampoo", 1, 80);
        product p3 = new product(3, "pencil", 1, 30);
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        while (true) {
        System.out.println("1.search 2.display 3.edit 4.remove 5.exit");
        System.out.println("enter the choice");
        int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    search();
                    break;
                case 2:
                    System.out.println(plist);
                    break;
                case 3:edit();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    System.exit(0);
            }

        }

    }

    public static void search() {
        product p;
        System.out.println("enter the item to be searched");
        String pro = sc.next();
        for(int i=0;i<plist.size();i++){
            p=plist.get(i);
            if(pro.equals(p.name)){
                System.out.println("item exists");
            }
            else System.out.printf("Item does not exist");
        }

    }
    public static void edit(){
        product p;
        System.out.println("enter the serial no  to edit");
        int s_no=sc.nextInt();
        System.out.println("enter the price");
        int price=sc.nextInt();
        for(int i=0;i<plist.size();i++){
            p=plist.get(i);
            if(s_no==p.sr_no){
                p.setPrice(price);
            }
        }
    }
    public static void remove(){
        product p;
        System.out.println("enter the serial no to remove");
        int s_no=sc.nextInt();
        for(int i=0;i<plist.size();i++){
            p=plist.get(i);
            if(s_no==p.sr_no){
                plist.remove(p);
            }
        }
    }
}
