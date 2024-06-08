import java.util.Scanner;
import java.lang.Thread;
public class car extends Thread{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println();
        try{
            Thread.sleep(200);
            System.out.println("\t\t\t\t----WELCOME TO THE CMD MOTOVEHICAL----");
            Thread.sleep(200);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();
        System.out.println("Causion (You can only give Car-Key) 3 times only ..... ");
        System.out.println();

        System.out.print("Please enter your Car-Key to switch on the car: ");
        int key = sc.nextInt();
        int key_count = 0;
        try{
            for(int i = 0; i < 3; i++)
        {    
            if(key != 37244){
                Thread.sleep(500);
                System.out.println("Wrong Car-Key !");
                Thread.sleep(500);
                System.out.print("Please enter your Car-Key to switch on the car: ");
                key = sc.nextInt();
            } else {
                key_count ++;
                break;
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();   
        try{
            if(key_count == 1){
                Thread.sleep(200);
                System.out.println("\t\t\t\t----CAR STARTED PLEASE SELECT THE GEAR----");
                Thread.sleep(200);

                EngineGear();
                System.out.println();
                Thread.sleep(200);
                            System.out.println("\t\t\t ----THANKYOU FOR TRAVELING , YOU ARE IN YOIR LOCATION :) ----");
                            Thread.sleep(200);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void EngineGear(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Gear-Shifting level 1: slow, level 2: little fast, level 3: fast, level 4: sports mode, backing-gear: shifting (b) nutral: stay at the place (n).....");
        System.out.println();
        System.out.print("Enter the gear you want to sift: ");

        char gear_shift = sc.next().charAt(0);

        int encrypted = (int) gear_shift;
            try{
                if(encrypted == 49 || encrypted == 50 || encrypted == 51 || encrypted == 52 || encrypted == 110 || encrypted == 98){
                    switch(encrypted){
                            case 49:
                               Thread.sleep(200);
                               System.out.println();
                               System.out.println("\t\t\t-- AUTOVEHICAL IS GOING IN FIRST GEAR --"); 
                               System.out.println();
                               for(int j = 0; j < 5; j++){
                                    System.out.print(j+"KM  -> ");
                                    Thread.sleep(3500);
                               }
                               System.out.println();
                               break;
                        case 50:
                            Thread.sleep(200);
                            System.out.println();
                            System.out.println("\t\t\t-- AUTOVEHICAL IS GOING IN SECOND GEAR --"); 
                            System.out.println();
                            for(int j = 0; j < 5; j++){
                                 System.out.print(j+"KM  -> ");
                                 Thread.sleep(2500);
                            }
                            System.out.println();
                            break;
        
                            case 51:
                            Thread.sleep(200);
                            System.out.println();
                            System.out.println("\t\t\t-- AUTOVEHICAL IS GOING IN THIRD GEAR --"); 
                            System.out.println();
                            for(int j = 0; j < 5; j++){
                                 System.out.print(j+"KM  -> ");
                                 Thread.sleep(1500);
                            }
                            System.out.println();
                            break;
        
                            case 52:
                            Thread.sleep(200);
                            System.out.println();
                            System.out.println("\t\t\t-- AUTOVEHICAL IS GOING IN FOURTH GEAR --"); 
                            System.out.println();
                            for(int j = 0; j < 5; j++){
                                 System.out.print(j+"KM  -> ");
                                 Thread.sleep(900);
                            }
                            System.out.println();
                            break;

                            case 98:
                            Thread.sleep(200);
                            System.out.println();
                            System.out.println("\t\t\t-- AUTOVEHICAL IS IN BACK MODE AND ITS MOVING BACK --");
                            System.out.println();
                            int arr[] = {500 , 400 , 300, 200, 100};
                            for(int j = 0; j < arr.length; j++){
                                System.out.print(arr[j]+"KM  <- ");
                                Thread.sleep(500);
                            }
                            System.out.println();
                            break;
        
                            case 110:
                            Thread.sleep(200);
                            System.out.println();
                            System.out.println("\t\t\t--AUTOVEHICAL IS IN NEUTRAL STATE PLEASE ENTER A GEAR TO MOVE THE CAR--");
                            System.out.println();
                            Thread.sleep(200);
                            try{
                                // for(int i = 0; i < 1; i++){
                                //     System.out.print("Enter the gear you want to sift: ");
                                //     gear_shift = sc.next().charAt(0);
        
                                //     encrypted = (int) gear_shift;    
                                // }
                            }catch(Exception e){
                                System.out.println(e);
                            } finally{
                                Thread.sleep(200);
                                System.out.println();
                                System.out.println("CAUSION ! (PLEASE WEAR YOUR SEATBELT PROPERLY , HAPPY JOUYNEY :) )");
                                System.out.println();
                            }
                            default:
                            System.out.println();
                            System.out.println("Engine failed to start without the gear....");
                            System.out.println();
                    }  
                }
                    else {
                        for(int i = 0; i < 3; i++){
                            System.out.print("Enter the gear you want to sift: ");
                            gear_shift = sc.next().charAt(0);
                        }
                    }
            }catch(Exception e){
                System.out.println(e);
            }
    }
}