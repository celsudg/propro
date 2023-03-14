public class Region {

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

    public void inhabitantsUpdate(/* region, int */){
        //actualitzar els habitants: regio.habitants += int;
    }

    public setDeProporcoinsDinfectats inhabitantsMoveTo(Region reg){
        //enviar porcentatge d'habitants de this. escollits a l'atzar (: agafa el valor avg per escollir quants infectats i de quin virus van) a la regio que diu o a tot el contenidor
        //comprovar que allà a on van no està tancat.
        //s'infecten habitants
        //tornen en el següent tick. inhabitantsReturnTo(Region reg)
        reg.inhabitantsTemporalUpdateForInfected(this.habitants_que_es_mouran__set_amb_proporcions_dinfectats__);
    }

    public void inhabitantsTemporalUpdateForInfected(setDeProporcoinsDinfectats){
        /*
        crea unes variables temporals per calcular els infectats nous d'aquella regió a on després de que
        s'hi hagin mogut els habitants es calcularan els infectats i després tornaran a la seva regió
         */
        this.actualitzar_dades_temporals_per_calcular_infeccions_noves
    }

    public setDeProporcoinsDinfectats inhabitantsReturnTo(Region reg){
        //tornen els habitants inhabitantsReturnTo(Region reg)
        if(no s'han enviat habitants habans'){
            throw
        }
    }

    public void softVaccination(){
        //acutalitza quin percentatge de la població està vacunada d'un virus.
    }

    public void hardVaccination(){
        //actualitza quin percentatge de la població està vacunada d'un virus.
    }

    public void calculateInfected(){
        /*
        Contenidor de contenidors amb infectats. La primera posició del contenidor segon serà de no infectats. Els altres
        seràn infectats per un virus. Els infectats per dos virus es guarden al final.


        calcula per tots els virus els infectats que hi haura en aquesta regió. Cada vegada
        que infecta algú els guarda en un contenidor que diu per qui han sigut infectats (A,B,C,...)
        Per tant es guarda un contenidor d'integers amb el nom del virus, cada contenidor és com una pila i els
        infectats poden passar d'un estat a un altre d'aquell virus.

        Els infectats en diferents ticks es guarden en diferents generacions. Per tant, hi haura un set
        de dades d'infectats, i un contenidor de dades de contenidor d'infectats, en el qual s'hi guardaràn les "piles"
        (no són piles perquè hi poden haver dos estats simultanis, un struct més aviat).
        Semplanarà el primer contenidor buit que es trobi.

        Pels malalts de dos virus, són virus diferents no importa, és comporta com de normal, per tant es calcularà
        fent ((noInfectats-infectatsVirusA)*(1-immunitatA))*%d'infeccióA.

        Per la creació de virus quan coïncideixen les families, es canvia el virus de tot el grup.

        Tots els efectes de reducció d'efectes o d'eliminació d'aquest s'apliquen en grup.
         */

        for(i : pel primer contendior){ // actualitza ticks d'infectats
            for(j : pel i.contenidor){ // doble bucle per anar de contenidor en contendidor, entrar en cada un i recalcular els seus estats.
                -actualitzar quans ticks els queden per canviar d'estats. Si canvien. Quan arriben a l'average canvien d'estat. Després, s'hi sestan curant tenen una probabilitat de morir.
                -matar al tant per cent de persones que toquen quan es curen.
                        -en algun moment fer errors de copia.
            }
        }

        for(i : pel primer contenidor de contenidor){ //crea infectats
            for (j : i.pel segon contenidor d 'infectats'){
                for (k : tots_els_virus) {
                    if (j.virusFamily != k) { //no volem infectar A amb A.
                        probar d 'infectar'. Si infecta a un grup ja infectat guarda al final quants n'ha infectat amb els dos virus perque
                        quan faci la probabilitat de morir i curar també s'han' d'actualitzar' els dos grups.
                        if(j.algunvirusFamilyNamedeJ==k and j.virus!=k){
                            crea un virus amb MutationPerFamilyCoincidence() que substitueix el virus nou pel grup senser
                            restar dels contenidors actualitzats infectats d'A' i de B. Per mantenir el nº d'habitants'.
                        }
                    }
                }
            }
        }
    }
}
