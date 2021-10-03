import java.util.*;
public class palstr
{
public static void main(String args[])
{
String s1, s2="", s3="";
Scanner sc = new Scanner(System.in);
System.out.println(" Enter : ");
s1 = sc.nextLine();
s1 = s1 + " ";
for (int i=0; i<s1.length(); i++)
{
if (s1.charAt(i)!=' ')
{
 s2 = s2+s1.charAt(i);
 s3= s1.charAt(i)+ s3;
}
else
{
if(s2.equals(s3))
System.out.println(s2);
s2="";
s3="";
}
}
}
}
