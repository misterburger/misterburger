package domainapp.dom.producto.hamburguesa;

import org.apache.isis.applib.annotation.*;
import org.apache.isis.applib.services.repository.RepositoryService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created for domainapp.dom.hamburguesa on 17/06/2017.
 */
@DomainService(
        repositoryFor = Hamburguesa.class,
        nature = NatureOfService.VIEW
)
@DomainServiceLayout(
        named = "Burgers",
        menuOrder = "20"
)
public class HamburguesaServicio {

    @ActionLayout(named = "Hamburguesa")
    @MemberOrder(name = "Crear", sequence = "1")
    public Hamburguesa create(
            @ParameterLayout(named="Name") String name
    ) {
        Hamburguesa obj = repositoryService.instantiate(Hamburguesa.class);
        obj.setName(name);
        repositoryService.persist(obj);
        return obj;
    }

    public List<Hamburguesa> listAll() {
        return repositoryService.allInstances(Hamburguesa.class);
    }

    @Inject
    RepositoryService repositoryService;
}
