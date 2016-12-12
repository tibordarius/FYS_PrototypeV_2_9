// This class acts as a model class,holding getters,setters and properties
package screensframework;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author admin
 */
public class LuggageDetailsKoffers {

    private final StringProperty idKoffers;
    private final StringProperty Gewicht;
    private final StringProperty Kleur;
    private final StringProperty Vorm;
    private final StringProperty Merk;
    private final StringProperty Passagiers_idPassagiers;
    

    //Default constructor
    public LuggageDetailsKoffers(String idKoffers, String Gewicht, String Kleur, String Vorm, String Merk, String Passagiers_idPassagiers) {
        this.idKoffers = new SimpleStringProperty(idKoffers);
        this.Gewicht = new SimpleStringProperty(Gewicht);
        this.Kleur = new SimpleStringProperty(Kleur);
        this.Vorm = new SimpleStringProperty(Vorm);
        this.Merk = new SimpleStringProperty(Merk);
        this.Passagiers_idPassagiers = new SimpleStringProperty(Passagiers_idPassagiers);
    }

    //Getters
    public String getidKoffers() {
        return idKoffers.get();
    }

    public String getGewicht() {
        return Gewicht.get();
    }

    public String getKleur() {
        return Kleur.get();
    }
    public String getVorm() {
        return Vorm.get();
    }
    public String getMerk() {
        return Merk.get();
    }
    public String getPassagiers_idPassagiers() {
        return Passagiers_idPassagiers.get();
    }

    //Setters
    public void setidKoffers(String value) {
        idKoffers.set(value);
    }

    public void setGewicht(String value) {
        Gewicht.set(value);
    }

    public void setKleur(String value) {
        Kleur.set(value);
    }
    public void setVorm(String value) {
        Vorm.set(value);
    }
    public void setMerk(String value) {
        Merk.set(value);
    }
    public void setPassagiers_idPassagiers(String value) {
        Passagiers_idPassagiers.set(value);
    }

    //Property values
    public StringProperty idKoffersProperty() {
        return idKoffers;
    }

    public StringProperty GewichtProperty() {
        return Gewicht;
    }

    public StringProperty KleurProperty() {
        return Kleur;
    }
    public StringProperty VormProperty() {
        return Vorm;
    }
    public StringProperty MerkProperty() {
        return Merk;
    }
    public StringProperty Passagiers_idPassagiersProperty() {
        return Passagiers_idPassagiers;
    }
}
