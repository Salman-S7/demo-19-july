package com.example.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Member obj = new Member();
        Library lib = new Library();
        List<Member> l1 = new ArrayList();
        Scanner sc = new Scanner(System.in);
    for(int i = 0; i<3; i++) {
        System.out.println("Enter Your Choice");
        System.out.println("1.Add Member\n" +
                "2.View All Members\n" +
                "3.Search Member by address\n" +
                "4.Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the id:");
                int id = sc.nextInt();
                System.out.println("Enter the name:");
                String name = sc.next();
                System.out.println("Enter the address:");
                String address = sc.next();
                //  l1.add(new Member(id,name,address));
                lib.addMember(new Member(id, name, address));
                System.out.println("Member added succesfully");

                //  lib.setL(l1);
                break;
            case 2:
                System.out.println("Here are all members");
                Iterator itr = lib.viewAllMembers().iterator();
                while ( itr.hasNext()){
                    obj = (Member) itr.next();
                    System.out.println(obj.getAddress()+"  "+obj.getMemberaName()+"   "+obj.getMembreId());
                }
                System.out.println(lib.viewAllMembers().toString());
                break;
            case 3:
                System.out.println("enter address to search");
                String ad = sc.next();
                List<Member> l7 = lib.viewMembersByAddress(ad);
                Iterator itr1 = l7.listIterator();

                while (itr1.hasNext()){
                    obj = (Member) itr1.next();
                 //   System.out.println(obj.toString());
                    System.out.println(obj.getAddress()+"  "+obj.getMemberaName()+"   "+obj.getMembreId());
                }
                //System.out.println(lib.viewMembersByAddress(ad));

                break;
            case 4:
                System.exit(0);
                break;
            default:

        }
    }


    }
}


/*1.Add Member
2.View All Members
3.Search Member by address
4.Exit

Enter the id:
123
Enter the name:
sudha
Enter the address:*/