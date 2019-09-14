package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/9/6
 */
public interface CategoryService {

    public List<Category> queryCategoriesByPid(Long pid);
    public List<String> queryNamesByIds(List<Long> ids);
}
