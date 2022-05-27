package com.lowellzhao.lnovel.entity.bo;

import lombok.Data;

/**
 *
 *
 * @author lowellzhao
 * @date 2022/5/26
 */
@Data
public class RuleBo {

    /**
     * 分类列表页 url
     */
    private String bookListUrl;
    /**
     * 爬虫源小说id 正则
     */
    private String bookIdPatten;
    /**
     * 小说详情 url
     */
    private String bookDetailUrl;
    /**
     * 小说名称 正则
     */
    private String bookNamePatten;
    /**
     * 作者名称 正则
     */
    private String authorNamePatten;
    /**
     * 小说简介开始
     */
    private String descStart;
    /**
     * 小说简介结束
     */
    private String descEnd;
    /**
     * 章节id 正则
     */
    private String indexIdPatten;
    /**
     * 章节名称 正则
     */
    private String indexNamePatten;
    /**
     * 小说内容 url
     */
    private String bookContentUrl;
    /**
     * 小说内容开始
     */
    private String contentStart;
    /**
     * 小说内容结束
     */
    private String contentEnd;
    /**
     * 小说下一页 正则
     */
    private String nextPagePatten;
    /**
     * 小说封面 正则
     */
    private String picUrlPatten;
    /**
     * 目录开始
     */
    private String bookIndexStart;
    /**
     * 分类页 url
     */
    private String categoryUrl;
    /**
     * 分类页分类id 正则
     */
    private String categoryIdPatten;
    /**
     * 分类页分类id 正则
     */
    private String categoryNamePatten;
}
