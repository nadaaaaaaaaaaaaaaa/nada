public class livre {


private int id;
private String titre;
private String nomauteur;
private String prenomauteur;
private double prix;

        public livre(String titre, String nomauteur, String prenomauteur, double prix) {
            this.id = id++;
            this.titre = titre;

            this.nomauteur = nomauteur;
            this.prenomauteur = prenomauteur;
            this.prix = prix;
        }
 public int getid() {

     return id;
 }
    public void setid(int id){
        this.id=id;
    }
 public String gettitre() {
            return titre;
 }
    public void settitre(String titre){
        this.titre=titre;
    }

public String getnomauteur() {
    return nomauteur;
}
    public void setnomauteur(String nomauteur){
        this.nomauteur=nomauteur;
    }
public String getprenonauteur() {
    return prenomauteur;
}
    public void setprenomauteur(String prenomauteur){
        this.prenomauteur=prenomauteur;
    }
public double getdoubleprix() {

    return prix;
}
    public void setprix(double prix){
        this.prix=prix;
    }
public static void main(string[] Args){

livre l1=new livre("titre1","nomauteur1","prenomauteur1","100.0");
 System.out.println(l1.id);


        }

}