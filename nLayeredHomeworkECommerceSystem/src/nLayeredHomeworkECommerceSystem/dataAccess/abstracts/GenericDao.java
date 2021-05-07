package nLayeredHomeworkECommerceSystem.dataAccess.abstracts;

import java.util.List;

import nLayeredHomeworkECommerceSystem.core.entities.Entity;

public interface GenericDao<T extends Entity> {
	int add(T entity);
	void delete(T entity);
	void update(T entity);
	List<T> getList();
	T getById(int id);
}
