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
    public abstract void operation3();

    public void template_method() {
        operation1();
        setup();
        operation2();
        operation3();
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

            File file = new File(outFile);

            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else{
                System.out.println("Delete operation is failed.");
            }

            FileWriter writer = new FileWriter(outFile, true);

            if(this.matches.size() != 0) {
                System.out.print("Matches:\n");
                writer.write("Matches:\n" );

                for(Map.Entry<Person, Person> entry : this.matches.entrySet()) {
                    System.out.print("\t[" + entry.getKey().getObjectId() + " , " + entry.getValue().getObjectId() + "]\n");
                    writer.write("\t[" + entry.getKey().getObjectId() + " , " + entry.getValue().getObjectId() + "]\n");
                }
            } else {
                System.out.print("No matches were found.\n");
                writer.write("No matches were found.\n");
            }

            writer.close();

        } catch (IOException e ) {
            System.err.print(e.getMessage());
        }
    }

}