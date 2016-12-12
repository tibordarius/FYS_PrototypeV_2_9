// This class acts as a model class,holding getters,setters and properties
package screensframework;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Tibor
 */
public class LuggageDetailsPassagiers {

    private final StringProperty idPassagiers;
    private final StringProperty Naam;
    private final StringProperty Geboortedatum;
    private final StringProperty Vluchten_VluchtNummer;

    // idPassagiers, Naam, Geboortedatum, Vluchten_VluchtNummer

    //Default constructor
    public LuggageDetailsPassagiers(String idPassagiers, String Naam, String Geboortedatum, String Vluchten_VluchtNummer) {
        this.idPassagiers = new SimpleStringProperty(idPassagiers);
        this.Naam = new SimpleStringProperty(Naam);
        this.Geboortedatum = new SimpleStringProperty(Geboortedatum);
        this.Vluchten_VluchtNummer = new SimpleStringProperty(Vluchten_VluchtNummer);
    }

    //Getters
    public String getidPassagiers() {
        return idPassagiers.get();
    }

    public String getNaam() {
        return Naam.get();
    }

    public String getGeboortedatum() {
        return Geboortedatum.get();
    }
    public String getVluchten_VluchtNummer() {
        return Vluchten_VluchtNummer.get();
    }


    //Setters
    public void setidPassagiers(String value) {
        idPassagiers.set(value);
    }

    public void setNaam(String value) {
        Naam.set(value);
    }

    public void setGeboortedatum(String value) {
        Geboortedatum.set(value);
    }
    public void setVluchten_VluchtNummer(String value) {
        Vluchten_VluchtNummer.set(value);
    }


    //Property values
    public StringProperty idPassagiersProperty() {
        return idPassagiers;
    }

    public StringProperty NaamProperty() {
        return Naam;
    }

    public StringProperty GeboortedatumProperty() {
        return Geboortedatum;
    }
    public StringProperty Vluchten_VluchtNummerProperty() {
        return Vluchten_VluchtNummer;
    }

}
