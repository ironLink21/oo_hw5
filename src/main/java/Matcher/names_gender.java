package Matcher;

import Person.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by seth on 12/1/16.
 */
public class names_gender extends Matcher {

    private void iterate(ArrayList<Person> persons) {
        for(int i = 0; i < persons.size(); i++) {
            for(int j = i+1; j < persons.size(); j++) {
                Person p1 = persons.get(i);
                Person p2 = persons.get(j);

                if(p1.getFirstName().equals(p2.getFirstName()) &&
                        p1.getMiddleName().equals(p2.getMiddleName()) &&
                        p1.getLastName().equals(p2.getLastName()) &&
                        p1.getGender().equals(p2.getGender())) {
                    this.matches.put(p1, p2);
                }
            }
        }
    }

    private ArrayList<Person> removeNull(ArrayList<Person> persons) {
        ArrayList<Person> tempArray = new ArrayList<Person>();
        for(int i = 0; i < persons.size(); i++) {
            Person p1 = persons.get(i);

            if(p1.getFirstName() != null &&
                    p1.getMiddleName() != null &&
                    p1.getLastName() != null &&
                    p1.getGender() != null) {
                tempArray.add(p1);
            }
        }
        return tempArray;
    }

    @Override
    public void operation1() {
        this.adults = new ArrayList<Person>();
        this.children = new ArrayList<Person>();
        this.bucket = new Bucket().getBucket();
        this.matches = new HashMap<Person, Person>();
        this.path = "src/documents/matches_5.txt";
    }

    @Override
    public void operation2() {
        this.adults = removeNull(this.adults);
        this.children = removeNull(this.children);
    }

    @Override
    public void operation3() {
        iterate(this.adults);
        iterate(this.children);
    }
}
