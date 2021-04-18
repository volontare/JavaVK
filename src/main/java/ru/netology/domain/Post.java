package ru.netology.domain;

public class Post {
    private int id; //идентификатор записи.
    private int ownerId; //идентификатор владельца стены, на которой размещена запись
    private int fromId; //идентификатор автора записи (от чьего имени опубликована запись)
    private int createdBy; //идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
    private int date; //время публикации записи в формате unixtime
    private String text; //текст записи
    private int replayOwnerId; //идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replayPostId; //идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly; //1, если запись была создана с опцией «Только для друзей»
    private CommentsInfo commentsInfo; //информация о комментариях к записи
    private Copyright copyright; //источник материала
    private LikesInfo likesInfo; //информация о лайках к записи
    private RepostsInfo repostsInfo; //информация о репостах записи («Рассказать друзьям»)
    private ViewsInfo viewsInfo; //информация о просмотрах записи
    private String postType; //	тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    private PostSource postSource; //информация о способе размещения записи
    private Geo geo; //информация о местоположении
    private int singerId; //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int canPin; //информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может)
    private int canDelete; //информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может)
    private int canEdit; //информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может)
    private int isPined; //информация о том, что запись закреплена
    private int markedAsAds; //	информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет)
    private boolean isFavorite; //true, если объект добавлен в закладки у текущего пользователя
    private Donut donut; //информация о записи VK Donut
    private int postponedId; //идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
}
