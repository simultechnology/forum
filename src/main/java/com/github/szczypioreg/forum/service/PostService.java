/**
 * Created by Dawid Stankiewicz on 17.07.2016
 */
package com.github.szczypioreg.forum.service;

import java.util.List;
import java.util.Set;

import com.github.szczypioreg.forum.domain.Post;
import com.github.szczypioreg.forum.domain.Topic;
import com.github.szczypioreg.forum.domain.User;

public interface PostService {
    
    Post findOne(int id);
    
    List<Post> findAll();
    
    List<Post> findRecent();
    
    List<Post> findRecent(int count);
    
    Set<Post> findByUser(User user);
    
    Set<Post> findByTopic(int idTopic);
    
    Set<Post> findByTopic(Topic topic);
    
    void save(Post post);
    
    void delete(int id);
    
    void delete(Post post);
    
    void save(String content, String username, int idTopic);
    
}
