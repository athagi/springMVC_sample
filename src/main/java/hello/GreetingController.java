package hello;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String varsion ="api/v1/schedule";

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/goodbye")
    public Goodbying goodbying(@RequestParam(value="name", defaultValue="World") String name) {
        return new Goodbying(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @SuppressWarnings("deprecation")
	@RequestMapping(varsion)
    public Schedule schedule() {


    	Calendar startCal = Calendar.getInstance();
    	Calendar endCal = Calendar.getInstance();
    	endCal.setTime(new Date(2017, 10, 20));
    	return new Schedule(counter.incrementAndGet(), "phase1", startCal, endCal);
    }

}
