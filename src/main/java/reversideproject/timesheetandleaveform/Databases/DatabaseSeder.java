package reversideproject.timesheetandleaveform.Databases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reversideproject.timesheetandleaveform.Models.Timesheet;
import reversideproject.timesheetandleaveform.Repositories.TimesheetRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeder implements CommandLineRunner {

    //Add our repository
    private TimesheetRepository timesheetRepository;

    //The part is my dependency injection
    @Autowired
    public DatabaseSeder(TimesheetRepository timesheetRepository){
        this.timesheetRepository = timesheetRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //Initialize the array list
        List<Timesheet> timesheets = new ArrayList<>();

        //Populate the list with information
        timesheets.add(new Timesheet("Nathaniel", "Mamabolo", 35));
        timesheets.add(new Timesheet("Frans", "Jones", 45));
        timesheets.add(new Timesheet("Jimmy", "Stephens", 40));

        timesheetRepository.save(timesheets);

    }
}
