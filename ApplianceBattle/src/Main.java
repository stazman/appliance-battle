import java.util.*;

public class Main  {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What is your Name: ");
    String name = scanner.nextLine();
    System.out.println("Hi " + name);

    System.out.println("You are in the kitchen when one of the appliances starts malfunctioning.");

  try { 

    Thread.sleep(2000);

  } catch(InterruptedException ex) {

    Thread.currentThread().interrupt();       
  
  }

  Appliance appliance = getRandomAppliance();
 
  System.out.println("The appliance is a... " + appliance.name + " with " + appliance.weapon + "!");
    
  int playerPower = 3;

  try { 

    Thread.sleep(2000);

  } catch(InterruptedException ex) {

    Thread.currentThread().interrupt(); 

  }
    
  while (appliance.hitPoints > 0){
    System.out.println("Type in random text to hit the " + appliance.name + "...");

  try { 

    Thread.sleep(2000);

  } catch(InterruptedException ex) {

    Thread.currentThread().interrupt(); 
     
  }

    appliance.hitPoints -= playerPower;
  
  if(appliance.hitPoints > 0){
    System.out.println("The " + appliance.name + " now has " + appliance.hitPoints + " hit points remaining.");
     }
      else{
        System.out.println("The " + appliance.name + " has now been defeated! You're a hero, " + name + "!");
      }
    }
    
    scanner.close();
  }

  public static Appliance getRandomAppliance(){
     int random = (int)(Math.random() * 5 + 1);
     Appliance ranAppliance = null;
     switch (random) {
      case 1:
      ranAppliance = new Oven();
      break;

      case 2:
      ranAppliance = new Blender();
      break;

      case 3:
      ranAppliance = new Microwave();
      break;

      case 4:
      ranAppliance = new Vacuum();
      break;

      default:        
      ranAppliance = new Toaster();
      break;
  
    }
    return ranAppliance;
  }
}