package com.synchro.util;

import java.util.Calendar;

/**
 * Representation of a news article, based on the information obtained parsed
 * from an RSS or an Atom feed.
 *
 * @author Huy Vuong
 */
public class Article
{
    /**
     * Constructs a representation of a news article.
     *
     * @param title          title of the article
     * @param content        content of the article
     * @param imageUrl       URL of the image to represent this article by
     * @param feedName       name of the feed containing this article
     * @param author         name of the author of this article
     * @param publishingTime publishing time of the article
     * @param articleUrl     URL linking to the original article on the web
     */
    public Article(String title, String content, String imageUrl,
                   String feedName, String author, Calendar publishingTime,
                   String articleUrl)
    {
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
        this.feedName = feedName;
        this.author = author;
        this.publishingTime = publishingTime;
        this.articleUrl = articleUrl;
    }

    /**
     * Returns the title of the article.
     *
     * @return title of the article
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the content of the article.
     *
     * @return content of the article
     */
    public String getContent()
    {
        return content;
    }

    /**
     * Returns the URL of the image to represent this article by.
     *
     * @return URL of the image to represent this article by
     */
    public String getImageUrl()
    {
        return imageUrl;
    }

    /**
     * Returns the name of the feed containing this article.
     *
     * @return name of the feed containing this article
     */
    public String getFeedName()
    {
        return feedName;
    }

    /**
     * Returns the name of the author of this article.
     *
     * @return name of the author of this article
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Returns the publishing time of the article.
     *
     * @return publishing time of the article
     */
    public Calendar getPublishingTime()
    {
        return publishingTime;
    }

    /**
     * Returns the URL linking to the original article on the web.
     *
     * @return URL linking to the original article on the web
     */
    public String getArticleUrl()
    {
        return articleUrl;
    }

    /* Title of the article. */
    private String title;

    /* Content of the article. */
    private String content;

    /* URL to an image to represent this article by. */
    private String imageUrl;

    /* Name of the feed containing this article. */
    private String feedName;

    /* Name of the author of this article. */
    private String author;

    /* Publishing time of the article. */
    private Calendar publishingTime;

    /* URL linking to the original article on the web. */
    private String articleUrl;
}
