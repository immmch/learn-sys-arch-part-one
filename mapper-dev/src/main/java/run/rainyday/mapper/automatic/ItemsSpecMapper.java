package run.rainyday.mapper.automatic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import run.rainyday.module.ItemsSpec;
import run.rainyday.module.ItemsSpecExample;

public interface ItemsSpecMapper {
    long countByExample(ItemsSpecExample example);

    int deleteByExample(ItemsSpecExample example);

    int deleteByPrimaryKey(String id);

    int insert(ItemsSpec record);

    int insertSelective(ItemsSpec record);

    List<ItemsSpec> selectByExample(ItemsSpecExample example);

    ItemsSpec selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemsSpec record, @Param("example") ItemsSpecExample example);

    int updateByExample(@Param("record") ItemsSpec record, @Param("example") ItemsSpecExample example);

    int updateByPrimaryKeySelective(ItemsSpec record);

    int updateByPrimaryKey(ItemsSpec record);
}