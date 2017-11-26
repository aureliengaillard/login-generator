package geco;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PasswordGenerationTest {
    private PasswordGeneration pg = new PasswordGeneration();

    @Test
    public void getRandomPasswordTest() throws Exception {
        String res = pg.getRandomPassword();
        assertThat(res.length(), is(8));
    }
}