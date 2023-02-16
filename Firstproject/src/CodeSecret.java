public class CodeSecret {

    public static void Deviner(){
        //creer le secret
        String secret ="tabarnak";

        String mot = Outils.demande("Entrez le mot de passe:");
        if (secret.equals(mot)){
            System.out.println("Bravo!! vous avez trouvé le mot de passe!");
        } else if(mot.length() != secret.length()){
            System.out.println("Le secret fait "+secret.length()+" caractères de longueur");
            Deviner();
        }
        else {
            String res = "";
            System.out.println("Vous n'avez pas pas de chance aujourd'hui");
            for(int index=0; index<secret.length(); index++){
                char secretChar = secret.charAt(index);
                char motChar = mot.charAt(index);
                if (secretChar == motChar){
                    res += secretChar;
                }
                else if(secret.contains(""+motChar)){
                    res += "*";
                }
                else {
                    res += "_";
                }
            }
            System.out.println(res);
            Deviner();
        }




    }




    public static void main(String[] args) {
        Deviner();




    }
}
