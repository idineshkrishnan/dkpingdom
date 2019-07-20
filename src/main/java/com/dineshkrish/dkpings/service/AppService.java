package com.dineshkrish.dkpings.service;

import com.dineshkrish.dkpings.dao.AppRespository;
import com.dineshkrish.dkpings.model.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppService {

    @Autowired
    private AppRespository respository;

    public App add(App app) {
        return respository.save(app);
    }

    public App update(App app) {
        return respository.save(app);
    }

    public Iterable<App> getAll() {
        return respository.findAll();
    }

    public App get(Integer id) {
        Optional<App> optionalApp = respository.findById(id);
        if(optionalApp.isPresent()) {
            return optionalApp.get();
        } else {
            throw new RuntimeException("Not Found");
        }
    }

    public void delete(Integer id) {
        respository.deleteById(id);
    }
}
