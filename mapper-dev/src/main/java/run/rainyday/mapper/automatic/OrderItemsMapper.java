package run.rainyday.mapper.automatic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import run.rainyday.module.OrderItems;
import run.rainyday.module.OrderItemsExample;

public interface OrderItemsMapper {
    long countByExample(OrderItemsExample example);

    int deleteByExample(OrderItemsExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderItems record);

    int insertSelective(OrderItems record);

    List<OrderItems> selectByExample(OrderItemsExample example);

    OrderItems selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderItems record, @Param("example") OrderItemsExample example);

    int updateByExample(@Param("record") OrderItems record, @Param("example") OrderItemsExample example);

    int updateByPrimaryKeySelective(OrderItems record);

    int updateByPrimaryKey(OrderItems record);
}