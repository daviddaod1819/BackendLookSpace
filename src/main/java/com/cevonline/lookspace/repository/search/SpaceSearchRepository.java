package com.cevonline.lookspace.repository.search;

import com.cevonline.lookspace.domain.Space;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Space} entity.
 */
public interface SpaceSearchRepository extends ElasticsearchRepository<Space, Long> {
}
