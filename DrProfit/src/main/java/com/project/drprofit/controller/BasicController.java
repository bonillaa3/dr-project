package com.project.drprofit.controller;

import com.project.drprofit.model.Resource;
import com.project.drprofit.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BasicController {

    @Autowired
    BasicService basicService;

    @PostMapping("/addItem")
    public ResponseEntity<Resource> addResourceToInventory(@RequestBody Resource resource){
        Resource addedResource = basicService.addResource(resource);
        if(addedResource == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(resource, HttpStatus.OK);
    }
}
