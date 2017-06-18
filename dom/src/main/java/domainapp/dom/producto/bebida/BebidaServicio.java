/*
 * Copyright 2017 domainapp.dom.productos.bebidas
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package domainapp.dom.producto.bebida;

import domainapp.dom.producto.ProductoServicio;
import org.apache.isis.applib.annotation.*;
import org.apache.isis.applib.services.repository.RepositoryService;

import javax.inject.Inject;
import java.math.BigDecimal;

/**
 * Created for domainapp.dom.producto.bebida on 18/06/2017.
 */
@DomainService(
        nature = NatureOfService.VIEW,
        repositoryFor = Bebida.class
)
@DomainServiceLayout(
        named = "Bebidaz",
        menuOrder = "10"
)
public class BebidaServicio extends ProductoServicio {

    @MemberOrder(name="Crear", sequence = "2")
    public Bebida createBebida(
            @ParameterLayout(named="Nombre") String nombre,
            @ParameterLayout(named="Precio") BigDecimal precio,
            @ParameterLayout(named="Tipo") BebidaTipoEnum tipo
    ) {
        final Bebida obj = repositoryService.instantiate(Bebida.class);
        obj.setTipo(tipo);
        obj.setNombre(nombre);
        obj.setPrecio(precio);
        repositoryService.persist(obj);
        return obj;
    }

    @Inject
    RepositoryService repositoryService;
}
