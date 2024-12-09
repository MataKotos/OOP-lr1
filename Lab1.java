import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab1
{
public static void main(String[] args)
{
 
 //Ввести n строк с консоли. Вывести на консоль те строки, 
 //длина которых меньше средней, также их длины.
 
int n = 0;
while ( true ) // ввод числа строк
{
System.out.println("Введите число строк");
Scanner sc1 = new Scanner(System. in );
try
{
n = sc1.nextInt();
break;
}
catch(InputMismatchException fg)
{
// если введенное значение не является числом
System.out.print("Вы ввели не число. " );
}
}
// создание массива строк
String[] str = new String[n];
Scanner sc2 = new Scanner(System.in);
for (int i = 0; i < n; i++)
{
System. out.println( " Введите строку №" + (i+1));
str[i] = sc2.nextLine();
}
 
//поиск средней длины строки
int sum = 0;
for ( int i = 0; i < str.length; i++)
{
sum = sum + str[i].length();
}
 
double mid = sum/n;
 
System.out.println( " Сумма длин всех строк: " + sum );
System.out.println( " Средняя длина " + mid );
 
//вывод только тех, длина которых меньше средней
 
System.out.println("Строки, длины которых меньше средней и их длины." );
for ( int i = 0; i < str.length; i++)
{
if (str[i].length()<mid)
{
 System.out.println( "Строка: " + str[i] + "             Её длина: " + str[i].length() );
}
 
}
}
}
