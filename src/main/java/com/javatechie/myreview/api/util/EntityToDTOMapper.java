package com.javatechie.myreview.api.util;

import com.javatechie.myreview.api.dto.ArticleRequestDTO;
import com.javatechie.myreview.api.dto.ArticleResponseDTO;
import com.javatechie.myreview.api.model.Article;

import java.util.ArrayList;
import java.util.List;

public class EntityToDTOMapper {

    public static List<ArticleResponseDTO> articlesEntityToDTO(List<Article> articles) {
        List<ArticleResponseDTO> responseDTOS = new ArrayList<>();
        articles.forEach(article -> {

            ArticleResponseDTO articleResponseDTO =
                    ArticleResponseDTO.builder()
                            .id(article.getId())
                            .name(article.getName())
                            .type(article.getType())
                            .weight(article.getWeight())
                            .description(article.getDescription())
                            .build();
            responseDTOS.add(articleResponseDTO);

        });
        return responseDTOS;
    }

    public static Article articleDtoToEntity(ArticleRequestDTO requestDTO) {
        return Article.builder()
                .id(requestDTO.getId())
                .name(requestDTO.getName())
                .type(requestDTO.getType())
                .weight(requestDTO.getWeight())
                .description(requestDTO.getDescription())
                .build();
    }
}
