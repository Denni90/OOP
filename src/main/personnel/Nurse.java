package main.personnel;

import java.time.LocalDate;

public abstract class Nurse extends Employee implements Procedural, Planned {
    public Nurse(String names, LocalDate birthDate) {
        super(names, birthDate);
    }

    public Nurse(String names) {
        super(names);
    }

    public Nurse() {this("Olga", LocalDate.of(2009, 10, 5));

    }

    @Override
    public void setPlanned() {

    }

    @Override
    public void setProcedural() {

    }
}