package geco;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LoginGeneratorTest {
    private LoginService ls;
    private LoginGenerator lg;

    @Before
    public void setUp() throws Exception {
        ls = new LoginService(new String[]{"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        lg = new LoginGenerator(ls);
    }

    @Test
    public void generateLoginForNomAndPrenom() throws Exception {
        String res = lg.generateLoginForNomAndPrenom("Durand", "Paul");
        assertThat(res, is("PDUR"));
    }

    @Test
    public void generateLoginForNomAndPrenom3emeJRAL2() throws Exception {
        String res = lg.generateLoginForNomAndPrenom("Ralling", "John");
        assertThat(res, is("JRAL2"));
    }

    @Test
    public void generateLoginForNomAndPrenomJROL1() throws Exception {
        String res = lg.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertThat(res, is("JROL1"));
    }

    @Test
    public void generateLoginForNomAndPrenomPDURAccent() throws Exception {
        String res = lg.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertThat(res, is("PDUR"));
    }
}