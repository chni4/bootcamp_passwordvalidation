package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Passwordval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihr Passwort ein:");
        String pw = sc.next();


        checkPasswordLength(pw);


        checkPasswordZiffern(pw);

        checkPasswordGrossKlein(pw);

        checkPassword(pw);

        checkPassword_Special(pw);


    }

    public static boolean checkPasswordLength(String pw) {
        if (pw.length() >= 8) {
            System.out.println("Die Mindest länge vor 8 Zeicen wurde erzielt.");
            System.out.println("Ihr Passwort ist " + pw.length() + " Zeichen lang.");
        } else {
            System.out.println("False");
            System.out.println("Das Passwort ist zu kurz. Es muss mindestens 8 Zeichen lang sein.");
        }
        return false;
    }

    public static boolean checkPasswordZiffern(String pw) {
        boolean ziffer = pw.matches(".*\\d.*");
        if (ziffer) {
            System.out.println("Das Passwort enthält Ziffern.");
        } else {
            System.out.println("Das Passwort enthält keine Ziffern. Es muss mindestens eine Ziffer enthalten.");
        }
        return ziffer;
    }
    public static void checkPasswordGrossKlein(String pw) {
        boolean hasUpperCase = !pw.equals(pw.toLowerCase());
        boolean hasLowerCase = !pw.equals(pw.toUpperCase());

        if (hasUpperCase && hasLowerCase) {
            System.out.println("Das Passwort enthält sowohl Groß- als auch Kleinbuchstaben.");
        } else if (!hasUpperCase) {
            System.out.println("Das Passwort enthält keine Großbuchstaben. Es muss mindestens einen Großbuchstaben enthalten.");
        } else {
            System.out.println("Das Passwort enthält keine Kleinbuchstaben. Es muss mindestens einen Kleinbuchstaben enthalten.");
        }
    }
    public static void checkPassword(String pw) {

        String[] givenPws = {"Password123", "Test123", "P@ssword", "Hello", "Pasword123"};


        for (String forbiddenPw : givenPws) {
            if (forbiddenPw.equals(pw)) {
                System.out.println("Dieses Passwort darf man nicht benutzen");
                return;
            }
        }
        System.out.println("Das Passwort ist ok");
    }
    public static boolean checkPassword_Special(String pw) {
        boolean sonder = pw.matches(".*[^a-zA-Z0-9].*");
        if (sonder) {
            System.out.println("Das Passwort enthält Sonderzeichen.");
        } else {
            System.out.println("Das Passwort enthält keine Sonderzeichen. Es muss mindestens ein Sonderzeichen enthalten.");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Wollen sie ein Passwort generieren?");
        String Frage = sc.next();
        if (Objects.equals(Frage, "Ja")) {
            Generate_Random_Password(pw);



        } else {
            Else(pw);

        }

        return sonder;


    }
    public static void Generate_Random_Password(String pw) {

        Scanner sc = new Scanner(System.in);


        int viel = (int)(Math.random()*52);
        int zahlen = (int)(Math.random()*10000000);
        int zahlen2 = (int)(Math.random()*10000000);



        String[] textLines = {
                "A",
                "B",
                "C",
                "D",
                "E",
                "F",
                "G",
                "H",
                "I",
                "J",
                "K",
                "L",
                "M",
                "N",
                "O",
                "P",
                "Q",
                "R",
                "S",
                "T",
                "U",
                "V",
                "W",
                "X",
                "Y",
                "Z",
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h",
                "i",
                "j",
                "k",
                "l",
                "m",
                "n",
                "o",
                "p",
                "q",
                "r",
                "s",
                "t",
                "u",
                "v",
                "w",
                "x",
                "y",
                "z",


        };



        // Die entsprechende Zeile aus dem Array auslesen und ausgeben
        if (viel >= 0 && viel < textLines.length) {
            System.out.println("Passwort wird Generiert");
        } else {
            System.out.println("Zeilennummer ist außerhalb des gültigen Bereichs.");

        }
        System.out.println("Ihr Passwort: " + textLines[viel] + zahlen + textLines[viel] + zahlen2 + textLines[viel]);
        }



    public static void Else(String pw) {
        System.out.println("ok");


    }





    }




