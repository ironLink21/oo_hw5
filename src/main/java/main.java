import Matcher.*;
import Parser.Parser;

import java.io.File;

/**
 * Created by seth on 11/28/16.
 */
public class main {

    public static void main(String[] args) throws Exception {
        id_birth id_birth = new id_birth();
        id_name id_name = new id_name();
        mother_birth mother_birth = new mother_birth();
        multibirth_gender multibirth_gender = new multibirth_gender();
        names_gender names_gender = new names_gender();
        phone_birth phone_birth = new phone_birth();

        String fileSt = new File("src/main/resources/PersonTestSet_01.json").getAbsolutePath();
//        String fileSt = new File("src/main/resources/PersonTestSet_11.xml").getAbsolutePath();

        if(!fileSt.equals("")) {
            Parser parser = Parser.create(fileSt);

            if(parser == null) {
                System.out.print("Incorrect File Type");
                return;
            }

            parser.openFile(fileSt);

            // run matchers
            id_birth.template_method();
            id_name.template_method();
            mother_birth.template_method();
            multibirth_gender.template_method();
            names_gender.template_method();
            phone_birth.template_method();
        }
    }
}

