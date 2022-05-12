import java.util.Scanner;
public class primary{
public static void main(String []t){
System.out.print("Donner un entier: ");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int cpt=0;
for(int i=1;i<=n;i++)
if(n%i==0)
cpt+=1;
if(cpt==2)
System.out.print(n+" est premier");

else
System.out.print(n+" n'est pas premier");
}
}