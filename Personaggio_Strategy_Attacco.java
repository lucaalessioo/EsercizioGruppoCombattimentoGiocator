interface Personaggio_Strategy_Attacco {
    String attacca();
}

class Attacco_Meelee implements Personaggio_Strategy_Attacco {
    @Override
    public String attacca() {
        return "Attacco corpo a corpo!";
    }
}

class Attacco_Ranger implements Personaggio_Strategy_Attacco {
    @Override
    public String attacca() {
        return "Scaglia un dardo!";
    }
}

class Attacco_Mage implements Personaggio_Strategy_Attacco {
    @Override
    public String attacca() {
        return "Scaglia magia!";
    }
}