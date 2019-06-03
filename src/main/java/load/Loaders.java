package load;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.greta.entites.OffreEmploi;
import org.greta.repository.OffreEmploiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Loaders {
	
	
	

    @Autowired
    private OffreEmploiRepository offreRepository;
    @Autowired
    private ElasticsearchOperations elasticsearchOperations;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;



    @PostConstruct
    @Transactional
    public void loadAll(){

        elasticsearchTemplate.putMapping(OffreEmploi.class);
        System.out.println("Loading Data");
        offreRepository.save(getData());
        System.out.println("Loading Completed");


    }

    private List<OffreEmploi> getData() {
        List<OffreEmploi> offres=new ArrayList<>();
        offres.add(new OffreEmploi(1L,"aa","rrr","2015-10-10","2015-10-12","eeeeeeeeeeeeeeeee"));
        offres.add(new OffreEmploi(2L,"aa","rrr","2015-10-10","2015-10-12","eeeeeeeeeeeeeeeee"));
        offres.add(new OffreEmploi(5L,"aa","rrr","2015-10-10","2015-10-12","eeeeeeeeeeeeeeeee"));
        return offres;
    }

}
