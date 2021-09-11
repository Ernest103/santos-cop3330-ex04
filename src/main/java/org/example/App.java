package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Q_4
        Scanner sc = new Scanner(System.in);
        String noun, verb, adjective, adverb, sentence;

        System.out.print("Enter a noun: ");
        noun = sc.nextLine();
        System.out.print("Enter a verb: ");
        verb = sc.nextLine();
        System.out.print("Enter a adjective: ");
        adjective = sc.nextLine();
        System.out.print("Enter a adverb: ");
        adverb = sc.nextLine();

        sentence = String.format("Do you %s your %s %s %s? That's hilarious!\n", verb, adjective, noun, adverb);
        System.out.println(sentence);
    }
}
