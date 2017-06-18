package domainapp.dom.producto.hamburguesa;

import domainapp.dom.producto.Producto;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

/**
 * Created for domainapp.dom.hamburguesa on 17/06/2017.
 */
@PersistenceCapable(identityType = IdentityType.DATASTORE)
public class Hamburguesa extends Producto{

    public String title() { return getName(); }

    @Column(allowsNull = "false")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
