package com.ufo.service;

import com.ufo.entity.GridResult;
import com.ufo.entity.MenuInfoEntity;
import com.ufo.vo.MenuInfoVO;
import com.ufo.vo.MenuTreeInfoVO;

import java.util.List;

/**
 * Created by frinder6 on 2016/11/3.
 */
public interface MenuService {

    List<MenuInfoVO> selectMenu(Long pid);

    List<MenuTreeInfoVO> selectTree(Long pid);

    int selectPageCount(MenuInfoEntity entity);

    GridResult selectPage(MenuInfoEntity entity);

    MenuInfoEntity findById(Long id);

    Long insert(MenuInfoEntity record);

    void update(MenuInfoEntity record);

    void delete(Long id);

}
