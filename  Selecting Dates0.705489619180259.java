·       Ability to select the dates from the calendar.
·       Ability to select the month from the drop down menu.
·       The dates should be displayed as per selection done by the user.

Controller:
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarController {

    @GetMapping("/getDates")
    public Date getDates(@RequestParam Date startDate, @RequestParam Date endDate){
        return dateService.getDataFromDateToToDate(startDate, endDate);
    }
}

Service:
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DateService {
    public Date getDataFromDateToToDate(Date startDate, Date endDate){
        //business logic to get data from date to to-date
        return date;
    }
}

Repository:
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateRepository extends JpaRepository<Date, Long> {

}