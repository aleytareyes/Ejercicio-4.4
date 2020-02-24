/*Create a class named BloodData that includes fields that hold a blood type (the
four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –).
Create a default constructor that sets the fields to “O” and “+”, and an overloaded
constructor that requires values for both fields. Include get and set methods for
each field. Save this file as BloodData.java. Create an application named
TestBloodData that demonstrates that each method works correctly. Save the
application as TestBloodData.java.
b. Create a class named Patient that includes an ID number, age, and BloodData.
Provide a default constructor that sets the ID number to “0”, the age to 0, and the
BloodData to “O” and “+”. Create an overloaded constructor that provides
values for each field. Also provide get methods for each field. Save the file as
Patient.java. Create an application named TestPatient that demonstrates that
each method works correctly, and save it as TestPatient.java.
package blooddata;
*/
package blooddata;

public class BloodData {
    private TipoSangre tipo;
    private TipoRh rh;
    
    public BloodData(){
        this.tipo=TipoSangre.O;
        this.rh=TipoRh.POSITIVO;
    }
    public BloodData(TipoSangre tipo, TipoRh rh){
        this.tipo=tipo;
        this.rh=rh;  
    }
    
    public TipoSangre getTipo() {
        return tipo;
    }

    public void setTipo(TipoSangre tipo) {
        this.tipo = tipo;
        System.out.print(tipo);
    }

    public TipoRh getRh() {
        return rh;
    }

    public void setRh(TipoRh rh) {
        this.rh = rh;
        System.out.print(rh);
    }
    
    
    
}
