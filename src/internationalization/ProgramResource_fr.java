package internationalization;

import logging.AssignmentLogger;

public class ProgramResource_fr extends ProgramResource {
    /**
     * Returns the localized string for the given key.
     * @param key the key for which to retrieve the localized string
     * @return the localized string
     */
    public Object handleGetObject(String key){
        String returnString = "";
                
        if (key.equals("welcome")) {
            returnString = "Bienvenue dans le système de réservation de vols";
        } else if (key.equals("promptOrigin")) {
            returnString = "Veuillez sélectionner une origine :";
        } else if (key.equals("promptDestination")) {
            returnString = "Veuillez sélectionner une destination :";
        } else if (key.equals("promptClass")) {
            returnString = "Veuillez sélectionner une classe :";
        } else if (key.equals("invalidSelection")) {
            returnString = "Sélection invalide, veuillez sélectionner une option valide, sinon l'option par défaut 1 sera utilisée.";
        } else if (key.equals("bookedMessage")) {
            returnString = "Merci d'avoir réservé avec nous !";
        } else if (key.equals("waitMessage")) {
            returnString = "Réservation de votre vol, veuillez patienter";
        } else if (key.equals("flightDetails")) {
            returnString = "Votre vol de %s --> %s a été réservé en %s.";
        } else if (key.equals("dublin")) {
            returnString = "Dublin";
        } else if (key.equals("paris")) {
            returnString = "Paris";
        } else if (key.equals("newYork")) {
            returnString = "New York";
        } else if (key.equals("japan")) {
            returnString = "Japon";
        } else if (key.equals("warsaw")) {
            returnString = "Varsovie";
        } else if (key.equals("firstClass")) {
            returnString = "Première classe";
        } else if (key.equals("businessClass")) {
            returnString = "Classe affaires";
        } else if (key.equals("coachClass")) {
            returnString = "Classe économique";
        } else if (key.equals("languagePrompt")) {
            returnString = "Veuillez sélectionner une langue ou quitter le programme - 1. Anglais 2. Français 3. Quitter";
        } else if (key.equals("english")) {
            returnString = "Anglais";
        } else if (key.equals("french")) {
            returnString = "Français";
        } else if (key.equals("2ndInvalidSelection")) {
            returnString = "2ème sélection invalide, l'option 1 sera utilisée.";
        } else if (key.equals("exitMessage")) {
            returnString = "Quitter le programme, merci d'avoir réservé avec nous !";
        }

        return returnString;
    }
}
