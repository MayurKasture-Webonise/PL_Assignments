// Pl 1st Assignment.

import java.util.Scanner;

class String_manipulation
{
    Scanner sc = new Scanner(System.in);
    int i;

    void task()
    {
        System.out.print("Enter Your String : ");
        String str = sc.nextLine();

        System.out.println(str);
        while(str.length() > 1)
        {
            String new_line="";
            for(i=0;i<=str.length()-1; i++)
            {
                new_line = new_line + str.charAt(i);
                i= i+1;
            }
            System.out.println(new_line);
            str = new_line;
        }
    }

    public static void main(String args[])
    {
        String_manipulation obj = new String_manipulation();
        obj.task();
    }
}


//Why We Use This Java Lang?
  //-> 1) I Latestly Working on it. So I'm Confortable with java 
 //    2) Platform Independent. 
//     3) most portable high performance languages
