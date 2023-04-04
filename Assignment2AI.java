package PolitticalAssignment;

import java.io.*;
import java.util.Scanner;

public class Assignment2AI {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int democraticPoints = 0;
    int republicanPoints = 0;
    int libertarianPoints = 0;
    int greenPoints = 0;

    System.out.println("----Political Party Guesser!----");
    System.out.println("Answer 15 of the following questions to see which political party your answers align with the most:");

 // Store the points for each party in a file
 try {
    BufferedWriter writer = new BufferedWriter(new FileWriter("democratic.txt"));
    writer.write(Integer.toString(democraticPoints));
    writer.close();

    writer = new BufferedWriter(new FileWriter("republican.txt"));
    writer.write(Integer.toString(republicanPoints));
    writer.close();

    writer = new BufferedWriter(new FileWriter("libertarian.txt"));
    writer.write(Integer.toString(libertarianPoints));
    writer.close();

    writer = new BufferedWriter(new FileWriter("green.txt"));
    writer.write(Integer.toString(greenPoints));
    writer.close();
} catch (IOException e) {
    
    // Question 1
    System.out.println("Which best describes your stance on gun control?");
    System.out.println("A) Ban all firearms");
    System.out.println("B) Regulate firearms more heavily");
    System.out.println("C) Protect Second Amendment rights");
    System.out.println("D) Allow firearms to be carried anywhere");
    String gunControlAnswer = input.nextLine().toUpperCase();

    while (!gunControlAnswer.equals("A") && !gunControlAnswer.equals("B") && !gunControlAnswer.equals("C") && !gunControlAnswer.equals("D")) {
        System.out.println("Invalid input. Please choose A, B, C, or D.");
        gunControlAnswer = input.nextLine().toUpperCase();
    }
    switch (gunControlAnswer.toUpperCase()) {
        case "A":
        democraticPoints += 2;
        greenPoints += 1;
        break;
        case "B":
        greenPoints += 1;
        break;
        case "C":
        republicanPoints += 2;
        libertarianPoints += 1;
        break;
        case "D":
        libertarianPoints += 1;
        break;
        }
    System.out.println("An error occurred while writing to file.");
}
     // Question 2
     System.out.println("How should the government handle immigration?");
     System.out.println("A) Provide amnesty for all undocumented immigrants");
     System.out.println("B) Provide a pathway to citizenship for undocumented immigrants");
     System.out.println("C)Increase border security and enforce immigration laws");
     System.out.println("D) Remove all restrictions on immigration");
     String ImmigrationAnswer = input.nextLine().toUpperCase();
     while (!ImmigrationAnswer.equals("A") && !ImmigrationAnswer.equals("B") && !ImmigrationAnswer.equals("C") && !ImmigrationAnswer.equals("D")) {
        System.out.println("Invalid input. Please choose A, B, C, or D.");
        ImmigrationAnswer = input.nextLine().toUpperCase();
    }

     switch (ImmigrationAnswer.toUpperCase()) {
        case "A":
        democraticPoints += 2;
        greenPoints += 1;
        break;
        case "B":
        democraticPoints += 2;
        greenPoints += 1;
        break;
        case "C":
        republicanPoints += 2;
        break;
        case "D":
        libertarianPoints += 2;
        break;
        default:
        System.out.println("Invalid input. Please choose A, B, C, or D.");
        }

      // Question 3
    System.out.println("What should the government do to address climate change?");
    System.out.println("A) Implement a carbon tax and invest in renewable energy");
    System.out.println("B) Encourage the use of renewable energy through tax credits and subsidies");
    System.out.println("C) Remove all regulations on the energy industry");
    System.out.println("D) Deny that climate change is happening");
    String climateChangeAnswer = input.nextLine().toUpperCase();
    while (!climateChangeAnswer.equals("A") && !climateChangeAnswer.equals("B") && !climateChangeAnswer.equals("C") && !climateChangeAnswer.equals("D")) {
        System.out.println("Invalid input. Please choose A, B, C, or D.");
        climateChangeAnswer = input.nextLine().toUpperCase();
    }

    switch (climateChangeAnswer.toUpperCase()) {
        case "A":
        democraticPoints += 2;
        greenPoints += 1;
        break;
        case "B":
        democraticPoints += 2;
        libertarianPoints += 1;
        break;
        case "C":
        republicanPoints += 2;
        libertarianPoints += 1;
        break;
        case "D":        
        break;
        default:
        System.out.println("Invalid input. Please choose A, B, C, or D.");
        }
        
         // Question 4
    System.out.println("Should the government provide universal healthcare?");
    System.out.println("A) Yes, a single-payer system");
    System.out.println("B) Yes, but allow for private insurance options");
    System.out.println("C) No, healthcare should be privatized");
    System.out.println("D) No, the government should not be involved in healthcare");
    String healthcareAnswer = input.nextLine().toUpperCase();
    while (!healthcareAnswer.equals("A") && !healthcareAnswer.equals("B") && !healthcareAnswer.equals("C") && !healthcareAnswer.equals("D")) {
        System.out.println("Invalid input. Please choose A, B, C, or D.");
        healthcareAnswer = input.nextLine().toUpperCase();
    }
    
    switch(healthcareAnswer.toUpperCase()) {
        case "A":
            democraticPoints += 2;
            greenPoints += 2;
            break;
        case "B":
            democraticPoints += 1;
            greenPoints += 1;
            break;
        case "C":
            republicanPoints += 2;
            libertarianPoints += 1;
            break;
        case "D":
            republicanPoints += 2;
            libertarianPoints += 1;
            break;
        default:
            System.out.println("Invalid input. Please choose A, B, C, or D.");
            break;

    }
// Question 5
System.out.println("What is your stance on abortion?");
System.out.println("A) Ban all abortions");
System.out.println("B) Allow abortions only in cases of rape, incest, or danger to the mother's life");
System.out.println("C) Allow abortions during the first trimester");
System.out.println("D) Allow abortions at any stage of pregnancy");
String abortionAnswer = input.nextLine().toUpperCase();
while (!abortionAnswer.equals("A") && !abortionAnswer.equals("B") && !abortionAnswer.equals("C") && !abortionAnswer.equals("D")) {
    System.out.println("Invalid input. Please choose A, B, C, or D.");
    abortionAnswer = input.nextLine().toUpperCase();
}
switch (abortionAnswer) {
    case "A":
        republicanPoints += 2;
        break;
    case "B":
        republicanPoints += 1;
        break;
    case "C":
        democraticPoints += 1;
        greenPoints += 1;
        break;
    case "D":
        democraticPoints += 2;
        libertarianPoints += 1;
        break;
    default:
        System.out.println("Invalid input. Please choose A, B, C, or D.");
}

// Question 6
System.out.println("What is your stance on same-sex marriage?");
System.out.println("A) Ban same-sex marriage");
System.out.println("B) Allow civil unions but not marriage for same-sex couples");
System.out.println("C) Allow same-sex marriage");
System.out.println("D) Allow any consenting adults to enter into any kind of marriage they choose");
String marriageAnswer = input.nextLine().toUpperCase();

switch (marriageAnswer) {
    case "A":
        republicanPoints += 2;
        break;
    case "B":
        republicanPoints += 1;
        break;
    case "C":
        democraticPoints += 2;
        greenPoints += 1;
        break;
    case "D":
        libertarianPoints += 2;
        break;
    default:
        System.out.println("Invalid input. Please choose A, B, C, or D.");
}

// Question 7
System.out.println("What is your stance on taxes?");
System.out.println("A) Increase taxes on the wealthy to provide more social programs");
System.out.println("B) Keep taxes at current levels");
System.out.println("C) Cut taxes for all individuals and corporations");
System.out.println("D) Eliminate all taxes");
String taxesAnswer = input.nextLine().toUpperCase();
while (!taxesAnswer.equals("A") && !taxesAnswer.equals("B") && !taxesAnswer.equals("C") && !taxesAnswer.equals("D")) {
    System.out.println("Invalid input. Please choose A, B, C, or D.");
    taxesAnswer = input.nextLine().toUpperCase();
}
switch (taxesAnswer) {
    case "A":
        democraticPoints += 2;
        greenPoints += 1;
        break;
    case "B":
        break;
    case "C":
        republicanPoints += 2;
        libertarianPoints += 1;
        break;
    case "D":
        libertarianPoints += 1;
        break;
    default:
        System.out.println("Invalid input. Please choose A, B, C, or D.");
}

// Question 8
System.out.println("What is your stance on minimum wage?");
System.out.println("A) Raise the minimum wage to $15/hour or more");
System.out.println("B) Increase the minimum wage, but not to $15/hour");
System.out.println("C) Keep the minimum wage at its current level");
System.out.println("D) Eliminate the minimum wage");
String minimumWageAnswer = input.nextLine().toUpperCase();
while (!minimumWageAnswer.equals("A") && !minimumWageAnswer.equals("B") && !minimumWageAnswer.equals("C") && !minimumWageAnswer.equals("D")) {
    System.out.println("Invalid input. Please choose A, B, C, or D.");
    minimumWageAnswer = input.nextLine().toUpperCase();
}
switch (minimumWageAnswer) {
    case "A":
        democraticPoints += 2;
        greenPoints += 1;
        break;
    case "B":
        democraticPoints += 1;
        break;
    case "C":
        republicanPoints += 1;
        break;
    case "D":
        libertarianPoints += 2;
}
// Question 9
System.out.println("Should the government provide paid parental leave?");
System.out.println("A) Yes, for both mothers and fathers");
System.out.println("B) Yes, but only for mothers");
System.out.println("C) No, parental leave should not be mandated by the government");
System.out.println("D) No, the government should not be involved in family leave policies");
String parentalLeaveAnswer = input.nextLine().toUpperCase();
while (!parentalLeaveAnswer.equals("A") && !parentalLeaveAnswer.equals("B") && !parentalLeaveAnswer.equals("C") && !parentalLeaveAnswer.equals("D")) {
    System.out.println("Invalid input. Please choose A, B, C, or D.");
    parentalLeaveAnswer = input.nextLine().toUpperCase();
}
switch(parentalLeaveAnswer.toUpperCase()) {
case "A":
democraticPoints += 2;
greenPoints += 1;
break;
case "B":
democraticPoints += 1;
greenPoints += 1;
break;
case "C":
republicanPoints += 2;
libertarianPoints += 2;
break;
case "D":
libertarianPoints += 1;
break;
default:
System.out.println("Invalid input, please try again.");
}

//Question 10
System.out.println("Should the government regulate the economy?");
System.out.println("A) Yes, to prevent monopolies and promote competition");
System.out.println("B) Yes, to protect workers rights and prevent exploitation");
System.out.println("C) No, the market should be left alone");
System.out.println("D) No, the government should not be involved in the economy");
String RegulationAnswer = input.nextLine().toUpperCase();
while (!RegulationAnswer.equals("A") && !RegulationAnswer.equals("B") && !RegulationAnswer.equals("C") && !RegulationAnswer.equals("D")) {
    System.out.println("Invalid input. Please choose A, B, C, or D.");
    RegulationAnswer = input.nextLine().toUpperCase();
}
switch(RegulationAnswer.toUpperCase()) {
case "A":
democraticPoints += 2;
greenPoints += 1;
break;
case "B":
democraticPoints += 2;
greenPoints += 1;
break;
case "C":
republicanPoints += 2;
libertarianPoints += 2;
break;
case "D":
libertarianPoints += 1;
break;
default:
System.out.println("Invalid input, please try again.");
}

//Question 11

System.out.println("What political party do you affiliate with?");
System.out.println("A) Democrat");
System.out.println("B) Republican");
System.out.println("C) Libertarian");
System.out.println("D) Green party");
String AfilliationAnswer = input.nextLine().toUpperCase();
while (!AfilliationAnswer.equals("A") && !AfilliationAnswer.equals("B") && !AfilliationAnswer.equals("C") && !AfilliationAnswer.equals("D")) {
    System.out.println("Invalid input. Please choose A, B, C, or D.");
    AfilliationAnswer = input.nextLine().toUpperCase();
}
switch(AfilliationAnswer.toUpperCase()) {
  case "A":
    System.out.println("You affiliate with the Democrat party.");
    break;
  case "B":
    System.out.println("You affiliate with the Republican party.");
    break;
  case "C":
    System.out.println("You affiliate with the Libertarian party.");
    break;
  case "D":
    System.out.println("You affiliate with the Green party.");
    break;
  default:
    System.out.println("Invalid input. Please enter a valid option.");
}

// Calculate final scores for each party
int democraticFinalScore = democraticPoints;
int republicanFinalScore = republicanPoints ;
int libertarianFinalScore = libertarianPoints;
int greenFinalScore = greenPoints;
int totalPoints = democraticPoints + republicanPoints + libertarianPoints + greenPoints;

// Determine which party the user is most likely to belong to
if (democraticFinalScore > republicanFinalScore && democraticFinalScore > libertarianFinalScore && democraticFinalScore > greenFinalScore) {
    System.out.println("Based on your answers, you are most likely a Democrat.");
} else if (republicanFinalScore > democraticFinalScore && republicanFinalScore > libertarianFinalScore && republicanFinalScore > greenFinalScore) {
    System.out.println("Based on your answers, you are most likely a Republican.");
} else if (libertarianFinalScore > democraticFinalScore && libertarianFinalScore > republicanFinalScore && libertarianFinalScore > greenFinalScore) {
    System.out.println("Based on your answers, you are most likely a Libertarian.");
} else if (greenFinalScore > democraticFinalScore && greenFinalScore > republicanFinalScore && greenFinalScore > libertarianFinalScore) {
    System.out.println("Based on your answers, you are most likely a member of the Green Party.");
} else {
    System.out.println("Based on your answers, it is difficult to determine which party you align with.");
}
// Additonal-- Adds percent of each political party
int democraticPercent = (int) ((democraticPoints * 100) / totalPoints);
int republicanPercent = (int) ((republicanPoints * 100) / totalPoints);
int libertarianPercent = (int) ((libertarianPoints * 100) / totalPoints);
int greenFinalPercent = (int) ((greenPoints * 100) / totalPoints);

// Display final scores to user
System.out.println("Democratic Party: " + democraticPercent + "%");
System.out.println("Republican Party: " + republicanPercent + "%");
System.out.println("Libertarian Party: " + libertarianPercent + "%");
System.out.println("Green Party: " + greenFinalPercent + "%");

input.close(); 
}
}