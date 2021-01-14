package run.rainyday.mapper.automatic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import run.rainyday.module.ItemsParam;
import run.rainyday.module.ItemsParamExample;

public interface ItemsParamMapper {
    long countByExample(ItemsParamExample example);

    int deleteByExample(ItemsParamExample example);

    int deleteByPrimaryKey(String id);

    int insert(ItemsParam record);

    int insertSelective(ItemsParam record);

    List<ItemsParam> selectByExample(ItemsParamExample example);

    ItemsParam selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ItemsParam record, @Param("example") ItemsParamExample example);

    int updateByExample(@Param("record") ItemsParam record, @Param("example") ItemsParamExample example);

    int updateByPrimaryKeySelective(ItemsParam record);

    int updateByPrimaryKey(ItemsParam record);
}