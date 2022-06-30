package com.enit.demo.services;

import java.util.List;
import java.util.Optional;

import com.enit.demo.entities.Postuler;

public interface postulerService {
    public String addPost(Postuler post);

    public List<Postuler> removePost(String id);

    public void updatePost(Postuler Postuler);

    public Optional <Postuler> findPostById(String id);

    public List<Postuler> getAllPostules();
}
