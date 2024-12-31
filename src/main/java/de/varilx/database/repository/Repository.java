package de.varilx.database.repository;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface Repository<ENTITY, ID> {

    CompletableFuture<List<ENTITY>> sortAll(String field, boolean ascending, int limit);

    CompletableFuture<List<ENTITY>> findAll();

    CompletableFuture<ENTITY> findFirstById(ID id);

    CompletableFuture<Void> deleteById(ID id);

    CompletableFuture<Void> save(ENTITY entity);

    CompletableFuture<Void> insert(ENTITY entity);

    CompletableFuture<Boolean> exists(ID id);

    CompletableFuture<Void> deleteAll();

    CompletableFuture<ENTITY> findByFieldName(String name, Object value);

}
