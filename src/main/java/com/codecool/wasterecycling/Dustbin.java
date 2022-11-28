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

                return null;
        }

        private void displayContents(){
                System.out.println();
        }

}
