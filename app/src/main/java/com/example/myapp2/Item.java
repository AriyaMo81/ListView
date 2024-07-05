package com.example.myapp2;

public class Item {
    private final String imgAvatar;
    private final String txtName;
    private final String txtDate;
    private final String txtMessage;

    public Item(String imgAvatar, String txtName, String txtDate, String txtMessage) {
        this.imgAvatar = imgAvatar;
        this.txtName = txtName;
        this.txtDate = txtDate;
        this.txtMessage = txtMessage;
    }

    public String getImgAvatar() {
        return imgAvatar;
    }

    public String getTxtName() {
        return txtName;
    }

    public String getTxtDate() {
        return txtDate;
    }

    public String getTxtMessage() {
        return txtMessage;
    }

}
