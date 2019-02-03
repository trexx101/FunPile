package io.logia.app.repository;

import io.logia.app.domain.Authority;


/**
 * Spring Data Couchbase repository for the Authority entity.
 */
public interface AuthorityRepository extends N1qlCouchbaseRepository<Authority, String> {
}
