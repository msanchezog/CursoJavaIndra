/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.peliculas;

/**
 *
 * @author masmorato
 */
public class Peliculas{


    public static void main(String[] args) {
        System.out.println("Hello World!");
         Pelicula arrayList[]={new Pelicula("A0001", "Terminator", "Sci-Fi", 4, "Todos los públicos"), new Pelicula("A0002", "Heat", "Crime/Drama", 4, "18"), 
             new Pelicula("A0003", "El Cabo del miedo", "Suspense/Crimen", 4, "18"), 
         new Pelicula("A0003", "El Cabo del miedo", "Suspense/Crimen", 4, "18"),
         new Pelicula("A0004", "Serpico", "Crimen/Drama", 4, "18"), 
         new Pelicula("A0005", "El Irlandés", "Crimen/Drama", 4, "18")};
        
        for (Pelicula arrayList1 : arrayList) {
            System.out.println(arrayList1);
        }
       
    }
}
