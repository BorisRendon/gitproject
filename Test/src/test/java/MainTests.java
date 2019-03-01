import com.company.DPI;
import com.company.Edad;
import com.company.Género;
import com.company.Nombre;
import com.company.Origen;
import com.company.Telefono;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTests {

    @Test
    public void nombre(){
        Nombre n = new Nombre();
        String value=n.requestName();
        Assert.assertNotNull(value);
    }

    @Test
    public void dpi(){
        DPI d = new DPI();
        int value=d.numeroDPI();
    }

    @Test
    public void edad(){
        Edad e = new Edad();
        //int value=e.
    }

    @Test
    public void genero(){
        Género g = new Género();
        //String value=Main.
    }

    @Test
    public void telefono(){
        Telefono t = new Telefono();
        int value=t.numerotelefono();
    }

    @Test
    public void origen(){
        Origen o = new Origen();
        //String value=o.
    }

}
