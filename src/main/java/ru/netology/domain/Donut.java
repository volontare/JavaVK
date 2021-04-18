package ru.netology.domain;

public class Donut {
    private boolean isDonut; // запись доступна только платным подписчикам VK Donut
    private int paidDuration; // время,в течение которого запись будет доступна только платным подписчикам VK Donut
    private PlaceHolder placeholder; // заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи
    private boolean canPublishFreeCopy; // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String editMode; // информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
                             // all — всю информацию о VK Donut; duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut


    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public PlaceHolder getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(PlaceHolder placeholder) {
        this.placeholder = placeholder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
