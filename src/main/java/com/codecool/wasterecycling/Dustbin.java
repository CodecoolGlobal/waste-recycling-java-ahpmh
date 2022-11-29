package com.codecool.wasterecycling;

import java.util.ArrayList;

public class Dustbin {
        private String color;
        private ArrayList<String> plastic = new ArrayList<>();
        private ArrayList<String> paper = new ArrayList<>();
        private ArrayList<String> houseWaste = new ArrayList<>();


        public Dustbin(String color){
                this.color = color;
        }

        public String getColor(){
                return color;
        }



        public void throwOutGarbage(Garbage garbage) {
                if (garbage instanceof PlasticGarbage) {
                        plastic.add(garbage.getName());
                } else if (garbage instanceof PaperGarbage) {
                        paper.add(garbage.getName());
                } else {
                        houseWaste.add(garbage.getName());
                }
        }

        public int getHouseWasteCount() {
                return houseWaste.size();
        }

        public int getPaperCount() {
                return paper.size();
        }

        public int getPlasticCount() {
                return plastic.size();
        }


        public void emptyContents(){
                plastic.clear();
                paper.clear();
                houseWaste.clear();
        }


        public String toString(){
                int numberOfPlastic = getPlasticCount();
                int numberOfHouseWaste = getHouseWasteCount();
                int numberOfPaper = getPaperCount();
                String currentGarbage = String.format("%s Dustbin! \n House waste content: %s item(s) \n Paper content:  %s item(s) \n Plastic content: %s",
                color, numberOfHouseWaste, numberOfPaper, numberOfPlastic );
                return currentGarbage;
        }

        private void displayContents(Garbage currentGarbage){
                System.out.println(currentGarbage);
        }

}
