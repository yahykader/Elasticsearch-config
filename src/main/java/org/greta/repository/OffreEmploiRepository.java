package  org.greta.repository;

import  org.greta.entites.OffreEmploi;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface OffreEmploiRepository extends ElasticsearchRepository<OffreEmploi,String> {

  public List<OffreEmploi> findByContenuOffre(String contenuOffre);
}
