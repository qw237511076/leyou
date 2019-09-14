package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Administrator
 * @date 2019/9/6
 */
public interface BrandMapper extends Mapper<Brand> {
    /**
     *
     * @param cid
     * @param bid
     */
    @Insert("insert into tb_category_brand (category_id ,brand_id) values(#{cid},#{bid})")
    void insertCategoryAndBrand(
            @Param("cid") Long cid,
            @Param("bid") Long bid);

    @Select("select * from tb_brand a INNER JOIN tb_category_brand b on a.id=b.brand_id where b.category_id=#{cid}")
    List<Brand> selectBrandsByCid(Long cid);
}
