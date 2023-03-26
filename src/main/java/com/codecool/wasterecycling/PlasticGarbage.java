package com.codecool.wasterecycling;

public class PlasticGarbage extends Garbage {

        private boolean clean;

        public PlasticGarbage(String garbageName, boolean clean) {
                super(garbageName);
                this.clean = clean;
        }

        public boolean isClean() {
                        return clean;
        }

        public void clean() {
                clean = true;
                }
}
