package com.Simplon;

import java.util.Scanner;

public class Gestion_des_notes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("=====================================\" Gestionnaire des Notes  \"=======================================");
            System.out.println("Choisissez un numero pour : \n =>(1)Ajouter un etudiant. \n =>(2)Chercher un etudiant. \n =>(3)entrer la moyenne d'un etudiant. \n =>(4)entrer la moyenne generale d'un matiere d'etudiant. \n =>(5)Quiter l'application. ");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.print("Entrer une valeur : ");
            String input = sc.nextLine();

            switch (input) {
                case "1" -> {
                    System.out.println("=====================================\" Ajouter un etudiant  \"==========================================1");
                    System.out.print("Entrer le nom complet d'un etudiant: ");
                    String fullNameStud = sc.nextLine();
                    Student student = new Student(fullNameStud);
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    System.out.println(fullNameStud);
                }
                case "2" -> {
                    System.out.println("=====================================\" Chercher un etudiant  \"==========================================1");
                    System.out.print("Entrer le nom d'etudiant à chercher: ");
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                }
                case "5" -> {
                    break label;
                }
            }
        }
    }

}
