package com.enit.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.demo.dao.postulerRepository;
import com.enit.demo.entities.*;
import com.enit.demo.services.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class postulerServiceImpl implements postulerService{
    @Autowired
    postulerRepository postulerRepository;
    @Autowired
    postulerService postsService;


  
    @Override
 

    @PostMapping(path="/addPost")
    public String addPost(@RequestBody Postuler postuler)
    {
       postulerRepository.save(postuler);
        return "career added";
    }
    
  

    
    
   
    @Override
    @DeleteMapping(path="/removePostuler/{posId}")
    @ResponseBody
    public  List<Postuler> removePost(@PathVariable("posId") String id){
        System.out.println("In removePost : ");
        postulerRepository.deleteById(id);
        System.out.println("Out of removePost : ");
        return postulerRepository.findAll();
       
    }
    
    @Override
    @PutMapping(path="/updatePost")
    @ResponseBody
    public void updatePost(Postuler Postuler){
        
        postulerRepository.save(Postuler);
    }
    @Override
    @GetMapping("/findPostuler/{posId}")
    @ResponseBody
    public Optional<Postuler> findPostById(@PathVariable("posId") String id){
    	System.out.println("IN FIND POST ");
        return postulerRepository.findById(id);
       
        
    }
    @Override
    @GetMapping("/getAllPost")
    @ResponseBody
    public List<Postuler> getAllPostules(){
    	System.out.println("list des project : ");
        return postulerRepository.findAll();
    }
}
