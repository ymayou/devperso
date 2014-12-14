package gestargent.perso.form.gestionargent;

/**
 * Created by Tfk on 14/12/2014.
 */
public class DepenseItem {
    private String categorie;
    private String date;
    private String prix;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCategorie() {
        return categorie;
    }

    @Override
    public String toString() {
        return "[ Catégorie = " + categorie + ", Date = " + date + ", Prix = " + prix + "]";
    }
}
