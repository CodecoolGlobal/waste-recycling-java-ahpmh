package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {

        private String cleanFlag;

        public PlasticGarbage(String garbageName, String cleanFlag) {
                super(garbageName);
                this.cleanFlag = isClean(cleanFlag);
        }

        public String isClean(String cleanFlag) {
                if (!cleanFlag.equals("clean")) {
                        return clean();
                }
                return cleanFlag;
        }

        public String clean() {
                        return "clean";
                }
}
