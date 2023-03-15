public class Region {
    /*
    La regió és on es calculen totes les interaccions amb virus i vacunes.
     */
    public void closeExternMobility(){
        //tancar la regió aquesta
    }

    public void openExternMobility(){
        //obrir la regió aquesta
    }

    public void closeInternMobility(){
        //tancar la regió aquesta
    }

    public void openInternMobility(){
        //obrir la regió aquesta
    }

    public ProporcoinsDinfectats inhabitantsMoveTo(Region reg, porcentatge){
        //envia habitants d'aquesta població a una altra.
    }

    public ProporcoinsDinfectats inhabitantsReturnTo(Region reg, porcentatge){
        //tornen els habitants a la regió de la que provenen.
    }

    public void softVaccination(){
        //acutalitza quin percentatge de la població està vacunada d'un virus.
    }

    public void hardVaccination(){
        //actualitza quin percentatge de la població està vacunada d'un virus.
    }

    public void calculateInfected(){
        /* Calcula els infectats tenin en compte que hi aura visitants d'altres pobles que augmentaràn temporalment els habitatns i per tant
        afecten als cacluls generals, però no es barrejen. Els visitants també es poden infectar.
         */
    }

    public void die(){
        //mata=borra els habitants que han mort per un virus. També té en compte els que moren en una altra regió que visiten.
    }
}
