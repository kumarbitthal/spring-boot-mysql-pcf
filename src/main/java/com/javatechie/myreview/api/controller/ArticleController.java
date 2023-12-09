package com.javatechie.myreview.api.controller;

import com.javatechie.myreview.api.dto.ArticleRequestDTO;
import com.javatechie.myreview.api.dto.ArticleResponseDTO;
import com.javatechie.myreview.api.model.Article;
import com.javatechie.myreview.api.reository.ArticleRepository;
import com.javatechie.myreview.api.util.EntityToDTOMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring-jdbc-article")
public class ArticleController {

    private final ArticleRepository articleRepository;

    ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping()
    public List<ArticleResponseDTO> getArticle() {
        return EntityToDTOMapper.articlesEntityToDTO(articleRepository.findAll());
    }

    @PostMapping()
    public String addArticle(@RequestBody ArticleRequestDTO record) {
        articleRepository.save(EntityToDTOMapper.articleDtoToEntity(record));
        return "added article !";
    }
}

