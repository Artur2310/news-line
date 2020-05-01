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
    @ApiModelProperty(notes = "The database generated post ID")
    private Integer id;

    @Column(name = "title", length = 200)
    @NotNull
    @ApiModelProperty(notes = "The post title")
    String title;

    @Column(name = "text")
    @ApiModelProperty(notes = "The post content")
    String text;

    @Column(name = "author")
    @ApiModelProperty(notes = "Posted by")
    Integer author;

    @Column(name = "image")
    @ApiModelProperty(notes = "Post picture id")
    Integer image;

    @Column(name = "date")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @ApiModelProperty(notes = "Date of creation")
    Date date;

    @Column(name = "likes")
    @NotNull
    @ApiModelProperty(notes = "Count likes")
    Integer likes;

    @Column(name = "dislikes")
    @NotNull
    @ApiModelProperty(notes = "Count dislikes")
    Integer dislikes;

    @Column(name = "views")
    @ApiModelProperty(notes = "Count views")
    Integer views;
}
