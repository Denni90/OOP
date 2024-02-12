package main.personnel;

import java.time.LocalDate;

public class Doctor extends Employee implements Procedural, Planned{

    public Doctor(String names, LocalDate birthDate) {
        super(names, birthDate);
    }

    public Doctor(String names) {
        super(names);
    }

    public Doctor() {this("Andrey", LocalDate.of(2010, 12, 5));
    }

    @Override
    public void setPlanned() {

    }

    @Override
    public void setProcedural() {

    }
    @Override
    public void setOperatingRoom() {

    }
}
