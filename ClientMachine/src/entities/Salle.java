// Salle.java
package entities;

import java.io.Serializable;

public class Salle implements Serializable {

    private int id;
    private String code;
    private static final long serialVersionUID = 927658137536744736L; // Add this line

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public Salle() {
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code + '}';
    }
    
   
}
