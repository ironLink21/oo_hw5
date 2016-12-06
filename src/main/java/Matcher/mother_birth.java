package Matcher;

import Person.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by seth on 12/1/16.
 */
public class mother_birth extends Matcher {
    @Override
    public void operation1() {
        this.adults = new ArrayList<Person>();
        this.children = new ArrayList<Person>();
        this.bucket = new Bucket().getBucket();
        this.matches = new HashMap<Person, Person>();
        this.path = "src/documents/matches_3.txt";
    }

    @Override
    public void operation2() {
        ArrayList<Person> tempArray = new ArrayList<Person>();
        for(int i = 0; i < this.children.size(); i++) {
            Person p1 = this.children.get(i);

            if(((Child) p1).getMotherFirstName() != null &&
                    ((Child) p1).getMotherLastName() != null &&
                    p1.getBirthMonth() != null &&
                    p1.getBirthDay() != null &&
                    p1.getBirthYear() != null) {
                tempArray.add(p1);
            }
        }
        this.children = tempArray;
    }

    @Override
    public void operation3() {
        for(int i = 0; i < this.children.size(); i++) {
            for(int j = i+1; j < this.children.size(); j++) {
                Person p1 = this.children.get(i);
                Person p2 = this.children.get(j);

                if(((Child) p1).getMotherFirstName() == ((Child) p2).getMotherFirstName() &&
                        ((Child) p1).getMotherMiddleName() == ((Child) p2).getMotherMiddleName() &&
                        ((Child) p1).getMotherLastName() == ((Child) p2).getMotherLastName() &&
                        p1.getBirthMonth() == p2.getBirthMonth() &&
                        p1.getBirthDay() == p2.getBirthDay() &&
                        p1.getBirthYear() == p2.getBirthYear()) {
                    this.matches.put(p1, p2);
                }
            }
        }
    }
}
