package com.synchro.util;

import java.util.List;

/**
 * Representation of a news feed, based on information parsed from an RSS or
 * Atom feed.
 *
 * @author Huy Vuong
 */
public class Feed
{
    /**
     * Constructs a representation of a news feed.
     *
     * @param title       title of the feed
     * @param iconUrl     URL linking to an image to represent this feed by
     * @param homepageUrl URL linking to the homepage of this feed
     * @param articles    the list of all articles within this feed
     * @param feedUrl     URL linking to the original XML representing this feed
     */
    public Feed(String title, String iconUrl, String homepageUrl,
                List<Article> articles, String feedUrl)
    {
        this.title = title;
        this.iconUrl = iconUrl;
        this.homepageUrl = homepageUrl;
        this.articles = articles;
        this.feedUrl = feedUrl;
    }

    /**
     * Returns the title of the feed.
     *
     * @return title of the feed
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the URL linking to an image to represent this feed by.
     *
     * @return URL linking to an image to represent this feed by
     */
    public String getIconUrl()
    {
        return iconUrl;
    }

    /**
     * Returns the URL linking to the homepage of this feed.
     *
     * @return URL linking to the homepage of this feed
     */
    public String getHomepageUrl()
    {
        return homepageUrl;
    }

    /**
     * Returns the list of all articles within this feed.
     *
     * @return list of all articles within this feed
     */
    public List<Article> getArticles()
    {
        return articles;
    }

    /**
     * Returns the URL linking to the original XML representing this feed.
     *
     * @return URL linking to the original XML representing this feed
     */
    public String getFeedUrl()
    {
        return feedUrl;
    }

    /* Title of the feed. */
    protected String title;

    /* URL linking to an image to represent this feed by. */
    protected String iconUrl;

    /* URL linking to the homepage of this feed. */
    protected String homepageUrl;

    /* List of all articles within this feed. */
    protected List<Article> articles;

    /* URL linking to the original XML representing this feed. */
    protected String feedUrl;
}
