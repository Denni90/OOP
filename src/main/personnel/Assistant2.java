package main.personnel;

import java.time.LocalDate;

public abstract class Assistant2 extends Employee implements OperatingRoom, Procedural {
    public Assistant2(String names, LocalDate birthDate) {
        super(names, birthDate);
    }

    public Assistant2(String names) {
        super(names);
    }

    public Assistant2() {this("Andrey", LocalDate.of(2000, 12, 10));
    }

    @Override
    public void setProcedural() {

    }
    @Override
    public void setOperatingRoom() {

    }
}