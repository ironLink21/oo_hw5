package Matcher;

import Parser.Parser;
import Person.Person;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by seth on 12/8/16.
 */
public class id_nameTest {
    @Test
    public void operation1() throws Exception {
        Matcher matcher = new id_name();
        String fileSt = new File("src/main/resources/PersonTestSet_01.json").getAbsolutePath();
        Parser parser = Parser.create(fileSt);
        parser.openFile(fileSt);

        matcher.operation1();

        assertNotNull(matcher.adults);
        assertNotNull(matcher.children);
        assertNotNull(matcher.bucket);
        assertNotNull(matcher.matches);
        assertNotNull(matcher.path);

        assertEquals(new ArrayList<Person>().getClass().getName(), matcher.adults.getClass().getName());
        assertEquals(new ArrayList<Person>().getClass().getName(), matcher.children.getClass().getName());
        assertEquals(new ArrayList<Person>().getClass().getName(), matcher.bucket.getClass().getName());
        assertEquals(new HashMap<Person, Person>().getClass().getName(), matcher.matches.getClass().getName());
        assertEquals(new String().getClass().getName(), matcher.path.getClass().getName());

        assertEquals(0, matcher.adults.size());
        assertEquals(0, matcher.children.size());
        assertEquals(5, matcher.bucket.size());
        assertEquals(0, matcher.matches.size());
        assertEquals("src/documents/matches_2.txt", matcher.path);

        Person person = matcher.bucket.get(0);
        assertEquals("Frank", person.getFirstName());
        assertEquals("William", person.getMiddleName());
        assertEquals("Kilpack", person.getLastName());
        assertEquals(null, person.getSocialSecurityNumber());
    }

    @Test
    public void operation2() throws Exception {
        Matcher matcher = new id_name();
        String fileSt = new File("src/main/resources/PersonTestSet_01.json").getAbsolutePath();
        Parser parser = Parser.create(fileSt);
        parser.openFile(fileSt);

        matcher.operation1();
        matcher.setup();
        matcher.operation2();

        assertEquals(0, matcher.adults.size());
        assertEquals(0, matcher.children.size());
        assertEquals(5, matcher.bucket.size());

        Person person = matcher.bucket.get(0);
        assertEquals("Frank", person.getFirstName());
        assertEquals("William", person.getMiddleName());
        assertEquals("Kilpack", person.getLastName());
        assertEquals(null, person.getSocialSecurityNumber());
    }

    @Test
    public void operation3() throws Exception {
        Matcher matcher = new id_name();
        String fileSt = new File("src/main/resources/PersonTestSet_01.json").getAbsolutePath();
        Parser parser = Parser.create(fileSt);
        parser.openFile(fileSt);

        matcher.operation1();
        matcher.setup();
        matcher.operation2();
        matcher.operation3();

        assertEquals(0, matcher.adults.size());
        assertEquals(0, matcher.children.size());
        assertEquals(5, matcher.bucket.size());
        assertEquals(0, matcher.matches.size());
    }
}