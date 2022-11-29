package com.codecool.wasterecycling;

import java.util.ArrayList;

public class Dustbin {
        private String color;
        private ArrayList<PlasticGarbage> plastic = new ArrayList<>();
        private ArrayList<PaperGarbage> paper = new ArrayList<>();
        private ArrayList<Garbage> otherGarbage = new ArrayList<>();


        public Dustbin(String color){
                this.color = color;
        }

        public String getColor(){
                return color;
        }



        public void throwOutGarbage(Garbage garbage) throws DustbinContentException {
                if (garbage instanceof PlasticGarbage && ((PlasticGarbage) garbage).isClean()) {
                        plastic.add((PlasticGarbage) garbage);
                } else if (garbage instanceof PaperGarbage && ((PaperGarbage) garbage).isSqueezed()) {
                        paper.add((PaperGarbage) garbage);
                } else if (garbage instanceof Garbage) {
                        otherGarbage.add(garbage);
                } else
                throw new DustbinContentException();
        }

        public int getHouseWasteCount() {
                return otherGarbage.size();
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
                otherGarbage.clear();
        }


        public String toString(){
                String plasticGarbage = "";
                for (int i = 0; i < plastic.size(); i++) {
                        plasticGarbage += plastic.get(i).getName() + " nr." + Integer.toString(i+1)+"\n";
                }
                String paperGarbage = "";
                for (int i = 0; i < paper.size(); i++) {
                        paperGarbage += paper.get(i).getName() + " nr." + Integer.toString(i+1)+"\n";
                }
                String other = "";
                for (int i = 0; i < otherGarbage.size(); i++) {
                        other += otherGarbage.get(i).getName() + " nr." + Integer.toString(i+1)+"\n";
                }

                int numberOfPlastic = getPlasticCount();
                int numberOfHouseWaste = getHouseWasteCount();
                int numberOfPaper = getPaperCount();
                String currentGarbage = String.format("%s Dustbin! \n " +
                                "House waste content: %s item(s) \n %s \n"
                                + "Paper content:  %s item(s) \n %s \n" +
                                "Plastic content: %s item(s) \n %s",
                color,
                        numberOfHouseWaste, other,
                        numberOfPaper, paperGarbage,
                                numberOfPlastic, plasticGarbage);
                return currentGarbage;
        }

//        private void displayContents(Garbage currentGarbage){
//                System.out.println(currentGarbage);
//        }
//
        public void  displayContents(){
                System.out.println(toString());
        }



}
//        Green Dustbin!
//        House waste content: 2 item(s)
//        Rotten tomato nr.1
//        Half-eaten lettuce nr.2
//        Paper content: 1 item(s)
//        Failed exam nr.1
//        Plastic content: 3 item(s)
//        Empty plastic bottle nr.1
//        Plastic bag nr.2
//        Wrapper foil nr.3
