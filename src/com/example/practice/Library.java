package com.example.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    List<Member> l = new ArrayList();
    List<Member> l4 = new ArrayList();

    public List<Member> getL() {
        return l;
    }

    public void setL(List<Member> l) {
        this.l = l;
    }
    public void addMember(Member memberObj){
        l.add(memberObj);
    }
   public List<Member> viewAllMembers(){

        return l;
   }
    public List<Member> viewMembersByAddress(String address){
        for(int i =0; i<l.size();i++){
            if(l.get(i).getAddress().equals(address)){
                l4.add(l.get(i));
            }
        }
        return l4;
    }

}


/*
*
* District library wants to store the details about their members.So that it is easy to provide login credentials for those members to access books online. The application should be a menu driven. Develop an application to implement the scenario.
define a class Member with the following private attributes:
• int memberId
• String memberName
• String address
Necessary public getter and setter methods are provided.
A  no argument constructor and a 3 arguments constructor ( memberId, memberName and address) are also provided.
Create a class Library which has an  ArrayList of member as attribute as :
List<Member> memberList = new ArrayList<Member>().
Write the getter and setter.
 Also Library class should have the following methods :
•  public void addMember(Member memberObj)  -  This method should add the memberObj to the memberList.
•  public List<Member> viewAllMembers()  -  This method should return the memberList.
•  public List<Member> viewMembersByAddress(String address)  -  This method should return the list of members who belong to that address.
Create a class Main which has the main method.  In the main function write the code to create the menu and invoke the needed functions based on the choice provided.
Design the UI as shown in the samples below.
Sample Input and Output 1:
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
1
Enter the id:
123
Enter the name:
sudha
Enter the address:
coimbatore
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
1
Enter the id:
124
Enter the name:
kavin
Enter the address:
chennai
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
1
Enter the id:
124
Enter the name:
vivek
Enter the address:
coimbatore
1.Add
2.Display
3.Search by address
4.Exit
Enter your choice:
2
Id:123
Name:sudha
Address:coimbatore
Id:124
Name:kavin
Address:chennai
Id:124
Name:vivek
Address:coimbatore
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
3
Enter the address:
coimbatore
Id:123
Name:sudha
Address:coimbatore
Id:124
Name:vivek
Address:coimbatore
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
4

Sample Input and Output 2:
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
1
Enter the id:
123
Enter the name:
sudha
Enter the address:
coimbatore
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
3
Enter the address:
chennai
None of the member is from chennai
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
4
Sample Input and Output 3:
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
2
The list is empty
1.Add Member
2.View All Members
3.Search Member by address
4.Exit
Enter your choice:
4

2.









A Company wants to automate its payroll process. You have been assigned as the programmer to build this package. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
1. Read Employee details from the User. The details would include id, designation and salary in the given order. The datatype for id is integer, designation is string and salary is integer.
2. You decide to build two hashmaps. The first hashmap contains employee id as key and designation as value, and the second hashmap contains same employee ids as key and salary as value.
3. The company decides to hike the salary of managers by 5000. You decide to write a function increaseSalaries which takes the above hashmaps as input and returns a hashmap with only managers id and their increased salary as output. Include this function in class UserMainCode.


Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps. Call the static method present in UserMainCode.
*
*
*
*
* */
