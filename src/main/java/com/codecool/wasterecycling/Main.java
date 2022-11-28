package com.codecool.wasterecycling;

public class Main {

    public static void main(String[] args) {
            Dustbin Plastico = new Dustbin("amarillo");
            Dustbin Vidrio = new Dustbin("verde");
            Dustbin Papel = new Dustbin("azul");

            Garbage PlasticCup = new PlasticGarbage("PlasticCup", "dirty");
            Garbage PlasticBottle = new PlasticGarbage("PlasticBottle", "clean");


    }
}
