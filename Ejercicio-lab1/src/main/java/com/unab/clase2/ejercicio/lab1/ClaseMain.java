package com.unab.clase2.ejercicio.lab1;

import java.util.Scanner;

public class ClaseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre ");
        String Nombre = sc.nextLine();

        System.out.println("Escribe la edad ");
        int Edad = sc.nextInt();

        System.out.println("Escribe el sexo ");
        char Sexo = sc.next().charAt(0);

        System.out.println("Introduzca el peso ");
        double Peso = sc.nextDouble();

        System.out.println("Introduzca la altura ");
        double Altura = sc.nextDouble();

        Persona persona1 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
        
            System.out.println(persona1.toString1());
            System.out.println(persona1.esMayorDeEdad());

            Persona persona2 = new Persona(persona1.getNombre(), persona1.getEdad(), persona1.getSexo());
            System.out.println(persona2.toString2());
            System.out.println(persona2.esMayorDeEdad());

            Persona persona3 = new Persona();
            persona3.setNombre(Nombre);
            persona3.setEdad(Edad);
            persona3.setSexo(Sexo);
            persona3.setPeso(Peso);
            persona3.setAltura(Altura);

            System.out.println(persona3.toString1());
            System.out.println(persona3.esMayorDeEdad());

        }

    
}
