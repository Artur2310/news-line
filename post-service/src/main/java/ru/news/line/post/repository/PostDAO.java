package ru.news.line.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.news.line.post.model.Post;

@Repository
public interface PostDAO extends JpaRepository<Post, Integer> {
}
