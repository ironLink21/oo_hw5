package Matcher;

import Person.Bucket;
import Person.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by seth on 12/1/16.
 */
public class phone_birth extends Matcher {
    @Override
    public void operation1() {
        this.adults = new ArrayList<Person>();
        this.children = new ArrayList<Person>();
        this.bucket = new Bucket().getBucket();
        this.matches = new HashMap<Person, Person>();
        this.path = "src/documents/matches_6.txt";
    }

    @Override
    public void operation2() {
        ArrayList<Person> tempArray = new ArrayList<Person>();
        for(int i = 0; i < this.adults.size(); i++) {
            Person p1 = this.adults.get(i);

            if(((Adult) p1).getPhone1() != null &&
                    ((Adult) p1).getPhone2() != null &&
                    p1.getBirthMonth() != null &&
                    p1.getBirthDay() != null &&
                    p1.getBirthYear() != null) {
                tempArray.add(p1);
            }
        }
        this.adults = tempArray;
    }

    @Override
    public void operation3() {
        for(int i = 0; i < this.adults.size(); i++) {
            for(int j = i+1; j < this.adults.size(); j++) {
                Person p1 = this.adults.get(i);
                Person p2 = this.adults.get(j);

                if(((Adult) p1).getPhone1() == ((Adult) p2).getPhone1() &&
                        ((Adult) p1).getPhone2() == ((Adult) p2).getPhone2() &&
                        p1.getBirthMonth() == p2.getBirthMonth() &&
                        p1.getBirthDay() == p2.getBirthDay() &&
                        p1.getBirthYear() == p2.getBirthYear()) {
                    this.matches.put(p1, p2);
                }
            }
        }
    }
}
