package ru.news.line.post.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Table(name = "post")
@Getter
@Setter
@ApiModel(description = "All details about the Post. ")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", length = 200)
    @NotNull
    @ApiModelProperty(notes = "The post title")
    String title;

    @Column(name = "text")
    String text;

    @Column(name = "author")
    Integer author;

    @Column(name = "image")
    Integer image;

    @Column(name = "date")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    Date date;

    @Column(name = "likes")
    @NotNull
    @ApiModelProperty(notes = "Count likes")
    Integer likes;

    @Column(name = "dislikes")
    @NotNull
    Integer dislikes;

    @Column(name = "views")
    @ApiModelProperty(notes = "Count views")
    Integer views;
}
