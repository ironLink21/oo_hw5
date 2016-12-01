package Matcher;

import Person.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by seth on 11/30/16.
 */
abstract class Matcher {
    protected ArrayList<Person> bucket, adults, children;
    protected HashMap<Person, Person> matches;
    protected String path;

    public abstract void operation1();
    public abstract void operation2();

    public void templat_method() {
        setup();
        operation1();
        operation2();
        print_matches();
    }

    public void setup() {
        for(int i = 0; i < this.bucket.size(); i++) {
            Person person = this.bucket.get(i);
            if(person instanceof Adult) {
                this.adults.add(person);
            } else {
                this.children.add(person);
            }
        }
    }

    public void print_matches() {
        String outFile = new File(this.path).getAbsolutePath();

        try {
            FileWriter writer = new FileWriter(outFile, true);
            System.out.print("Matches: ");
            writer.write("Matches: " );

            for(Map.Entry<Person, Person> entry : this.matches.entrySet()) {
                System.out.print("[" + entry.getKey().getObjectId() + " , " + entry.getValue().getObjectId() + "]");
                writer.write("[" + entry.getKey().getObjectId() + " , " + entry.getValue().getObjectId() + "]\n");
            }
            writer.close();

        } catch (IOException e ) {
            System.err.print(e.getMessage());
        }
    }

}