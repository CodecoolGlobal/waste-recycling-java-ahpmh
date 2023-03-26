package com.codecool.wasterecycling;

public class Main {

    public static void main(String[] args) {
            Dustbin dustbin = new Dustbin("Yellow");

            Garbage plasticCup = new PlasticGarbage("Dirty Plastic Cup", false);
            Garbage plasticBottle = new PlasticGarbage("Plastic Bottle", true);
            Garbage newspaper = new PaperGarbage("Newspaper", true);
            Garbage wineGlass = new Garbage("Wine Glass");

            try {
                    dustbin.throwOutGarbage(plasticBottle);
                    dustbin.throwOutGarbage(plasticCup);
                    dustbin.throwOutGarbage(newspaper);
                    dustbin.throwOutGarbage(wineGlass);
            }
            catch ( DustbinContentException e){
                        System.out.println("It is illegal!");
            }
            dustbin.displayContents();
            dustbin.emptyContents();
            dustbin.displayContents();
    }
}
