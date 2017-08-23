package com.arief.Repositories;

import com.arief.entity.Kelas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Arief on 8/23/2017.
 */
@Repository
public interface KelasRepo extends CrudRepository<Kelas,String>{
}
