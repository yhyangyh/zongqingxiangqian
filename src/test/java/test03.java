import aimToOffer.test03.SolutionYh;
import org.testng.annotations.Test;


/**
 * Created by yyh on 2020/7/26 下午3:41
 */
public class test03 {

    @Test
    public void test() {
        int[] a = {1, 2, 2};
        new SolutionYh().duplicate(a, 3, new int[1]);
    }
}
