package cientistavuador.testepdf;

import com.formdev.flatlaf.FlatDarkLaf;
import java.lang.reflect.InvocationTargetException;
import javax.swing.SwingUtilities;

/**
 *
 * @author Cien
 */
public class Main {

    static {
        FlatDarkLaf.setup();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(() -> {
            PDFMerge merge = new PDFMerge();
            merge.init();
        });
    }
    
}
