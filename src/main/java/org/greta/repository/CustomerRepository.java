package org.greta.repository;

import java.util.List;


import org.greta.entites.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

	List<Customer> findByFirstName(String firstName );

}
