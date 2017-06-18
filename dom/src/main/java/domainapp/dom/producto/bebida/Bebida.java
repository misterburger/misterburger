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

import domainapp.dom.producto.Producto;
import org.apache.isis.applib.annotation.DomainObject;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

/**
 * Created for domainapp.dom.producto.bebida on 18/06/2017.
 */
@DomainObject(bounded = true)
@PersistenceCapable(identityType = IdentityType.DATASTORE)
public class Bebida extends Producto {

    public String title() { return getNombre(); }

    @Column(allowsNull = "false")
    private BebidaTipoEnum tipo;
    public BebidaTipoEnum getTipo() {
        return tipo;
    }
    public void setTipo(BebidaTipoEnum tipo) {
        this.tipo = tipo;
    }

}
