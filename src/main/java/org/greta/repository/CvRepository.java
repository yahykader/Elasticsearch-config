package org.greta.repository;

import org.greta.entites.Cv;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CvRepository extends ElasticsearchRepository<Cv,String> {

}
