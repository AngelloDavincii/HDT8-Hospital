public class Patient implements Comparable<Patient>{
    public String name;
    public String description;
    public int code;

    //Constructor
    public Patient(String name, String description, int code){
        this.name = name;
        this.description = description;
        this.code = code;
    }

    //Metodo de comparacion
    @Override
    public int compareTo(Patient myPatient){
        //Si el codigo del paciente es menor, devuelve -1
        //Si el codigo del paciente es igual al del otro, devuelve 0
        //Si el codigo del paciente es mayor, devuelve 1
        return Integer.compare(this.code, myPatient.code);
    }

}
