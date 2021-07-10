package edu.learn.vaadin.application.data.generic;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class CrudService<T, ID> {
    public CrudService() {
    }

    protected abstract JpaRepository<T, ID> getRepository();

    public Optional<T> get(ID id) {
        return this.getRepository().findById(id);
    }

    public T update(T entity) {
        return this.getRepository().save(entity);
    }

    public void delete(ID id) {
        this.getRepository().deleteById(id);
    }

    public Page<T> list(Pageable pageable) {
        return this.getRepository().findAll(pageable);
    }

    public int count() {
        return (int)this.getRepository().count();
    }
}
