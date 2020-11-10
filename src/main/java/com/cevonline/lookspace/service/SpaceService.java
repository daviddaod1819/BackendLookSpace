package com.cevonline.lookspace.service;

import com.cevonline.lookspace.domain.Space;
import com.cevonline.lookspace.repository.SpaceRepository;
import com.cevonline.lookspace.repository.search.SpaceSearchRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * Service Implementation for managing {@link Space}.
 */
@Service
@Transactional
public class SpaceService {

    private final Logger log = LoggerFactory.getLogger(SpaceService.class);

    private final SpaceRepository spaceRepository;

    private final SpaceSearchRepository spaceSearchRepository;

    public SpaceService(SpaceRepository spaceRepository, SpaceSearchRepository spaceSearchRepository) {
        this.spaceRepository = spaceRepository;
        this.spaceSearchRepository = spaceSearchRepository;
    }

    /**
     * Save a space.
     *
     * @param space the entity to save.
     * @return the persisted entity.
     */
    public Space save(Space space) {
        log.debug("Request to save Space : {}", space);
        Space result = spaceRepository.save(space);
        spaceSearchRepository.save(result);
        return result;
    }

    /**
     * Get all the spaces.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Space> findAll(Pageable pageable) {
        log.debug("Request to get all Spaces");
        return spaceRepository.findAll(pageable);
    }


    /**
     * Get one space by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Space> findOne(Long id) {
        log.debug("Request to get Space : {}", id);
        return spaceRepository.findById(id);
    }

    /**
     * Delete the space by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Space : {}", id);
        spaceRepository.deleteById(id);
        spaceSearchRepository.deleteById(id);
    }

    /**
     * Search for the space corresponding to the query.
     *
     * @param query the query of the search.
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Space> search(String query, Pageable pageable) {
        log.debug("Request to search for a page of Spaces for query {}", query);
        return spaceSearchRepository.search(queryStringQuery(query), pageable);    }
}
