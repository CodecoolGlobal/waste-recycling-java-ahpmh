package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {
        private String squeezeFlag;

        public PaperGarbage(String garbageName, String squeezeFlag) {
                super(garbageName);
                this.squeezeFlag = isSqueezed(squeezeFlag);
        }

        public String isSqueezed(String cleanFlag) {
                if (!cleanFlag.equals("squeeze")) {
                        return squeeze();
                }
                return squeezeFlag;
        }

        public String squeeze() {
                return "squeezed";
        }
}
