/**
 * Created by linux on 7/15/18.
 */
package hello;

/**
 * Created by linux on 7/15/18.
 * Email: luxin0311@live.com
 */
public class Person {

    private final long   id;
    private final String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
