public class Simulation {

    public void nextTick(){
        /*crida a totes les funcions que fan accions a cada tick.
        moure habitants d'un lloc a l'altre, etc.
         */
        for(i : totes_les_regions){
            for(j : totes_les_regions){
                if(i!=j){
                    Region(i).inhabitantsReturnTo(j)
                }
            }
        }

        for(i : totes_les_regions){
            for(j : totes_les_regions){
                if(i!=j){
                    Region(i).inhabitantsMoveTo(j)
                }
            }
        }

        for(i : totes_les_regions){
            i.CalculateInfected();
        }

    }

    public void softVaccination(Region reg, int percent, SoftVaccine vac){
        // vaccuna a una regio, en un tant per cent de la població amb una acuna soft
    }

    public void hardVaccination(Region reg, int percent, HardVaccine vac){
        // vacuna a una regio, en un tant per cent de la població amb una vacuna hardVaccine.
    }

    public void startHardConfinement(Region reg){
        // comença el confinament d'una regió sense mobilitat interna
    }

    public void endHardConfinement(Region reg){
        // acaba el confinament dur.
    }

    public void startSoftConfinement(Region reg){
        // comença el confinament lleu
    }

    public void endSoftConfinement(Region reg){
        // acaba el confinament lleu
    }

    public void readPopulationData(Region reg){
        //llegeix les dades que toquen
    }

    public void readVirusData(Virus vir){
        //llegeix les dades dels virus
    }
}
