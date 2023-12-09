package com.javatechie.myreview.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ArticleRequestDTO {

    String id;
    String name;
    String type;
    int weight;
    String description;
}
