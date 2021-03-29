package com.gt.hrworker.resources;

import com.gt.hrworker.entities.Worker;
import com.gt.hrworker.repositories.WorkerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {

    private static Logger logger = LoggerFactory.getLogger(WorkerResources.class);

    @Autowired
    private Environment env;

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = workerRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){

        logger.info("Port = " + env.getProperty(("local.server.port")));
        Worker obj = workerRepository.findById(id).get();
        return ResponseEntity.ok().body(obj);
    }
}
