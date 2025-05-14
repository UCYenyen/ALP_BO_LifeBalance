package logic;
import java.util.*;

import model.*;

public class Menu {
    private Scanner s = new Scanner(System.in);

    private void PrintDefaultMenu(){
        System.out.println("Welcome to BalnceMyLife!");
        System.out.println("1. Play");
        System.out.println("2. Exit");
    }
    private void PrintMainMenu(){
        System.out.println("Activities");
        System.out.println("1. Physical Activity");
        System.out.println("2. Mental Activity");
        System.out.println("3. Spiritual Activity");
        System.out.println("4. Exit");
    }    
    private void PrintPhysicalMenu(){
        System.out.println("Physical Activities");
        System.out.println("1. Run");
        System.out.println("2. Walk");
        System.out.println("3. Swim");
        System.out.println("4. Back");
    }
    private void PrintMentalMenu(){
        System.out.println("Mental Activities");
        System.out.println("1. Read");
        System.out.println("2. Write");
        System.out.println("3. Listen to Music");
        System.out.println("4. Back");
    }
    private void PrintSpiritualMenu(){
        System.out.println("Spiritual Activities");
        System.out.println("1. Meditate");
        System.out.println("2. Pray");
        System.out.println("3. Back");
    }
}