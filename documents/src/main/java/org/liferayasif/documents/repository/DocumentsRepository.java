package org.liferayasif.documents.repository;

import org.liferayasif.documents.model.Documents;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentsRepository extends MongoRepository<Documents, String>{
}
