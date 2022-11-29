package com.codecool.wasterecycling;

public class Main {

    public static void main(String[] args) {
            Dustbin basura = new Dustbin("Amarillo");

            Garbage plasticCup = new PlasticGarbage("Dirty Plastic Cup", false);
            Garbage plasticBottle = new PlasticGarbage("Plastic Bottle", true);
            Garbage newspaper = new PaperGarbage("Newspaper", true);
            Garbage botellaDeVinoTinto = new Garbage("Botella de Vino Tinto");

            try {
                    basura.throwOutGarbage(plasticBottle);
                    basura.throwOutGarbage(plasticCup);
                    basura.throwOutGarbage(newspaper);
                    basura.throwOutGarbage(botellaDeVinoTinto);
            }
            catch ( DustbinContentException e){
                        System.out.println("It is illegal!");
            }
            basura.displayContents();
            basura.emptyContents();
            basura.displayContents();
    }
}
