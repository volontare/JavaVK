package ru.netology.domain;

public class PostSource {

    private String type; // тип источника. Возможные значения:
                         // vk — запись создана через основной интерфейс сайта (http://vk.com/);
                         // widget — запись создана через виджет на стороннем сайте;
                         // api — запись создана приложением через API;
                         // rss— запись создана посредством импорта RSS-ленты со стороннего сайта;
                         // sms — запись создана посредством отправки SMS-сообщения на специальный номер

    private String platform; //название платформы, если оно доступно. Возможные значения:
                             // android;
                             // iphone;
                             // wphone

    private  String data; // тип действия (только для type = vk или widget). Возможные значения:
                          // profile_activity — изменение статуса под именем пользователя (для type = vk);
                          // profile_photo — изменение профильной фотографии пользователя (для type = vk);
                          // comments — виджет комментариев (для type = widget);
                          // like — виджет «Мне нравится» (для type = widget);
                          // poll — виджет опросов (для type = widget)

    private String url; // URL ресурса, с которого была опубликована запись

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
