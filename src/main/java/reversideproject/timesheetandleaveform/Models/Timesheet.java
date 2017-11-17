package reversideproject.timesheetandleaveform.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Mark this class as an entity
@Entity
public class Timesheet {

    //Add an ID property
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    //Declare objects here
    private String name;
    private String surname;
    private int totalHours;

    public Timesheet(){

    }

    public Timesheet(String name, String surname, int totalHours) {
        this.name = name;
        this.surname = surname;
        this.totalHours = totalHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }


    public long getId() {
        return id;
    }
}
