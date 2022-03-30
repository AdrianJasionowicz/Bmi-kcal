package Calculations;

import java.util.Scanner;


public class BmiKcalCalculator {
    
    
  public static void main(String[] args) {
        
        
    Scanner scanner = new Scanner(System.in);

    System.out.println("Cześć ");
    Kcal(); 
    
    
    
    
    
    Bmi();
    
    
    
    
    
    }
    
    public static void Kcal() {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoja Wage: ");
        double bodyWeight = scanner.nextDouble();
        
        System.out.println("Podaj Swoja aktywność: ");
        System.out.println("1,2     - przy pracy siedzącej i braku aktywności fizycznej");
        System.out.println("1,4     - przy pracy siedzącej i niskiej aktywności fizycznej (1-2 treningi w tygodniu)");
        System.out.println("1,6     - przy pracy siedzącej i średniej aktywności fizycznej (3-4 treningi w tygodniu)");
        System.out.println("1,8     - przy pracy fizycznej i średniej aktywnosci fizycznej (3-4 treningi w tygodniu)");
        System.out.println("2,0     - przy bardzo wysokiej aktywności fizycznej (codzienne treningi, sportowcy)");
       
       double activeRate = scanner.nextDouble();
        
        double baseKcalR = bodyWeight * 22;
        
        System.out.println("Twoje podstawowe zapotrzebowanie kaloryczne to: " + baseKcalR);
        
        double activeKcal = baseKcalR * activeRate;
       
        System.out.println("Twoje zapotrzebowanie z uwzglednieniem Aktywnosci to: " + activeKcal);
        
        System.out.println("Ile kilogramow chcesz tracic tygodniowo: ");
        double kgLose = scanner.nextDouble();
        double weightLose = activeKcal - (7000 * kgLose) / 7;
        System.out.println("Twoje Zapotrzebowanie po uwzglednieniu to: " + weightLose);
        
        
    }
    
    public static void Bmi() {
     
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("Podaj swoja Wage: ");
        double bodyWeight = scanner.nextDouble();
     System.out.println("Podaj swoj Wzrost: ");
     double heightCM = scanner.nextDouble();
     
     double heightM = heightCM / 100;
     double bmi = bodyWeight / (heightM * heightM);
    System.out.println("Twoje Bmi to: " + bmi);
    System.out.println("Jakie Bmi chcesz osiagnac: ");
    double urBmi = scanner.nextDouble();
    
    double pWeight = urBmi * (heightM*heightM);
    System.out.println("Twoja Wybrana waga to: " + pWeight);
   
    }
}