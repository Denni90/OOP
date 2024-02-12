package main.personnel;
import java.time.LocalDate;

public abstract class Employee extends MaintenancePersonel implements OperatingRoom, Procedural, Planned {
    public String names;
    public LocalDate birthDate;

    public Employee(String names, LocalDate birthDate) {
        this.names = names;
        this.birthDate = birthDate;
    }
    public  Employee(String names){
        this.names = names;
        this.birthDate = LocalDate.now();
    }
    public Employee(){
        this("Имя", LocalDate.now());
    }
    public String getType(){
        return getClass().getSimpleName();
    }
    public String getNames() {
        return names;
    }

    @Override
    public String toString(){
    return String.format("names = %s, bd = %s", names, birthDate);

}

}
