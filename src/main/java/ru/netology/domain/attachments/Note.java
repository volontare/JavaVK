package ru.netology.domain.attachments;

public class Note {
    private int id; // идентификатор заметки
    private int ownerId; // идентификатор владельца заметки
    private String title; // заголовок заметки
    private String text; // текст заметки
    private int date; // дата создания заметки в формате Unixtime
    private int comments; // количество комментариев
    private int readComments; // количество прочитанных комментариев (только при запросе информации о заметке текущего пользователя)
    private String viewUrl; // URL страницы для отображения заметки

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getReadComments() {
        return readComments;
    }

    public void setReadComments(int readComments) {
        this.readComments = readComments;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }
}
