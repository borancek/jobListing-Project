package com.Cluster0.joblisting.repository;

import com.Cluster0.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
