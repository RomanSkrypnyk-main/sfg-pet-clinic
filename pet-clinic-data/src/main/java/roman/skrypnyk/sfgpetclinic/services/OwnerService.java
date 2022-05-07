package roman.skrypnyk.sfgpetclinic.services;

import roman.skrypnyk.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
