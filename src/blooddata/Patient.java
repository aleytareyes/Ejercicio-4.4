/*Create a class named Patient that includes an ID number, age, and BloodData.
Provide a default constructor that sets the ID number to “0”, the age to 0, and the
BloodData to “O” and “+”. Create an overloaded constructor that provides
values for each field. Also provide get methods for each field. Save the file as
Patient.java. Create an application named TestPatient that demonstrates that
each method works correctly, and save it as TestPatient.java.*/
package blooddata;

public class Patient {
    private Integer id;
    private Integer age;
    private BloodData bloodData;
    
    public Patient(Integer id, Integer age, BloodData bloodData){
        this.id=id;
        this.age=age;
        this.bloodData=bloodData;
    }
    
    public Patient(){
        this.id=0;
        this.age=0;
        this.bloodData=new BloodData(TipoSangre.O, TipoRh.POSITIVO);
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }
    
    
    
}
