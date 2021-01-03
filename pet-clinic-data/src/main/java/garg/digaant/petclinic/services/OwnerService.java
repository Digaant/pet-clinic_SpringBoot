package garg.digaant.petclinic.services;

import garg.digaant.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
