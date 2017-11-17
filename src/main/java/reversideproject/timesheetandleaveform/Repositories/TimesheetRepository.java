package reversideproject.timesheetandleaveform.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reversideproject.timesheetandleaveform.Models.Timesheet;

import java.util.List;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet, Long> {

    List<Timesheet>findByTotalHoursGreaterThan(int hours);
}
