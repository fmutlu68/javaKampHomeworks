package nLayeredHomeworkECommerceSystem.business.abstracts;

import nLayeredHomeworkECommerceSystem.core.entities.Entity;

public interface Validator<T extends Entity> {
	boolean runValidators(T entity);
}
