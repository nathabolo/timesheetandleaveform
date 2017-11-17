package reversideproject.timesheetandleaveform.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reversideproject.timesheetandleaveform.Models.Timesheet;
import reversideproject.timesheetandleaveform.Repositories.TimesheetRepository;
import java.util.List;

@RestController
        @RequestMapping(value = "/timesheets")
        public class HRManager {
            //Add a reference to the TimesheetRepositoty
            private TimesheetRepository timesheetRepository;

            @Autowired
            public HRManager(TimesheetRepository timesheetRepository){
                this.timesheetRepository = timesheetRepository;
    }

    //A method to retrieve all the time sheet information
            @RequestMapping(value = "/data", method = RequestMethod.GET)
            public List<Timesheet> getAll(){
              return timesheetRepository.findAll();
            }

            //A method that filters the timesheets by total hours worked
            @RequestMapping(value = "collection/{hours}", method = RequestMethod.GET)
            public List<Timesheet>getTimesheets(@PathVariable int hours){
                    return timesheetRepository.findByTotalHoursGreaterThan(hours) ;
            }

            //A post method to create a list of timesheets
            @RequestMapping(value = "/create", method = RequestMethod.POST)
            public List<Timesheet> create(@RequestBody Timesheet timesheet){
              timesheetRepository.save(timesheet);
              return timesheetRepository.findAll();
            }

            //A method to delete timesheet
            @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
            public  List<Timesheet> remove(@PathVariable long id){
                timesheetRepository.delete(id);
                return timesheetRepository.findAll();
            }
}

