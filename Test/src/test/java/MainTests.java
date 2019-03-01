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
        Assert.assertNotNull(value);
    }

    @Test
    public void edad(){
        Edad e = new Edad();
        boolean value=e.requestEdad();
        Assert.assertFalse(value);
    }

    @Test
    public void genero(){
        Género g = new Género();
        String value=g.RequestGenero();
        Assert.assertNotNull(value);
    }

    @Test
    public void telefono(){
        Telefono t = new Telefono();
        int value=t.numerotelefono();
        Assert.assertNotNull(value);
    }

    @Test
    public void origen(){
        Origen o = new Origen();
        String value=o.origen9();
        Assert.assertNotNull(value);
    }

}
