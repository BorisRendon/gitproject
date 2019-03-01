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
        String value=n.requestName("Pedro");
        Assert.assertEquals(value, "Pedro");
    }

    @Test
    public void dpi(){
        DPI d = new DPI();
        int value=d.numeroDPI(999999999);
        Assert.assertEquals(value, 999999999);
    }

    @Test
    public void edad(){
        Edad e = new Edad();
        boolean value=e.requestEdad(8);
        Assert.assertFalse(value);
    }

    @Test
    public void genero(){
        Género g = new Género();
        String value=g.RequestGenero("masculino");
        Assert.assertEquals(value, "masculino");
    }

    @Test
    public void telefono(){
        Telefono t = new Telefono();
        int value=t.numerotelefono(22222222);
        Assert.assertEquals(value,22222222);
    }

    @Test
    public void origen(){
        Origen o = new Origen();
        String value=o.origen9("Guate");
        Assert.assertEquals(value, "Guate");
    }

}
