package Matcher;

import Person.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by seth on 12/1/16.
 */
public class multibirth_gender extends Matcher {
    @Override
    public void operation1() {
        this.bucket = new Bucket().getBucket();
        this.matches = new HashMap<Person, Person>();
        this.path = "documents/matches_4.txt";
    }

    @Override
    public void operation2() {
        ArrayList<Person> tempArray = null;
        for(int i = 0; i < this.children.size(); i++) {
            Person p1 = this.children.get(i);

            if(((Child) p1).getIsPartOfMultipleBirth() != null &&
                    ((Child) p1).getBirthOrder() != null &&
                    p1.getGender() != null) {
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

                if(((Child) p1).getIsPartOfMultipleBirth() == ((Child) p2).getIsPartOfMultipleBirth() &&
                        ((Child) p1).getBirthOrder() == ((Child) p2).getBirthOrder() &&
                        p1.getGender() == p2.getGender()) {
                    this.matches.put(p1, p2);
                }
            }
        }
    }
}
