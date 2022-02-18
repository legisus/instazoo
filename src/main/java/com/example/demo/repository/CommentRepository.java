package com.example.demo.repository;

import com.example.demo.entity.Commentaries;
import com.example.demo.entity.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository <Commentaries, Long>{

    List<Commentaries> findAllByPost(Post post);

    Commentaries findByIdAndUserId(Long commentId, Long userId);
}
