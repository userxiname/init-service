/**
 * Created by linux on 7/15/18.
 */
package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by linux on 7/15/18.
 * Email: luxin0311@live.com
 */
@RestController
public class DemonController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter  = new AtomicLong();

    @RequestMapping("/hello")
    public Person hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Person(counter.incrementAndGet(), String.format(template, name));
    }
}
