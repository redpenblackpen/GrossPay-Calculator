import java.util.Scanner; 

public class GrossPayCalculator {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
     String name;
     int overtime;
     char a;
     double salary, rate_per_hour, hours_worked, basic_pay, overtime_pay;
     
     System.out.print("Employee name: ");
     name = input.nextLine();
     
     System.out.print("Press F if Full Time or Press P if Part Time: ");
     a = input.next().charAt(0);
     
     switch(a){
         
         case 'f':
             System.out.println("--- Full Time Employee ---");
             System.out.print("Enter Basic Pay: ");
             salary = input.nextDouble();
            
             System.out.println("_________________________________");
             System.out.println("Employee Name: " + name);
             System.out.println("Basic Pay: " + salary);
             
             System.out.println("_________________________________");
             System.out.println("Gross Pay: " + salary);
             break;
             
             case 'p':
             System.out.println("--- Part Time Employee ---");
             System.out.print("Enter rate per hour: ");
             rate_per_hour = input.nextDouble();
             System.out.print("Enter no. of hours worked: ");
             hours_worked = input.nextDouble();
             System.out.print("Enter no. of overtime: ");
             overtime = input.nextInt();
             
             System.out.println("_________________________________");
             System.out.println("Employee name: " + name);
             System.out.println("Basic Pay: " + hours_worked * rate_per_hour);
             System.out.println("Overtime Pay: " + overtime * (rate_per_hour*1.25));
             
             System.out.println("_________________________________");
             
             overtime_pay = hours_worked * rate_per_hour; 
             basic_pay = overtime * (rate_per_hour*1.25);
            
             System.out.println("Grosspay: " + (overtime_pay + basic_pay));
             break;
            
             default:
                 System.out.println("invalid command!");
    }
  }
}