package zjhr.com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zjhr.com.pojo.ExpenseZj;
import zjhr.com.pojo.ExpenseZjExample;

public interface ExpenseZjMapper {
    int countByExample(ExpenseZjExample example);

    int deleteByExample(ExpenseZjExample example);

    int deleteByPrimaryKey(String bxid);

    int insert(ExpenseZj record);

    int insertSelective(ExpenseZj record);

    List<ExpenseZj> selectByExample(ExpenseZjExample example);

    ExpenseZj selectByPrimaryKey(String bxid);

    int updateByExampleSelective(@Param("record") ExpenseZj record, @Param("example") ExpenseZjExample example);

    int updateByExample(@Param("record") ExpenseZj record, @Param("example") ExpenseZjExample example);

    int updateByPrimaryKeySelective(ExpenseZj record);

    int updateByPrimaryKey(ExpenseZj record);
}