package Person;

import java.util.ArrayList;

/**
 * Created by seth on 11/30/16.
 */
public class Bucket {
    private static ArrayList<Person> bucket;

    public Bucket() {
    }

    public Bucket(ArrayList<Person> bucket) {
        this.bucket = bucket;
    }

    //    getters and setters
    public ArrayList<Person> getBucket() {
        return bucket;
    }

    public void setBucket(ArrayList<Person> bucket) {
        this.bucket = bucket;
    }

    //    other Methods
    public void addPerson(Person person) {
        this.bucket.add(person);
    }
}
