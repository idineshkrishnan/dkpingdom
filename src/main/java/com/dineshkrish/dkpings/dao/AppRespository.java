package com.dineshkrish.dkpings.dao;

import com.dineshkrish.dkpings.model.App;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRespository extends CrudRepository<App, Integer> {

}
