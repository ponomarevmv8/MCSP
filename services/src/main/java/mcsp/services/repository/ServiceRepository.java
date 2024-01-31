package mcsp.services.repository;

import mcsp.services.entity.Classification;
import mcsp.services.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {

    @Query(value = """
            SELECT * FROM service c
            WHERE c.classification_id = :classificationId
            """, nativeQuery = true)
    List<Service> findAllByClassificationId(@Param("classificationId") Long classificationId);


    void deleteAllByClassification(Classification classification);
}
