package co.com.choucair.ejemplo.utils;

public enum Constant {
  MESSAGE("Welcome to the world's largest community of freelance software testers!");

    final String constant;

    Constant(String constant) {
        this.constant = constant;
    }

    public String getConstant(){return constant;}
}

