package ru.netology.domain.attachments;

public class Doc {
    private int id; //	идентификатор документа
    private int ownerId; // идентификатор пользователя, загрузившего документ
    private String title; //название документа
    private int size; // размер документа в байтах
    private String ext; //расширение документа
    private String url; //адрес документа, по которому его можно загрузить
    private int date; //дата добавления в формате Unixtime
    private int type; // тип документа. Возможные значения: 1 — текстовые документы;
    // 2 — архивы; 3 — gif; 4 — изображения; 5 — аудио; 6 — видео; 7 — электронные книги; 8 — неизвестно.
    // private Preview preview;

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
