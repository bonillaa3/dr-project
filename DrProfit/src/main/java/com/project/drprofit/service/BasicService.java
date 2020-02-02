package com.project.drprofit.service;

import com.project.drprofit.model.Resource;
import com.project.drprofit.repository.BasicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    @Autowired
    BasicRepository basicRepository;

    public Resource addResource(Resource resource) {
        return basicRepository.save(resource);
    }
}
