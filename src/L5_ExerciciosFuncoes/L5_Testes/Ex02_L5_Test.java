import L5_ExerciciosFuncoes.Ex02_L5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ex02_L5_Test {
    public final Ex02_L5 ex02_l5 = new Ex02_L5();

    @Test
    public void montarEstrutura() {
        assertEquals("1 \n", ex02_l5.montarEstrutura(1));
        assertEquals("1 \n1 2 \n1 2 3 \n1 2 3 4 \n", ex02_l5.montarEstrutura(4));
    }
}