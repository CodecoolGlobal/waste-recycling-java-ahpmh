package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {
        private boolean squeezeFlag;

        public PaperGarbage(String garbageName, boolean squeezeFlag) {
                super(garbageName);
                this.squeezeFlag = squeezeFlag;
        }

        public boolean isSqueezed(boolean cleanFlag) {
                return squeezeFlag;
        }

        public void squeeze() {
                squeezeFlag = true;
        }
}
