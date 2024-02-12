package main.personnel;

import java.time.LocalDate;

public class HeadNurse extends Employee implements OperatingRoom, Procedural, Planned {
    public HeadNurse(String names, LocalDate birthDate) {
        super(names, birthDate);
    }

    public HeadNurse(String names) {
        super(names);
    }

    public HeadNurse() {this("Mary", LocalDate.of(2001, 12, 4));

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