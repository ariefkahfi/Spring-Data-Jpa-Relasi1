package com.arief.Repositories;

import com.arief.entity.Murid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Arief on 8/23/2017.
 */
@Repository
public interface MuridRepo extends CrudRepository<Murid,Integer>{
}
