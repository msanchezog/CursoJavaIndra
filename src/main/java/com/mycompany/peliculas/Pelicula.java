/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peliculas;

/**
 *
 * @author masmorato
 */
public class Pelicula {
    private String codigo;
    private String titulo;
    private String genero;
    private float rating;
    private String restricciones;
    
    //constructor
    
    public Pelicula(String cod, String tit, String gen, float rat, String rest){
        codigo=cod;
        titulo=tit;
        genero=gen;
        rating=rat;
        restricciones=rest;
    }
    @Override
    public String toString(){
    return codigo+", "+titulo+", "+genero+", "+rating+", "+restricciones+".";
    }
}
