package cn.wsjiu.nineSite.entity;

import cn.wsjiu.nineSite.Utils;

public class Article {
    String articleId;
    String content;
    String title;
    String date;
    String category;
    String userId;
    String summary;//摘言
    String userName;
    int upNum;//点赞数
    int readNum;//阅读量

    public void filter(){
        content= Utils.datafilter(content);
        title= Utils.datafilter(title);
        category= Utils.datafilter(category);
        summary= Utils.datafilter(summary);
    }
    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUpNum() {
        return upNum;
    }

    public void setUpNum(int upNum) {
        this.upNum = upNum;
    }

    public int getReadNum() {
        return readNum;
    }

    public void setReadNum(int readNum) {
        this.readNum = readNum;
    }

    @Override
    public String toString() {
        return articleId + "&&" +
                title + "&&" +
                summary + "&&" +
                date + "&&" +
                category + "&&" +
                upNum + "&&" +
                readNum+ "&&" + userName;
    }
}
