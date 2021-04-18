package ru.netology.domain.attachments;

public class Video {
    private int id; // идентификатор видеозаписи
    private int ownerId; // идентификатор владельца видеозаписи
    private String title; // название видеозаписи
    private String description; // текст описания видеозаписи
    private int duration; // длительность ролика в секундах
    private int date; // дата создания видеозаписи в формате Unixtime
    private int addingDate; // дата добавления видеозаписи пользователем или группой в формате Unixtime
    private int views; // количество просмотров видеозаписи
    private int localViews; // если видео внешнее, количество просмотров в ВК
    private int comments; //количество комментариев к видеозаписи.
    private String player; //URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере. Поддерживается flash и html5, плеер всегда масштабируется по размеру окна.
    private String platform; //название платформы (для видеозаписей, добавленных с внешних сайтов)
    private int[] canAdd; //Может ли пользователь добавить видеозапись к себе. 0 — Не может добавить.1 — Может добавить.
    private int[] isPrivate; //поле возвращается, если видеозапись приватная (например, была загружена в личное сообщение), всегда содержит 1
    private String accessKey; //ключ доступа к объекту
    private int[] processing; //поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
    private boolean isFavorite; //true, если объект добавлен в закладки у текущего пользователя
    private int[] canComment; //Может ли пользователь комментировать видео. 0 — Не может комментировать. 1 — Может комментировать
    private int[] canEdit; //Может ли пользователь редактировать видео.0 — Не может редактировать. 1 — Может редактировать.
    private int[] canLike; //Может ли пользователь добавить видео в список <<Мне нравится>>.0 — Не может добавить. 1 — Может добавить
    private int[] canRepost; //Может ли пользователь сделать репост видео. 0 — Не может сделать репост. 1 — Может сделать репост
    private int[] canSubscribe; //Может ли пользователь подписаться на автора видео. 0 — Не может подписаться. 1 — Может подписаться
    private int[] canAddToFaves; //Может ли пользователь добавить видео в избранное. 0 — Не может добавить. 1 — Может добавить
    private int[] canAttachlink[]; //Может ли пользователь прикрепить кнопку действия к видео. 0 — Не может прикрепить. 1 — Может прикрепить
    private int width; //ширина видео
    private int height; //высота видео
    private int userId; //Идентификатор пользователя, загрузившего видео, если оно было загружено в группу одним из участников
    private int[] converting; //Конвертируется ли видео. 0 — Не конвертируется. 1 — Конвертируется
    private int[] added; //Добавлено ли видео в альбомы пользователя. 0 — Не добавлено. 1 — Добавлено.
    private int[] isSubscribed; //Подписан ли пользователь на автора видео. 0 — Не подписан. 1 — Подписан
    private int repeat; //поле возвращается в том случае, если видео зациклено, всегда содержит 1
    private String type; //Тип видеозаписи. Может принимать значения: "video", "music_video", "movie"
    private int balance; //Баланс донатов в прямой трансляции
    private String liveStatus; //Статус прямой трансляции. Может принимать значения: "waiting", "started", "finished", "failed", "upcoming"
    private int[] live; //поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1. Обратите внимание, в этом случае в поле duration содержится значение 0.
    private int[] upcoming; //(для live = 1). Поле свидетельствует о том, что трансляция скоро начнётся
    private int spectators; //Количество зрителей прямой трансляции
    //private LikesInfo likesInfo;
    //private RepostsInfo repostsInfo;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(int addingDate) {
        this.addingDate = addingDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLocalViews() {
        return localViews;
    }

    public void setLocalViews(int localViews) {
        this.localViews = localViews;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int[] getCanAdd() {
        return canAdd;
    }

    public void setCanAdd(int[] canAdd) {
        this.canAdd = canAdd;
    }

    public int[] getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(int[] isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public int[] getProcessing() {
        return processing;
    }

    public void setProcessing(int[] processing) {
        this.processing = processing;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int[] getCanComment() {
        return canComment;
    }

    public void setCanComment(int[] canComment) {
        this.canComment = canComment;
    }

    public int[] getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int[] canEdit) {
        this.canEdit = canEdit;
    }

    public int[] getCanLike() {
        return canLike;
    }

    public void setCanLike(int[] canLike) {
        this.canLike = canLike;
    }

    public int[] getCanRepost() {
        return canRepost;
    }

    public void setCanRepost(int[] canRepost) {
        this.canRepost = canRepost;
    }

    public int[] getCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(int[] canSubscribe) {
        this.canSubscribe = canSubscribe;
    }

    public int[] getCanAddToFaves() {
        return canAddToFaves;
    }

    public void setCanAddToFaves(int[] canAddToFaves) {
        this.canAddToFaves = canAddToFaves;
    }

    public int[][] getCanAttachlink() {
        return canAttachlink;
    }

    public void setCanAttachlink(int[][] canAttachlink) {
        this.canAttachlink = canAttachlink;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int[] getConverting() {
        return converting;
    }

    public void setConverting(int[] converting) {
        this.converting = converting;
    }

    public int[] getAdded() {
        return added;
    }

    public void setAdded(int[] added) {
        this.added = added;
    }

    public int[] getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(int[] isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus;
    }

    public int[] getLive() {
        return live;
    }

    public void setLive(int[] live) {
        this.live = live;
    }

    public int[] getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(int[] upcoming) {
        this.upcoming = upcoming;
    }

    public int getSpectators() {
        return spectators;
    }

    public void setSpectators(int spectators) {
        this.spectators = spectators;
    }
}

