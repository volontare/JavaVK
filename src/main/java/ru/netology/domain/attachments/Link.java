package ru.netology.domain.attachments;

public class Link {
    private String url; //URL ссылки
    private String title; //заголовок ссылки
    private String caption; //подпись ссылки (если имеется)
    private String description; //описание ссылки
    private Photo photo; //изображение превью, объект фотографии (если имеется)
    // private Product product;
    // private Button button;
    private String previewPage; //идентификатор вики-страницы с контентом для предпросмотра содержимого страницы. Возвращается в формате "owner_id_page_id"
    private String previewUrl; //URL страницы с контентом для предпросмотра содержимого страницы

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getPreviewPage() {
        return previewPage;
    }

    public void setPreviewPage(String previewPage) {
        this.previewPage = previewPage;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }
}
