package main.personnel;

import java.time.LocalDate;

public class Assistant extends Employee implements OperatingRoom, Procedural {
    public Assistant(String names, LocalDate birthDate) {
        super(names, birthDate);
    }

    public Assistant(String names) {
        super(names);
    }

    public Assistant() {this("Denis", LocalDate.of(2012, 1, 6));

    }


    @Override
    public void setProcedural() {

    }
    @Override
    public void setOperatingRoom() {

    }

    @Override
    public void setPlanned() {

    }
}
