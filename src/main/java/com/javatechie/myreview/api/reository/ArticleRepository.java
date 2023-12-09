package com.javatechie.myreview.api.reository;

import com.javatechie.myreview.api.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, String> {
}
