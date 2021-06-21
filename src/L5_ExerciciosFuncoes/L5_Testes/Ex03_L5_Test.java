import L5_ExerciciosFuncoes.Ex03_L5;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex03_L5_Test {

    Ex03_L5 ex03_l5 = new Ex03_L5();
    @Test
    public void setSoma() {
        ex03_l5.setSoma(1, 1, 1);
        assertEquals(3, ex03_l5.getSoma());
    }
}