package ru.netology.domain;

public class CommentsInfo {
    private int commentAuthorId; //id автора комментария
    private String commentAuthorUrl; //ссылка на страницу автора комментария
    private String commentAuthorImageUrl; //аватар автора комментария
    private int commentId; //id комментария
    private int commentCount; //счетчик комментариев
    private boolean canComment; //можно комментировать или нет
    private int commentLikesCount; //счетчик лайков к комментарию
    private int commentDate; //дата и время комментария
}
