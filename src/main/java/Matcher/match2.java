package Matcher;

import Person.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by seth on 11/30/16.
 */
public class match2 extends Matcher {

    private void iterate(ArrayList<Person> persons) {
        for(int i = 0; i < persons.size(); i++) {
            for(int j = i+1; j < persons.size(); j++) {
                Person p1 = persons.get(i);
                Person p2 = persons.get(j);

                if(p1.getSSN() == p2.getSSN() &&
                        p1.getBirthMonth() == p2.getBirthMonth() &&
                        p1.getBirthDay() == p2.getBirthDay() &&
                        p1.getBirthYear() == p2.getBirthYear()) {
                    this.matches.put(p1, p2);
                }
            }
        }
    }

    @Override
    public void operation1() {
        this.bucket = new Bucket().getBucket();
        this.matches = new HashMap<Person, Person>();
        this.path = "documents/matches_2.txt";
    }

    @Override
    public void operation2() {

    }
}
