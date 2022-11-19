import hhMethod.HhMethod;
import org.junit.Test;

public class Run {

    private HhMethod hhMethod = new HhMethod();

    @Test
    public void start() throws InterruptedException {

        hhMethod.openApp();
        hhMethod.auth();
        Thread.sleep(30000);
        hhMethod.reply();
    }
}